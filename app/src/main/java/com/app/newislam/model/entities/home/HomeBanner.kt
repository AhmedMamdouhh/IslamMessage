package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class HomeBanner : BaseObservable() {

    @get:Bindable
    var homeBannerTitle: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerTitle)
        }

    @get:Bindable
    var homeBannerDescription: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeBannerDescription)
        }
}