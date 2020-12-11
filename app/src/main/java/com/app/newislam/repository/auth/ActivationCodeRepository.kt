package com.app.newislam.repository.auth

import com.app.newislam.manager.connection.Api
import com.app.newislam.manager.connection.AppSchedulerProvider
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.auth.User
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import io.reactivex.Flowable
import org.koin.core.KoinComponent
import org.koin.core.inject

class ActivationCodeRepository : KoinComponent {
    val api: Api by inject()
    private val appSchedulerProvider: AppSchedulerProvider by inject()

    fun getActivateCode(activationCodeRequest: ActivationCodeRequest): Flowable<Resource<User>> {
        return api.activateCode(activationCodeRequest)
            .compose(
                appSchedulerProvider
                    .ioToMainFlowableScheduler()
            )
    }
}