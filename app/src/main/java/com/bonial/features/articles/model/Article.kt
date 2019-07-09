package com.bonial.features.articles.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Article(
    @SerializedName("source") val source: ArticlesSource? = null,
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("urlToImage") val urlImage: String,
    @SerializedName("description")  val description: String,
    @SerializedName("publishedAt")  val publishedAt: String
): Serializable