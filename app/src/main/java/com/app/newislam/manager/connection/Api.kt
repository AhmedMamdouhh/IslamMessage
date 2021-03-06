package com.app.newislam.manager.connection

import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgetPasswordRequest
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import io.reactivex.Flowable
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST(ApiEndPoints.LOGIN)
    fun userLogin(@Body loginRequest: LoginRequest):Flowable<Resource<User>>

    @POST(ApiEndPoints.REGISTER)
    fun createNewUser(@Body registerRequest: RegistrationRequest):Flowable<Resource<Any>>

    @POST(ApiEndPoints.FORGET_PASSWORD)
    fun forgetPassword(@Body forgetPasswordRequest: ForgetPasswordRequest):Flowable<Resource<User>>

    @POST(ApiEndPoints.ACTIVATION_CODE)
    fun activateCode(@Body activationCodeRequest: ActivationCodeRequest):Flowable<Resource<User>>
}