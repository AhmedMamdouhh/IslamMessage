package com.app.newislam.repository.auth

import com.app.newislam.manager.connection.Api
import com.app.newislam.manager.connection.AppSchedulerProvider
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginRequest
import io.reactivex.Flowable
import io.reactivex.disposables.CompositeDisposable
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginRepository : KoinComponent {
    val api:Api by inject()
    val appSchedulerProvider:AppSchedulerProvider by inject()
    val composit:CompositeDisposable by inject()

    fun getLoginData(loginRequest: LoginRequest):Flowable<Resource<User>>{
        return api.userLogin(loginRequest).compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}