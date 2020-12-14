package com.app.newislam.model.entities.home.im_services

import com.google.gson.annotations.SerializedName

data class IslamMessageServicesResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("details") val details: String
)