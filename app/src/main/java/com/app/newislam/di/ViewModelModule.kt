package com.app.newislam.di

import com.app.newislam.ui.auth.login.LoginViewModel
import org.koin.dsl.module


val viewModelModule = module {
    single {
        LoginViewModel()
    }
}