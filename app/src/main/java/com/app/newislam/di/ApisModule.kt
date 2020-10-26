package com.app.newislam.di

import com.app.newislam.model.requests.auth.login.LoginErrors
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.repository.auth.LoginRepository
import org.koin.dsl.module


val apiModule = module {
    factory {
        LoginRequest(get())
    }

    factory {
        LoginErrors()
    }
    factory {
        LoginRepository()
    }
}