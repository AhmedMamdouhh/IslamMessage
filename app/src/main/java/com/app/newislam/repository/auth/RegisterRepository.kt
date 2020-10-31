package com.app.newislam.repository.auth

import com.app.newislam.manager.connection.Api
import com.app.newislam.manager.connection.AppSchedulerProvider
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.register.RegisterRequest
import io.reactivex.Flowable
import io.reactivex.disposables.CompositeDisposable
import org.koin.core.KoinComponent
import org.koin.core.inject

class RegisterRepository : KoinComponent {
    val api:Api by inject()
    val appSchedulerProvider:AppSchedulerProvider by inject()
    val composit:CompositeDisposable by inject()

    fun createNewUser(registerRequest: RegisterRequest):Flowable<Resource<Any>>{
        return api.createNewUser(registerRequest).compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}