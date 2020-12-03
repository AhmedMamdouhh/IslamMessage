package com.app.newislam.model.requests.auth.register

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

class RegisterErrors : BaseObservable() {

    @get:Bindable
    var emailError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.emailError)
        }

    @get:Bindable
    var fullNameError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.fullNameError)
        }

    @get:Bindable
    var passwordError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.passwordError)
        }
}
