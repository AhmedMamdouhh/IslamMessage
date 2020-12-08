package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class HomeServiceChips : BaseObservable() {

    @get:Bindable
    var homeChipsName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.homeChipsName)
        }

}