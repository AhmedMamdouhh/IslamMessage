package com.app.newislam.connection

import com.app.newislam.model.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.LoginRequest
import io.reactivex.Single
import org.koin.core.KoinComponent
import org.koin.core.inject

class ApiManagerRepository : Api,KoinComponent{
    val api : Api by inject  ()
    val shared : PreferencesManagerRepository by inject  ()
    override fun userLogin(loginRequest: LoginRequest): Single<Resource<User>> {
        return api.userLogin(loginRequest)
    }
}
