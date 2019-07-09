package com.bonial.features.articles.model

import java.util.*

class ArticlesUseCase(private val repository: ArticlesRepository){

    suspend fun fetchHeadLines(page: Int = 0, pageSize: Int = 21): ArticlesResponse {
        val country = Locale.getDefault().country
        return repository.fetchHeadLines(country=country, page=page, pageSize=pageSize)
    }
}