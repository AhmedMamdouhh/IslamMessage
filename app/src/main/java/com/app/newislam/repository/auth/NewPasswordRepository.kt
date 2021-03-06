package com.app.newislam.repository.auth

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.auth.User
import com.app.newislam.model.requests.auth.new_password.NewPasswordRequest
import io.reactivex.Flowable

class NewPasswordRepository : BaseRepository() {

    fun newPassword(newPasswordRequest: NewPasswordRequest): Flowable<Resource<User>> {
        return api.confirmResetPassword(newPasswordRequest)
            .compose(
                appSchedulerProvider
                    .ioToMainFlowableScheduler()
            )
    }
}