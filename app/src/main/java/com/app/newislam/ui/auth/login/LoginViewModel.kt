package com.app.newislam.ui.auth.login

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginViewModel : BaseViewModel(), KoinComponent {
    val loginRepository: LoginRepository by inject()
    val user: User by inject()
    val resource = MutableLiveData<Resource<User?>>()
    val navigateToForgotPassword = MutableLiveData<Boolean>()


    fun getLoginData(loginRequest: LoginRequest) {
        if (loginRequest.email.isNullOrBlank()){
            loginRequest.loginErrors.emailError = "dddd"
        }else{
            responseManager.loading()
            disposable.add(
                loginRepository.getLoginData(loginRequest).subscribe({ data ->
                    if (data == null) responseManager.failed("Error")
                    else {
                        responseManager.success(data.message)
                        responseManager.authenticated(data.data ?: user)
                    }
                    responseManager.hideLoading()
                }, {
                    responseManager.hideLoading()
                    responseManager.failed(it.message)
                })
            )
        }

    }

    fun goToForgotPassword(){
        navigateToForgotPassword.value = true
    }
}