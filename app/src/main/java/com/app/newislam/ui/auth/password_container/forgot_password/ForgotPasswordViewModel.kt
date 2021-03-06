package com.app.newislam.ui.auth.password_container.forgot_password

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordRequest
import com.app.newislam.repository.auth.ForgotPasswordRepository
import org.koin.core.inject

class ForgotPasswordViewModel : BaseViewModel() {

    private val forgotPasswordRepository: ForgotPasswordRepository by inject()
    private val _observeSuccess = MutableLiveData<Event<String>>()


    fun onForgotPasswordClicked(forgotPasswordRequest: ForgotPasswordRequest) {
        if (validateForgotPasswordEmail(forgotPasswordRequest))
            getRepositoryData(forgotPasswordRequest)
    }



    private fun getRepositoryData(forgotPasswordRequest: ForgotPasswordRequest) {
        responseManager.loading()

        disposable.add(
            forgotPasswordRepository.forgotPassword(forgotPasswordRequest)
                .subscribe({ forgotPasswordResponse ->

                    responseManager.hideLoading()


                    if (forgotPasswordResponse != null) {
                        responseManager.success(forgotPasswordResponse.message)
                        _observeSuccess.value = Event(forgotPasswordRequest.email)
                    } else responseManager.noConnection()


                }, {
                    responseManager.hideLoading()
                    responseManager.failed(it.message)
                })
        )
    }


    //validation:
    private fun validateForgotPasswordEmail(
        forgotPasswordRequest: ForgotPasswordRequest
    ): Boolean {
        if (Validation.isNullOrEmpty(forgotPasswordRequest.email)) {
            forgotPasswordRequest.forgotPasswordErrors.emailError = application.getString(R.string.error_forgot_password_empty)
            return false
        } else if (!Validation.isEmail(forgotPasswordRequest.email)) {
            forgotPasswordRequest.forgotPasswordErrors.emailError = application.getString(R.string.error_forgot_password_wrong)
            return false
        }
        return true
    }


    //getters:
    val observeSuccess: LiveData<Event<String>>
        get() = _observeSuccess

}