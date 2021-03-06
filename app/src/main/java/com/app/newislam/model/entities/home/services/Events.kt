package com.app.newislam.model.entities.home.services

import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("address") val address: String,
    @SerializedName("lng") var lng: Double ,
    @SerializedName("lat") val date: Double,
    @SerializedName("imageFileName") val image: String = " ",
    @SerializedName("dateTime") val dateTime: String = " ",
    @SerializedName("islamicCenter") val islamicCenter: IslamicCenter
)