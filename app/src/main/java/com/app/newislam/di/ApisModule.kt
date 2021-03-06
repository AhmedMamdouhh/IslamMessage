package com.app.newislam.di

import com.app.newislam.manager.base.ResponseManager
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.auth.User
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeErrors
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.model.requests.auth.login.LoginErrors
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordErrors
import com.app.newislam.model.requests.auth.new_password.NewPasswordErrors
import com.app.newislam.model.requests.auth.new_password.NewPasswordRequest
import com.app.newislam.model.requests.auth.register.RegisterErrors
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.repository.auth.*
import com.app.newislam.repository.home.banner.HomeBannerRepository
import com.app.newislam.repository.home.chips.ChipsRepository
import com.app.newislam.repository.home.services.EventsRepository
import com.app.newislam.repository.home.services.NewsRepository
import com.app.newislam.repository.home.services.IslamicCentersRepository
import com.app.newislam.ui.home.articles.details.ArticleDetailsRepository
import com.app.newislam.ui.home.centers.details.CenterDetailsRepository
import org.koin.dsl.module


val apiModule = module {

    //Base
    single { ResponseManager(Resource(), get(), get()) }
    single { User() }

    //login
    factory { LoginRequest(get()) }
    factory { LoginErrors() }
    single { LoginRepository() }

    //activation code
    factory { ActivationCodeRequest(get()) }
    factory { ActivationCodeErrors() }
    single { ActivationCodeRepository() }

    //forgot password
    factory { ForgotPasswordRequest(get()) }
    factory { ForgotPasswordErrors() }
    single { ForgotPasswordRepository() }

    //New password
    factory { NewPasswordRequest(get()) }
    factory { NewPasswordErrors() }
    single { NewPasswordRepository() }

    //register
    factory { RegisterErrors() }
    factory { RegistrationRequest(get()) }
    single { RegisterRepository() }

    //Home
    single { HomeBannerRepository() }
    single { ChipsRepository() }

    //centers
    single { IslamicCentersRepository() }
    single { EventsRepository() }
    single { NewsRepository() }
    single { CenterDetailsRepository() }
    single { ArticleDetailsRepository() }

}