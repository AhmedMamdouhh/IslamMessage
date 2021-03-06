package com.app.newislam.ui.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event

class WelcomeViewModel : BaseViewModel() {

    private val _observeRegisterClicked = MutableLiveData<Event<Boolean>>()
    private val _observeLoginClicked = MutableLiveData<Event<Boolean>>()
    private val _observeGuestClicked = MutableLiveData<Event<Boolean>>()

    //click:
    fun onNewAccountClicked() { _observeRegisterClicked.value = Event(true) }
    fun onLoginClicked() { _observeLoginClicked.value = Event(true) }
    fun onContinueAsGuestClicked() { _observeGuestClicked.value = Event(true) }


    //getters:
    val observeLoginClicked: LiveData<Event<Boolean>>
        get() = _observeLoginClicked
    val observeRegisterClicked: LiveData<Event<Boolean>>
        get() = _observeRegisterClicked
    val observeGuestClicked: LiveData<Event<Boolean>>
        get() = _observeGuestClicked

}