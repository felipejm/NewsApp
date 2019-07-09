package com.bonial.features.articles.feed

import com.bonial.features.articles.model.Article

sealed class Command{
    object ShowLoading: Command()
    object ShowErrorView: Command()
    data class ShowArticles(val articles: List<Article>): Command()
}