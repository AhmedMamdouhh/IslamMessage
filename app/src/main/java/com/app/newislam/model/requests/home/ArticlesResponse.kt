package com.app.newislam.model.requests.home

import com.google.gson.annotations.SerializedName

data class ArticlesResponse(
    @SerializedName("pageIndex") val pageIndex: Int,
    @SerializedName("totalPages") val totalPages: Int,
    @SerializedName("items") val items: List<Articles>,
    @SerializedName("hasPreviousPage") val hasPreviousPage: Boolean,
    @SerializedName("hasNextPage") val hasNextPage: Boolean
)
data class Articles(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("summary") val summary: String
)
