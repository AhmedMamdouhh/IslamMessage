package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class CategoryItem  : BaseObservable() {

    @get:Bindable
    var categoryImage: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.categoryImage)
        }

    @get:Bindable
    var categoryTime: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.categoryTime)
        }

    @get:Bindable
    var categoryTitle: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.categoryTitle)
        }

    @get:Bindable
    var categoryLocation: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.categoryLocation)
        }
}