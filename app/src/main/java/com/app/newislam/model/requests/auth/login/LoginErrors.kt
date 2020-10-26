package com.app.newislam.model.requests.auth.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class LoginErrors : BaseObservable() {
    private var _emailError: String = ""
    private var _passwordError: String = ""
    var emailError: String
        @Bindable get() = _emailError
        set(value) {
            _emailError = value
            notifyPropertyChanged(BR.emailError)
        }
    var passwordError: String
        @Bindable get() = _passwordError
        set(value) {
            _passwordError = value
            notifyPropertyChanged(BR.passwordError)
        }
}
