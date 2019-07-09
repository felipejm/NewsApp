package com.bonial.features.articles.model

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import java.lang.RuntimeException
import java.util.*

class ArticlesUseCaseTest {

    private lateinit var useCase: ArticlesUseCase
    private lateinit var repository: ArticlesRepository

    @Before
    fun setUp() {
        repository = mock()
        useCase = ArticlesUseCase(repository)
    }

    @Test
    fun `when call fetchHeadLines should call api`() {
        //Given
        val country = "BR"
        Locale.setDefault(Locale("", country))
        val page = 1
        val pageCount = 2

        runBlocking {
            //Then
            useCase.fetchHeadLines(page = page, pageSize = pageCount)

            //Should
            verify(repository).fetchHeadLines(
                country = country,
                page = page,
                pageSize = pageCount
            )
        }
    }

    @Test(expected = RuntimeException::class)
    fun `when call fetchHeadLines should throw exception`() {
        //Given
        val country = "BR"
        Locale.setDefault(Locale("", country))
        val page = 1
        val pageCount = 2

        runBlocking {
            whenever(
                repository.fetchHeadLines(
                    country = country,
                    page = page,
                    pageSize = pageCount
                )
            ).thenThrow(RuntimeException())

            //Then
            useCase.fetchHeadLines(page = page, pageSize = pageCount)
        }
    }
}