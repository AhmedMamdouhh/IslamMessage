package com.app.newislam.ui.auth.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.newislam.model.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginViewModel : ViewModel(), KoinComponent {
    val loginRepository: LoginRepository by inject()
    val resource  = MutableLiveData<Resource<User?>>()


    fun getLoginData(loginRequest: LoginRequest) {
        resource.value = Resource.loading()
        loginRepository.composit.add(loginRepository.getLoginData(loginRequest).subscribe({
            resource.value = Resource.success(it.message,it.data)
        }, {
            resource.value = Resource.failed(it.message)
        }))
    }

}