package com.app.newislam.repository.auth

import com.app.newislam.manager.connection.Api
import com.app.newislam.manager.connection.AppSchedulerProvider
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.forgot_password.ForgetPasswordRequest
import io.reactivex.Flowable
import org.koin.core.KoinComponent
import org.koin.core.inject

class ForgerPasswordRepository : KoinComponent {
    val api:Api by inject()
    private val appSchedulerProvider:AppSchedulerProvider by inject()

    fun forgetPassword(forgetPasswordRequest: ForgetPasswordRequest):Flowable<Resource<User>>{
        return api.forgetPassword(forgetPasswordRequest).compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}