package com.app.newislam.model.requests.auth.register

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

 class RegistrationRequest constructor(val registerErrors: RegisterErrors): BaseObservable() {
    @SerializedName("email") private var _email: String=""
    @SerializedName("firstName") private var _fullName: String=""
    @SerializedName("lastName") private var _lastName: String=""
    @SerializedName("password") private var _password: String=""
    var email: String
        @Bindable get() = _email
        set(value) {
            _email = value
            notifyPropertyChanged(BR.email)
        }
     var fullName:String
     @Bindable get() = _fullName
        set(value) {
            _fullName = value
            notifyPropertyChanged(BR.fullName)
        }
    var password:String
        @Bindable get() = _password
        set(value) {
            _password = value
            notifyPropertyChanged(BR.password)
        }
}
