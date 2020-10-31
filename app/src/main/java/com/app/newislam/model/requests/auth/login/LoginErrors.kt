package com.app.newislam.model.requests.auth.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class LoginErrors : BaseObservable() {

    @get:Bindable
    var emailError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.emailError)
        }

    @get:Bindable
    var passwordError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.passwordError)
        }
}
