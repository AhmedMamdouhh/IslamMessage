package com.app.newislam.model.requests.auth.register

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.app.newislam.BR
import com.google.gson.annotations.SerializedName

 class RegisterRequest constructor(val registerErrors: RegisterErrors): BaseObservable() {

     @get:Bindable
     @SerializedName("email")
     var email: String = ""
         set(value) {
             registerErrors.emailError = ""
             field = value
             notifyPropertyChanged(BR.email)
         }

     @get:Bindable
     @SerializedName("password")
     var password: String = ""
         set(value) {
             registerErrors.passwordError = ""
             field = value
             notifyPropertyChanged(BR.password)
         }

     @get:Bindable
     @SerializedName("firstName")
     var firstName: String = ""
         set(value) {
             registerErrors.fullNameError = ""
             field = value
             notifyPropertyChanged(BR.firstName)
         }

     @get:Bindable
     @SerializedName("lastName")
     var lastName: String = ""
         set(value) {
             registerErrors.fullNameError = ""
             field = value
             notifyPropertyChanged(BR.lastName)
         }

 }
