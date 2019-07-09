package com.bonial.features.articles.model

import com.google.gson.annotations.SerializedName

data class ArticlesResponse(
    @SerializedName("totalResults")val totalResults: Int = 0,
    @SerializedName("articles") val articles: List<Article> = arrayListOf()
)