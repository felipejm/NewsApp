package com.bonial.features.articles.model

import retrofit2.http.GET
import retrofit2.http.Query

interface ArticlesApi {

    @GET("v2/top-headlines")
    suspend fun fetchHeadLines(@Query("country") country: String,
                               @Query("pageSize") pageSize: Int,
                               @Query("page") page: Int,
                               @Query("apiKey") apiKey: String) : ArticlesResponse

}