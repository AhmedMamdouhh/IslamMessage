package com.app.newislam.model.requests.auth.forgot_password

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR


class ForgotPasswordErrors :BaseObservable(){


    @get:Bindable
    var emailError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(com.app.newislam.BR.emailError)
        }
}