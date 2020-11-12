package com.app.newislam.model.requests.auth.activation_code

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class ActivationCodeErrors : BaseObservable() {

    @get:Bindable
    var emailError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.emailError)
        }

    @get:Bindable
    var confirmationTokenError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.confirmationTokenError)
        }
}
