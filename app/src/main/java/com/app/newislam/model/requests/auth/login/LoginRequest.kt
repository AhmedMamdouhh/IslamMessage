package com.app.newislam.model.requests.auth.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

 class LoginRequest constructor( val loginErrors: LoginErrors): BaseObservable() {
    @SerializedName("email") private var _email: String=""
    @SerializedName("password") private var _password: String=""
    var email: String
        @Bindable get() = _email
        set(value) {
            _email = value
            notifyPropertyChanged(BR.email)
        }
    var password:String
        @Bindable get() = _password
        set(value) {
            _password = value
            notifyPropertyChanged(BR.password)
        }
}
