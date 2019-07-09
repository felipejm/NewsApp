package com.bonial.features.articles.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ArticlesSource(
    @SerializedName("name") val name: String
): Serializable