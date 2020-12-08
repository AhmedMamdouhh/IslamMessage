package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class News  : BaseObservable() {

    @get:Bindable
    var newsImage: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.newsImage)
        }

    @get:Bindable
    var newsTime: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.newsTime)
        }

    @get:Bindable
    var newsTitle: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.newsTitle)
        }

}