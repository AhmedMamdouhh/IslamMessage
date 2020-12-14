package com.app.newislam.di

import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.ui.auth.activation_code.ActivationCodeViewModel
import com.app.newislam.ui.auth.login.LoginViewModel
import com.app.newislam.ui.auth.forgot_password.ForgotPasswordViewModel
import com.app.newislam.ui.auth.register.RegisterViewModel
import com.app.newislam.ui.splash.welcome.WelcomeViewModel
import com.app.newislam.ui.home.HomeViewModel
import com.app.newislam.ui.home.articles.details.ArticleDetailsViewModel
import com.app.newislam.ui.home.centers.details.CenterDetailsViewModel
import com.app.newislam.ui.home.home_banner.HomeBannerViewModel
import com.app.newislam.ui.home.im_services.IslamMessageServicesViewModel
import com.app.newislam.ui.home.notifications.NotificationViewModel
import com.app.newislam.ui.home.services.ServiceListViewModel
import com.app.newislam.ui.home.services.islamic_centers.IslamicCentersViewModel
import com.app.newislam.ui.home.services.news.NewsViewModel
import com.app.newislam.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {

    viewModel { LoginViewModel() }
    viewModel { BaseViewModel() }
    viewModel { SplashViewModel() }
    viewModel { ActivationCodeViewModel() }
    viewModel { RegisterViewModel() }
    viewModel { ForgotPasswordViewModel() }
    viewModel { WelcomeViewModel() }
    viewModel { HomeViewModel() }
    viewModel { HomeBannerViewModel() }
    viewModel { NewsViewModel() }
    viewModel { ServiceListViewModel() }
    viewModel { IslamicCentersViewModel() }
    viewModel { CenterDetailsViewModel() }
    viewModel { ArticleDetailsViewModel() }
    viewModel { NotificationViewModel() }
    viewModel { IslamMessageServicesViewModel() }
}