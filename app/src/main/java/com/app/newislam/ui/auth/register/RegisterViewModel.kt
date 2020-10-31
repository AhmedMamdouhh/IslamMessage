package com.app.newislam.ui.auth.register

import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.repository.auth.RegisterRepository
import org.koin.core.inject

class RegisterViewModel : BaseViewModel() {
    private val registerRepository: RegisterRepository by inject()
    val resource = MutableLiveData<Resource<User?>>()
    val navigateToLogin = MutableLiveData<Boolean>()


    //click:
    fun onRegisterClicked(registerRequest: RegistrationRequest) {
        if (validateRegisterRequest(registerRequest))
            getRegisterData(registerRequest)
    }

    fun onLoginClick() {
        navigateToLogin.value = true
    }

    fun reset() {
        navigateToLogin.value = false
    }

    private fun getRegisterData(registerRequest: RegistrationRequest) {
        responseManager.loading()
        disposable.add(
            registerRepository.createNewUser(registerRequest).subscribe({ data ->
                if (data == null) responseManager.failed("Error")
                else {
                    responseManager.success(data.message)
                }
                responseManager.hideLoading()
            }, {
                responseManager.hideLoading()
                responseManager.failed(it.message)
            })
        )
    }

    private fun validateRegisterRequest(registerRequest: RegistrationRequest): Boolean {
        var valid = true
        //name:
        if (Validation.isNullOrEmpty(registerRequest.fullName)) {
            registerRequest.registerErrors
                .fullNameError = application.getString(R.string.error_register_name_empty)
            valid = false
        }

        //email:
        if (Validation.isNullOrEmpty(registerRequest.email)) {
            registerRequest.registerErrors
                .emailError = application.getString(R.string.error_register_email_empty)
            valid = false
        } else if (!Validation.isEmail(registerRequest.email)) {
            registerRequest.registerErrors
                .emailError = application.getString(R.string.error_register_email_wrong)
            valid = false
        }

        //password:
        if (Validation.isNullOrEmpty(registerRequest.password)) {
            registerRequest.registerErrors
                .passwordError = application.getString(R.string.error_register_password_empty)
            valid = false
        } else if (!Validation.isPassword(registerRequest.password)) {
            registerRequest.registerErrors
                .passwordError = application.getString(R.string.error_register_password_wrong)
            valid = false
        }

        return valid
    }
}