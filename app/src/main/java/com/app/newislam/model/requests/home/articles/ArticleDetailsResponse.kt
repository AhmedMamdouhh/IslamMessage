package com.app.newislam.model.requests.home.articles

import com.google.gson.annotations.SerializedName

data class ArticleDetailsResponse(
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("image") val image: String,
    @SerializedName("date") val date: String="",
    @SerializedName("shortDescription") val shortDescription: String,
    @SerializedName("id") val id: Int,
    @SerializedName("hasNextPage") val hasNextPage: Boolean
)