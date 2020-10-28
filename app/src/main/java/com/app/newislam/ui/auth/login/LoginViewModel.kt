package com.app.newislam.ui.auth.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginViewModel : ViewModel(), KoinComponent {
    val loginRepository: LoginRepository by inject()
    val resource  = MutableLiveData<Resource<User?>>()


    fun getLoginData(loginRequest: LoginRequest) {

    }

}