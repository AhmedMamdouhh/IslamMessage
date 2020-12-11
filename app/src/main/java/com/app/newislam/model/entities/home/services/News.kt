package com.app.newislam.model.entities.home.services

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

data class News(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("summary") val summary: String,
    @SerializedName("image") val image: String = " "
)