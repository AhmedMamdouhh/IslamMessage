package com.app.newislam.model.requests.auth.new_password

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR

class NewPasswordErrors : BaseObservable() {

    @get:Bindable
    var newPasswordCodeError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.newPasswordCodeError)
        }

    @get:Bindable
    var newPasswordError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.newPasswordError)
        }

    @get:Bindable
    var confirmPasswordError: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.confirmPasswordError)
        }

}
