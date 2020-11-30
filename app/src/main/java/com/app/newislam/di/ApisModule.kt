package com.app.newislam.di

import com.app.newislam.manager.base.ResponseManager
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeErrors
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.model.requests.auth.login.LoginErrors
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgetPasswordRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordErrors
import com.app.newislam.model.requests.auth.register.RegisterErrors
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.repository.auth.ActivationCodeRepository
import com.app.newislam.repository.auth.ForgerPasswordRepository
import com.app.newislam.repository.auth.LoginRepository
import com.app.newislam.repository.auth.RegisterRepository
import org.koin.dsl.module


val apiModule = module {

    //login
    factory { LoginRequest(get()) }
    factory { LoginErrors() }
    single { LoginRepository() }

    //activation code
    factory { ActivationCodeRequest(get()) }
    factory { ActivationCodeErrors() }
    single { ActivationCodeRepository() }

    //forgot password
    factory { ForgetPasswordRequest(get()) }
    factory { ForgotPasswordErrors() }
    single { ForgerPasswordRepository() }

    //register
    factory { RegisterErrors() }
    factory { RegistrationRequest(get()) }
    single { RegisterRepository() }

    single { ResponseManager(Resource(), get(), get()) }
    single { User() }

}