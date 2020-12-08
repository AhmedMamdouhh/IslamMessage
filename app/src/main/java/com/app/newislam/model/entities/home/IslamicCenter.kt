package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class IslamicCenter  : BaseObservable() {

    @get:Bindable
    var islamicCenterImage: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.islamicCenterImage)
        }



    @get:Bindable
    var islamicCenterTitle: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.islamicCenterTitle)
        }


    @get:Bindable
    var islamicCenterLocation: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.islamicCenterLocation)
        }
}