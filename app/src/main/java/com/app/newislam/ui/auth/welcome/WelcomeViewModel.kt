package com.app.newislam.ui.auth.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel

class WelcomeViewModel : BaseViewModel() {

    val observeRegisterClicked = MutableLiveData<Boolean>()
    val observeLoginClicked = MutableLiveData<Boolean>()
    val observeGuestClicked = MutableLiveData<Boolean>()

    //click:
    fun onNewAccountClicked() { observeRegisterClicked.value = true }
    fun onLoginClicked() { observeLoginClicked.value = true }
    fun onContinueAsGuestClicked() { observeGuestClicked.value = true }



}