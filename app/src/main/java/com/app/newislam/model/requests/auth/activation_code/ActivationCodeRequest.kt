package com.app.newislam.model.requests.auth.activation_code

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.app.newislam.model.requests.auth.login.LoginErrors
import com.google.gson.annotations.SerializedName

data class ActivationCodeRequest constructor(val activationCodeErrors: ActivationCodeErrors) : BaseObservable() {

    @get:Bindable
    @SerializedName("email")
    var email: String = ""
        set(value) {
            activationCodeErrors.emailError = ""
            field = value
            notifyPropertyChanged(BR.email)
        }

    @get:Bindable
    @SerializedName("confirmationToken")
    var confirmationToken: String = ""
        set(value) {
            activationCodeErrors.confirmationTokenError = ""
            field = value
            notifyPropertyChanged(BR.confirmationToken)
        }

}



