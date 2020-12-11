package com.app.newislam.model.entities.home.services

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("country") var country: String = "",
    @SerializedName("date") val date: String = " ",
    @SerializedName("image") val image: String = " "
)