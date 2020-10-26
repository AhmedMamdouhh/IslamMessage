package com.app.newislam.connection

import com.app.newislam.model.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginRequest
import io.reactivex.Flowable
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST(ApiEndPoints.LOGIN)
    fun userLogin(@Body loginRequest: LoginRequest):Flowable<Resource<User>>
}