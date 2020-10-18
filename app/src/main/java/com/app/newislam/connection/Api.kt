package com.app.newislam.connection

import com.app.newislam.model.Resource
import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.LoginRequest
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST(ApiEndPoints.LOGIN)
    fun userLogin(@Body loginRequest: LoginRequest):Flowable<Resource<User>>
}