package com.app.newislam.di

import com.app.newislam.manager.base.ResponseManager
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.auth.login.LoginErrors
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
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
        ResponseManager(Resource(),get(),get())
    }

}