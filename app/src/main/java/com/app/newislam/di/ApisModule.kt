package com.app.newislam.di

import com.app.newislam.manager.base.ResponseManager
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginErrors
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.app.newislam.model.requests.auth.password.PasswordError
import com.app.newislam.model.requests.auth.register.RegisterErrors
import com.app.newislam.model.requests.auth.register.RegisterRequest
import com.app.newislam.repository.auth.ForgerPasswordRepository
import com.app.newislam.repository.auth.LoginRepository
import com.app.newislam.repository.auth.RegisterRepository
import org.koin.dsl.module


val apiModule = module {
    single {
        LoginRequest(get())
    }

    single {
        LoginErrors()
    }
    single {
        LoginRepository()
    }
    single {
        ForgerPasswordRepository()
    }
    single {
        ResponseManager(Resource(),get(),get())
    }
    single {
        User()
    }
    single {
        PasswordError()
    }
    single {
        ForgetPasswordRequest(get())
    }

    single {
        RegisterErrors()
    }
    single {
        RegisterRequest(get())
    }

    single {
        RegisterRepository()
    }

}