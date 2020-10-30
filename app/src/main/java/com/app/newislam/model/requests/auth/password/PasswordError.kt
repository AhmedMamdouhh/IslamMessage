package com.app.newislam.model.requests.auth.password

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR


class PasswordError :BaseObservable(){
    private var _emailError = ""
    var emailError:String
        @Bindable get() = _emailError
        set(value) {
            _emailError = value
            notifyPropertyChanged(BR.emailError)
        }
}