package com.app.newislam.ui.auth.forgot_password

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.app.newislam.repository.auth.ForgerPasswordRepository
import org.koin.core.inject

class ForgotPasswordViewModel : BaseViewModel() {
    val forgerPasswordRepository: ForgerPasswordRepository by inject()
    val user: User by inject()
    val resource = MutableLiveData<Resource<User?>>()
    var observeCloseClick = MutableLiveData<Boolean>()
    var observSucces = MutableLiveData<Boolean>()

    fun forgetPassword(forgetPasswordRequest: ForgetPasswordRequest) {
        if (validateForgotPassword(forgetPasswordRequest.email))
            getRepositoryData(forgetPasswordRequest)
    }

    private fun validateForgotPassword(email: String): Boolean {
        var isValid = true
        if (Validation.isNullOrEmpty(email)) {
            observeError.value = application.getString(R.string.error_login_email_empty)
            isValid = false
        }
        return isValid
    }

    fun getRepositoryData(forgetPasswordRequest: ForgetPasswordRequest) {
        responseManager.loading()
        disposable.add(
                forgerPasswordRepository.forgetPassword(forgetPasswordRequest).subscribe({ data ->
                    if (data == null) responseManager.failed("Error")
                    else {
                        responseManager.success(data.message)
                        responseManager.authenticated(data.data ?: user)
                        observSucces.value = true
                    }
                    responseManager.hideLoading()
                }, {
                    responseManager.hideLoading()
                    responseManager.failed(it.message)
                })
        )
    }

    fun onCloseClicked() {
        observeCloseClick.value = true
    }

    val closeClick: LiveData<Boolean>?
        get() {
            if (observeCloseClick != null) observeCloseClick = MutableLiveData()
            return observeCloseClick
        }
}