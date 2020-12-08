package com.app.newislam.model.entities.home

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class Events  : BaseObservable() {

    @get:Bindable
    var eventImage: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.eventImage)
        }

    @get:Bindable
    var eventTime: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.eventTime)
        }

    @get:Bindable
    var eventTitle: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.eventTitle)
        }

    @get:Bindable
    var eventLocation: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.eventLocation)
        }
}