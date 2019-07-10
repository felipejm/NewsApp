package com.bonial.features.articles

import com.bonial.BuildConfig
import com.bonial.features.articles.detail.ArticleDetailViewModel
import com.bonial.features.articles.feed.ArticlesFeedViewModel
import com.bonial.features.articles.model.Article
import com.bonial.features.articles.model.ArticlesApi
import com.bonial.features.articles.model.ArticlesRepository
import com.bonial.features.articles.model.ArticlesUseCase
import com.bonial.infra.retrofit.RetrofitClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val articlesModule = module {
    viewModel { ArticlesFeedViewModel(get()) }
    viewModel { (article: Article) ->
        ArticleDetailViewModel(article)
    }
    factory { RetrofitClient(get(), get()).setupRestClient(BuildConfig.ENDPOINT).create(ArticlesApi::class.java) }
    factory { ArticlesRepository(get()) }
    factory { ArticlesUseCase(get()) }
}