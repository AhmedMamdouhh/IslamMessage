package com.app.newislam.ui.auth.login

import android.util.Log
import androidx.lifecycle.ViewModel
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginViewModel : ViewModel(), KoinComponent {
    val loginRepository: LoginRepository by inject()

    fun getLoginData(loginRequest: LoginRequest) {
        Log.d("SADSDASD", "getLoginData: ${loginRequest.email}")
        Log.d("SADSDASD", "getLoginData: ${loginRequest.password}")
        loginRepository.composit.add(loginRepository.getLoginData(loginRequest).subscribe({

        }, {

        }))
    }

}