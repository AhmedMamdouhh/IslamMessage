package com.app.newislam.ui.auth.welcome

import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel

class WelcomeViewModel : BaseViewModel() {

    val navigateToRegister = MutableLiveData<Boolean>()
    val navigateToLoggin = MutableLiveData<Boolean>()
    val navigateToHome = MutableLiveData<Boolean>()
    fun createNewAccount() {
        navigateToRegister.value = true
    }

    fun loginUser() {
        navigateToLoggin.value = true
    }

    fun continueAsGuest() {
        navigateToHome.value = true
    }

     fun reset() {
        super.onCleared()
        navigateToRegister.value = false
        navigateToLoggin.value = false
        navigateToHome.value = false
    }
}