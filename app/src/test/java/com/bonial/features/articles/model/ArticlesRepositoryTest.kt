package com.bonial.features.articles.model

import com.bonial.BuildConfig
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import java.lang.RuntimeException

class ArticlesRepositoryTest {

    private lateinit var repository: ArticlesRepository
    private lateinit var api: ArticlesApi

    @Before
    fun setUp() {
        api = mock()
        repository = ArticlesRepository(api)
    }

    @Test
    fun `when call fetchHeadLines should call api`() {
        //Given
        val apiKey = BuildConfig.API_KEY
        val country = "br"
        val page = 1
        val pageCount = 2

        runBlocking {
            //Then
            repository.fetchHeadLines(country = country, page = page, pageSize = pageCount)

            //Should
            verify(api).fetchHeadLines(
                country = country,
                page = page,
                pageSize = pageCount,
                apiKey = apiKey
            )
        }
    }

    @Test(expected = RuntimeException::class)
    fun `when call fetchHeadLines should throw exception`() {
        //Given
        val apiKey = BuildConfig.API_KEY
        val country = "br"
        val page = 1
        val pageCount = 2

        runBlocking {
            whenever(api.fetchHeadLines(country = country,
                page = page,
                pageSize = pageCount,
                apiKey = apiKey)).thenThrow(RuntimeException())

            //Then
            repository.fetchHeadLines(country = country, page = page, pageSize = pageCount)
        }
    }
}