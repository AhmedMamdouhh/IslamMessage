package com.app.newislam.model.entities.home.services

import com.google.gson.annotations.SerializedName

data class IslamicCenter(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("country") val country: String,
    @SerializedName("city") val city: String=" ",
    @SerializedName("image") val image: String=" "
)