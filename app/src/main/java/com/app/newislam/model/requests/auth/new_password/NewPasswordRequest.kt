package com.app.newislam.model.requests.auth.new_password

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName


data class NewPasswordRequest constructor(val newPasswordErrors: NewPasswordErrors) : BaseObservable() {

    @get:Bindable
    @SerializedName("email")
    var newPasswordEmail: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.newPasswordEmail)
        }

    @get:Bindable
    @SerializedName("newPassword")
    var newPassword: String = ""
        set(value) {
            newPasswordErrors.newPasswordError = ""
            field = value
            notifyPropertyChanged(BR.newPassword)
        }

    @get:Bindable
    @SerializedName("confirmationToken")
    var newPasswordCode: String = ""
        set(value) {
            newPasswordErrors.newPasswordCodeError = ""
            field = value
            notifyPropertyChanged(BR.newPasswordCode)
        }

    @get:Bindable
    var confirmPassword: String = ""
        set(value) {
            newPasswordErrors.confirmPasswordError = ""
            field = value
            notifyPropertyChanged(BR.confirmPassword)
        }



}



