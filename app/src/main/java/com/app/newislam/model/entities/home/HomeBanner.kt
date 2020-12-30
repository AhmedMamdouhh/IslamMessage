package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class HomeBanner : BaseObservable() {

    @SerializedName("title")
    @get:Bindable
    var homeBannerTitle: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerTitle)
        }

    @SerializedName("description")
    @get:Bindable
    var homeBannerDescription: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerDescription)
        }


    @SerializedName("image")
    @get:Bindable
    var homeBannerImage: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerImage)
        }

    @SerializedName("redirectionUrl")
    @get:Bindable
    var homeBannerRedirectionUrl: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerRedirectionUrl)
        }

    @SerializedName("id")
    @get:Bindable
    var homeBannerId: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerId)
        }
}