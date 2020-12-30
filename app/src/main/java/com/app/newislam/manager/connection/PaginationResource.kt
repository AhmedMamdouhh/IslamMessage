package com.app.newislam.manager.connection

import com.google.gson.annotations.SerializedName

 class PaginationResource<T> {
     @SerializedName("pageIndex")
     val pageIndex: Int  = 0

     @SerializedName("hasNextPage")
     val hasNextPage: Boolean = false

     @SerializedName("totalPages")
     val totalPages: Int  = 0

     @SerializedName("hasPreviousPage")
     val hasPreviousPage: Boolean  = false

     @SerializedName("items")
     val items: ArrayList<T> = arrayListOf()
 }


