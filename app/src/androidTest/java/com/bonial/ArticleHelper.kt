package com.bonial

import com.bonial.features.articles.model.Article
import com.bonial.features.articles.model.ArticlesSource
import com.google.gson.annotations.SerializedName

object ArticleHelper {

    fun createArticle(
        source: ArticlesSource? = ArticlesSource("source name"),
        title: String = "title",
        content: String = "content",
        urlImage: String = "image",
        description: String = "description",
        publishedAt: String = "2019-07-08T18:53:58Z"
    ) = Article(source, title, content, urlImage, description, publishedAt)
}