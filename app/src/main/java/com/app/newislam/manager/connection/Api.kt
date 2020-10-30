package com.app.newislam.manager.connection

import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import io.reactivex.Flowable
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST(ApiEndPoints.LOGIN)
    fun userLogin(@Body loginRequest: LoginRequest):Flowable<Resource<User>>

    @POST(ApiEndPoints.REGISTER)
    fun createNewUser(@Body registrationRequest: RegistrationRequest):Flowable<Resource<Any>>

    @POST(ApiEndPoints.FORGET_PASSWORD)
    fun forgetPassword(@Body forgetPasswordRequest: ForgetPasswordRequest):Flowable<Resource<User>>
}