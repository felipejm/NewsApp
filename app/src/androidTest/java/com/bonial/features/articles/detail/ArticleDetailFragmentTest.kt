package com.bonial.features.articles.detail

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import br.com.concretesolutions.kappuccino.assertions.VisibilityAssertions.displayed
import com.bonial.ArticleHelper
import com.bonial.R
import com.bonial.features.articles.model.Article
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.test.KoinTest
import org.mockito.Mockito.mock

@RunWith(AndroidJUnit4::class)
class ArticleDetailFragmentTest: KoinTest {

    private lateinit var mockNavController: NavController

    @Before
    fun setUp(){
        mockNavController = mock(NavController::class.java)
    }

    @Test
    fun when_load_screen_should_populate_article() {
        val article = ArticleHelper.createArticle()
        launchFragment(article)

        displayed {
            allOf {
                id(R.id.title)
                text(article.title)
            }
            allOf {
                id(R.id.description)
                text(article.content)
            }
            allOf {
                id(R.id.source)
                text("From: ${article.source?.name}")
            }
        }
    }

    private fun launchFragment(article: Article) {
        val bundle = bundleOf("article" to article)
        val titleScenario =
            launchFragmentInContainer<ArticleDetailFragment>(bundle, themeResId = R.style.AppTheme)
        titleScenario.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), mockNavController)
        }
    }
}