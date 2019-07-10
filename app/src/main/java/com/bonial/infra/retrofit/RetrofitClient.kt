package com.bonial.infra.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient(
    private val okHttpClient: OkHttpClient,
    private val gsonConverterFactory: GsonConverterFactory
) {

    fun setupRestClient(baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .build()
    }
}