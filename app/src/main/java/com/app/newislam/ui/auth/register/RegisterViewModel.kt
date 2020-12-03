package com.app.newislam.ui.auth.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.repository.auth.RegisterRepository
import org.koin.core.inject

class RegisterViewModel : BaseViewModel() {

    private val registerRepository: RegisterRepository by inject()
    private val _observeLoginClicked = MutableLiveData<Event<Boolean>>()
    private val _observeSuccess = MutableLiveData<Event<String>>()


    //click:
    fun onRegisterClicked(registerRequest: RegistrationRequest) {
        if (validateRegisterRequest(registerRequest))
            getRegisterData(registerRequest)
    }
    fun onLoginClick() { _observeLoginClicked.value = Event(true) }


    private fun getRegisterData(registerRequest: RegistrationRequest) {
        responseManager.loading()

        disposable.add(
            registerRepository.createNewUser(registerRequest).subscribe({ registerData ->

                responseManager.hideLoading()

                if(registerData!=null){
                    _observeSuccess.value = Event(registerRequest.email)
                    responseManager.success(registerData.message)
                }else responseManager.noConnection()


            }, {
                responseManager.hideLoading()
                responseManager.failed(it.message)
            })
        )
    }



    //validation:
    private fun validateRegisterRequest(registerRequest: RegistrationRequest): Boolean {
        var valid = true
        //name:
        if (Validation.isNullOrEmpty(registerRequest.firstName)) {
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


    //getters:
    val observeSuccess: LiveData<Event<String>>
        get() = _observeSuccess
    val observeLoginClicked: LiveData<Event<Boolean>>
        get() = _observeLoginClicked

}