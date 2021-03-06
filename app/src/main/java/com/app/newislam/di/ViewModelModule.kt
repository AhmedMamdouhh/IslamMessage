package com.app.newislam.di

import com.app.newislam.ui.auth.password_container.forgot_password.ForgotPasswordViewModel
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.ui.auth.activation_code.ActivationCodeViewModel
import com.app.newislam.ui.auth.login.LoginViewModel
import com.app.newislam.ui.auth.register.RegisterViewModel
import com.app.newislam.ui.welcome.WelcomeViewModel
import com.app.newislam.ui.home.HomeViewModel
import com.app.newislam.ui.home.articles.details.ArticleDetailsViewModel
import com.app.newislam.ui.home.centers.details.CenterDetailsViewModel
import com.app.newislam.ui.home.banner.HomeBannerViewModel
import com.app.newislam.ui.home.chips.ChipsViewModel
import com.app.newislam.ui.home.services.ServiceListViewModel
import com.app.newislam.ui.home.services.events.EventsViewModel
import com.app.newislam.ui.home.services.islamic_centers.IslamicCentersViewModel
import com.app.newislam.ui.home.services.news.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {

    viewModel { LoginViewModel() }
    viewModel { BaseViewModel() }
    viewModel { ActivationCodeViewModel() }
    viewModel { RegisterViewModel() }
    viewModel { ForgotPasswordViewModel() }
    viewModel { WelcomeViewModel() }
    viewModel { HomeViewModel() }
    viewModel { HomeBannerViewModel() }
    viewModel { ChipsViewModel() }
    viewModel { NewsViewModel() }
    viewModel { ServiceListViewModel() }
    viewModel { IslamicCentersViewModel() }
    viewModel { EventsViewModel() }
    viewModel { CenterDetailsViewModel() }
    viewModel { ArticleDetailsViewModel() }
}