package com.app.newislam.ui.auth.password

import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.app.newislam.repository.auth.ForgerPasswordRepository
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.inject

class ForgotPasswordViewModel :BaseViewModel(){
    val forgerPasswordRepository: ForgerPasswordRepository by inject()
    val user: User by inject()
    val resource = MutableLiveData<Resource<User?>>()


    fun forgetPassword(forgetPasswordRequest: ForgetPasswordRequest){
        responseManager.loading()
        disposable.add(
            forgerPasswordRepository.forgetPassword(forgetPasswordRequest).subscribe({ data ->
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