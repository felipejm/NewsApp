package com.bonial.features

import com.bonial.features.articles.articlesModule
import org.koin.core.context.startKoin

object KoinModules{

    fun initialize() {
        startKoin {
            modules(articlesModule)
        }
    }
}