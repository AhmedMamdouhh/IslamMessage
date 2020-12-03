package com.app.newislam.ui.auth.forgot_password

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.forgot_password.ForgetPasswordRequest
import com.app.newislam.repository.auth.ForgerPasswordRepository
import org.koin.core.inject

class ForgotPasswordViewModel : BaseViewModel() {
    private val forgerPasswordRepository: ForgerPasswordRepository by inject()
    private val _observeCloseClick = MutableLiveData<Event<Boolean>>()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()

    fun forgetPassword(forgetPasswordRequest: ForgetPasswordRequest) {
        if (validateForgotPassword(forgetPasswordRequest))
            getRepositoryData(forgetPasswordRequest)
    }

    private fun validateForgotPassword(forgetPasswordRequest: ForgetPasswordRequest): Boolean {
        var isValid = true
        if (Validation.isNullOrEmpty(forgetPasswordRequest.email)) {
            forgetPasswordRequest.forgotPasswordErrors.emailError = application.getString(R.string.error_login_email_empty)
            isValid = false
        }
        return isValid
    }
    fun onCloseClicked() { _observeCloseClick.value = Event(true) }

    private fun getRepositoryData(forgetPasswordRequest: ForgetPasswordRequest) {
        responseManager.loading()

        disposable.add(
                forgerPasswordRepository.forgetPassword(forgetPasswordRequest).subscribe({ data ->
                    responseManager.hideLoading()

                    if(data!=null) {
                        responseManager.success(data.message)
                        _observeSuccess.value = Event(true)
                    }else responseManager.noConnection()


                }, {
                    responseManager.hideLoading()
                    responseManager.failed(it.message)
                })
        )
    }



    //getters
    val observeForgotPasswordClick: LiveData<Event<Boolean>>
        get() = _observeCloseClick
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess
}