package com.bonial.features.articles.feed

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import br.com.concretesolutions.kappuccino.actions.ClickActions.click
import br.com.concretesolutions.kappuccino.assertions.VisibilityAssertions.displayed
import br.com.concretesolutions.kappuccino.assertions.VisibilityAssertions.notDisplayed
import br.com.concretesolutions.kappuccino.custom.recyclerView.RecyclerViewInteractions.recyclerView
import com.bonial.R
import com.bonial.RecyclerViewCheckSpanSize
import com.bonial.features.articles.model.ArticlesApi
import com.bonial.infra.retrofit.RetrofitClient
import com.jakewharton.espresso.OkHttp3IdlingResource
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.mockito.Mockito.mock
import kotlinx.coroutines.test.runBlockingTest
import okhttp3.OkHttpClient

@RunWith(AndroidJUnit4::class)
class ArticlesFeedFragmentTest : KoinTest {

    private val mockServerPort = 8080
    private val mockServer = MockWebServer()

    private lateinit var mockNavController: NavController

    private val module = module {
        factory<OkHttpClient>(override = true) {
            val okhttpClient = OkHttpClient.Builder().build()
            IdlingRegistry.getInstance().register(OkHttp3IdlingResource.create("OkHttp", okhttpClient))
            okhttpClient
        }
        single<ArticlesApi>(override = true) {
            RetrofitClient(get(), get()).setupRestClient("http://localhost:$mockServerPort")
                .create(ArticlesApi::class.java)
        }
    }

    @Before
    fun setUp() {
        loadKoinModules(module)
        mockNavController = mock(NavController::class.java)
        mockServer.start(mockServerPort)
    }

    @After
    fun tearDown(){
        mockServer.shutdown()
    }

    @Test
    fun when_load_check_list_size() = runBlockingTest {
        mockServer.enqueue(ArticleRequestHelper.createSuccessResponse())
        launchFragment()

        recyclerView(R.id.recycler_view) {
            sizeIs(7)
        }
    }

    @Test
    fun when_load_should_show_error_view() = runBlockingTest {
        mockServer.enqueue(MockResponse().setResponseCode(500))
        launchFragment()

        notDisplayed {
            id(R.id.recycler_view)
        }

        displayed {
            id(R.id.error_view)
        }
    }

    @Test
    fun when_load_should_try_again() = runBlockingTest{
        mockServer.enqueue(MockResponse().setResponseCode(500))
        mockServer.enqueue(ArticleRequestHelper.createSuccessResponse())
        launchFragment()

        click{
            id(R.id.try_again_button)
        }

        notDisplayed {
            id(R.id.error_view)
        }
    }

    @Test
    fun when_load_check_first_item_is_populated_correctly() = runBlockingTest {
        mockServer.enqueue(ArticleRequestHelper.createSuccessResponse())
        launchFragment()

        recyclerView(R.id.recycler_view) {
            atPosition(0) {
                displayed {
                    allOf {
                        id(R.id.title)
                        text("Kawhi rejected LeBron and used the Lakers for leverage – Pablo Torre | High Noon - ESPN")
                    }
                    allOf {
                        id(R.id.description)
                        text("Pablo Torre weighs in on Kawhi Leonard’s secret moves during free agency that resulted in Paul George being traded from the Oklahoma City Thunder to the LA C...")
                    }

                    allOf {
                        id(R.id.source)
                        text("Youtube.com")
                    }
                }
            }
        }
    }

    @Test
    fun when_scroll_to_end_should_load_more() = runBlockingTest {
        mockServer.enqueue(ArticleRequestHelper.createSuccessResponse())
        mockServer.enqueue(ArticleRequestHelper.createNextPageRequest())
        launchFragment()

        recyclerView(R.id.recycler_view) {
            sizeIs(7)
            atPosition(6) {
                scroll()
            }
            sizeIs(20)
        }
    }

    @Test
    fun when_load_check_span_size() = runBlockingTest{
        mockServer.enqueue(ArticleRequestHelper.createSuccessResponse())
        launchFragment()

        (0..7).forEach { position ->
            val spanCount = if (position % 7 == 0) 2 else 1
            onView(withId(R.id.recycler_view)).check(
                RecyclerViewCheckSpanSize(
                    position = position,
                    spanCount = spanCount
                )
            )
        }
    }

    private fun launchFragment() {
        val titleScenario =
            launchFragmentInContainer<ArticlesFeedFragment>(themeResId = R.style.AppTheme)
        titleScenario.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), mockNavController)
        }
    }
}