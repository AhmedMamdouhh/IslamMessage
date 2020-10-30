package com.app.newislam.model.requests.auth.password

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class ForgetPasswordRequest (val passwordError: PasswordError):BaseObservable(){
    @SerializedName("email") private var _email: String=""
    var email: String
        @Bindable get() = _email
        set(value) {
            _email = value
            notifyPropertyChanged(BR.email)
        }
}