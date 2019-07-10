package com.bonial.infra.retrofit

import com.google.gson.GsonBuilder
import org.koin.dsl.module
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    factory { OkHttpClientFactory().create() }
    factory { GsonConverterFactory.create(GsonBuilder().create()) }
}