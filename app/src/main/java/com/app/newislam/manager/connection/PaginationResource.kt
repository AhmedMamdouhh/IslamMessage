package com.app.newislam.manager.connection

import com.google.gson.annotations.SerializedName

data class PaginationResource<T>(
    @SerializedName("pageIndex")
    val pageIndex : Int ,
    @SerializedName("hasNextPage")
    val hasNextPage : Boolean ,
    @SerializedName("totalPages")
    val totalPages : Int ,
    @SerializedName("hasPreviousPage")
    val hasPreviousPage : Boolean ,
    @SerializedName("items")
    val items: ArrayList<T>
)


