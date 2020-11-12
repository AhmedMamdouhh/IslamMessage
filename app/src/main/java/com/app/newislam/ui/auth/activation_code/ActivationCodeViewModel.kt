package com.app.newislam.ui.auth.activation_code

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.app.newislam.repository.auth.ActivationCodeRepository
import org.koin.core.inject

class ActivationCodeViewModel : BaseViewModel() {

    val activationCodeRepository:ActivationCodeRepository by inject()
    private var observeSuccess = MutableLiveData<Boolean>()

//    fun onVerifyCodeClicked(forgetPasswordRequest: ForgetPasswordRequest) {
//        if (validateForgotPassword(forgetPasswordRequest.email))
////            getRepositoryData(forgetPasswordRequest)
//    }

    private fun validateForgotPassword(email: String): Boolean {
        var isValid = true
        if (Validation.isNullOrEmpty(email)) {
            observeError.value = application.getString(R.string.error_login_email_empty)
            isValid = false
        }
        return isValid
    }

//    fun getRepositoryData(forgetPasswordRequest: ForgetPasswordRequest) {
//        responseManager.loading()
//        disposable.add(
//                forgerPasswordRepository.forgetPassword(forgetPasswordRequest).subscribe({ data ->
//                    if (data == null) responseManager.failed("Error")
//                    else {
//                        responseManager.success(data.message)
//                        responseManager.authenticated(data.data ?: user)
//                        observeSuccess.value = true
//                    }
//                    responseManager.hideLoading()
//                }, {
//                    responseManager.hideLoading()
//                    responseManager.failed(it.message)
//                })
//        )
//    }
//
//    fun onCloseClicked() {
//        observeCloseClick.value = true
//    }

}