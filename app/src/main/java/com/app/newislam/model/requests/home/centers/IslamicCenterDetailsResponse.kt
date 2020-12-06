package com.app.newislam.model.requests.home.centers

import com.google.gson.annotations.SerializedName

data class IslamicCenterDetailsResponse(
    @SerializedName("addressEn") val addressEn: String,
    @SerializedName("city") val city: Any,
    @SerializedName("country") val country: Any,
    @SerializedName("email") val email: String,
    @SerializedName("facebook") val facebook: Any,
    @SerializedName("id") val id: Int,
    @SerializedName("localizedAddress") val localizedAddress: String,
    @SerializedName("localizedName") val localizedName: String,
    @SerializedName("nameEn") val nameEn: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("twitter") val twitter: Any
)