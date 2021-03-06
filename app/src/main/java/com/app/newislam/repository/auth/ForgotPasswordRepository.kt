package com.app.newislam.repository.auth

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Api
import com.app.newislam.manager.connection.AppSchedulerProvider
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.auth.User
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordRequest
import io.reactivex.Flowable
import org.koin.core.KoinComponent
import org.koin.core.inject

class ForgotPasswordRepository : BaseRepository() {

    fun forgotPassword(forgotPasswordRequest: ForgotPasswordRequest): Flowable<Resource<Any>> {
        return api.forgetPassword(forgotPasswordRequest)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}