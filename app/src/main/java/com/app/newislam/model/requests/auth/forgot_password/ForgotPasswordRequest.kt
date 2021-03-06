package com.app.newislam.model.requests.auth.forgot_password

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class ForgotPasswordRequest (val forgotPasswordErrors: ForgotPasswordErrors):BaseObservable(){


    @get:Bindable
    @SerializedName("email")
    var email: String = ""
        set(value) {
            forgotPasswordErrors.emailError = ""
            field = value
            notifyPropertyChanged(BR.email)
        }
}