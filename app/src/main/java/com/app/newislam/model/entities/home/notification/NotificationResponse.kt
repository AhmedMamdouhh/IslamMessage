package com.app.newislam.model.entities.home.notification

import com.google.gson.annotations.SerializedName

data class NotificationResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("details") val details: String,
    @SerializedName("date") val date: String
)