package com.bonial.features

import com.bonial.features.articles.articlesModule
import com.bonial.infra.retrofit.apiModule
import org.koin.core.context.startKoin

object KoinModules{

    fun initialize() {
        startKoin {
            modules(arrayListOf(articlesModule, apiModule))
        }
    }
}