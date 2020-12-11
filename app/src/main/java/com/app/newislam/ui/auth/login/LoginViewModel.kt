package com.app.newislam.ui.auth.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.inject

class LoginViewModel : BaseViewModel() {
    private val loginRepository: LoginRepository by inject()

    private val _observeForgotPasswordClick = MutableLiveData<Event<Boolean>>()
    private val _observeRegisterClick = MutableLiveData<Event<Boolean>>()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()


    //click
    fun onForgotPasswordClicked() { _observeForgotPasswordClick.value = Event(true) }
    fun onRegisterClicked(){ _observeRegisterClick.value = Event(true) }
    fun onLoginClicked(loginRequest: LoginRequest) {
        if (validateLoginRequest(loginRequest)) {
            getLoginData(loginRequest)
        }
    }

    private fun getLoginData(loginRequest: LoginRequest) {
        responseManager.loading()

        disposable.add(
            loginRepository.getLoginData(loginRequest).subscribe({ loginData ->

                responseManager.hideLoading()

                if(loginData!=null){
                    responseManager.authenticated(loginData.data)
                    _observeSuccess.value = Event(true)
                }else responseManager.noConnection()


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
        } else if (!Validation.isEmail(loginRequest.email)) {
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

    //getters:
    val observeForgotPasswordClick: LiveData<Event<Boolean>>
        get() = _observeForgotPasswordClick
    val observeRegisterClick: LiveData<Event<Boolean>>
        get() = _observeRegisterClick
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess


}