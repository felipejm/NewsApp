package com.bonial.features.articles.model

import com.bonial.BuildConfig

class ArticlesRepository(private val api: ArticlesApi){

    suspend fun fetchHeadLines(country: String, page: Int, pageSize: Int): ArticlesResponse {
        return api.fetchHeadLines(country= country,
            page = page,
            pageSize = pageSize,
            apiKey = BuildConfig.API_KEY)
    }
}