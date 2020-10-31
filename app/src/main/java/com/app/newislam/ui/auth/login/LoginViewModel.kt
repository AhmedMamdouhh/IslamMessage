package com.app.newislam.ui.auth.login

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.manager.utilities.Validation
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


    //click

    fun onForgotPasswordClicked() {
        navigateToForgotPassword.value = true
    }

    fun onLoginClicked(loginRequest: LoginRequest) {
        if (validateLoginRequest(loginRequest)){
            getLoginData(loginRequest)
        }
    }

    private fun getLoginData(loginRequest: LoginRequest) {
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

    //validation:

    private fun validateLoginRequest(loginRequest: LoginRequest): Boolean {
        var valid = true

        if (Validation.isNullOrEmpty(loginRequest.email)) {
            loginRequest.loginErrors.emailError =
                application.getString(R.string.error_login_email_empty)
            valid = false
        } else if (Validation.isEmail(loginRequest.email)) {
            loginRequest.loginErrors.emailError =
                application.getString(R.string.error_login_email_valid)
            valid = false
        }
        if (Validation.isNullOrEmpty(loginRequest.password)) {
            loginRequest.loginErrors.passwordError =
                application.getString(R.string.error_login_password_empty)
            valid = false
        }

        return valid
    }

}