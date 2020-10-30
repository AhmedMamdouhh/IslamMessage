package com.app.newislam.ui.auth.register

import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.repository.auth.LoginRepository
import com.app.newislam.repository.auth.RegistrationRepository
import org.koin.core.inject

class RegisterViewModel : BaseViewModel() {
    val registrationRepository: RegistrationRepository by inject()
    val resource = MutableLiveData<Resource<User?>>()
    val navigateToLogin = MutableLiveData<Boolean>()


    fun createNewUser(registrationRequest: RegistrationRequest) {
        responseManager.loading()
        disposable.add(
            registrationRepository.createNewUser(registrationRequest).subscribe({ data ->
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

    fun goToLogin() {
        navigateToLogin.value = true
    }

    fun reset() {
        navigateToLogin.value = false
    }
}