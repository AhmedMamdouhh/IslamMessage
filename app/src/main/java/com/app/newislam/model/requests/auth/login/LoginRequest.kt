package com.app.newislam.model.requests.auth.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class LoginRequest constructor(val loginErrors: LoginErrors) : BaseObservable() {

    @get:Bindable
    @SerializedName("email")
    var email: String = ""
        set(value) {
            loginErrors.emailError = ""
            field = value
            notifyPropertyChanged(BR.email)
        }

    @get:Bindable
    @SerializedName("password")
    var password: String = ""
        set(value) {
            loginErrors.passwordError = ""
            field = value
            notifyPropertyChanged(BR.password)
        }

}



