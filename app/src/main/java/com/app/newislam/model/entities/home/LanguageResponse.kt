package com.app.newislam.model.entities.home

import com.google.gson.annotations.SerializedName

data class LanguageResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val languageName: String,
    @SerializedName("iso") val iso: String
)