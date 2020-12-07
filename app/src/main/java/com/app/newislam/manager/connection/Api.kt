package com.app.newislam.manager.connection

import com.app.newislam.model.entities.User
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgetPasswordRequest
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.model.requests.home.ArticlesResponse
import com.app.newislam.model.requests.home.centers.IslamicCentersResponse
import com.app.newislam.model.requests.home.articles.ArticleDetailsResponse
import com.app.newislam.model.requests.home.centers.IslamicCenterDetailsResponse
import io.reactivex.Flowable
import retrofit2.http.*

interface Api {
    @POST(ApiEndPoints.LOGIN)
    fun userLogin(@Body loginRequest: LoginRequest): Flowable<Resource<User>>

    @POST(ApiEndPoints.REGISTER)
    fun createNewUser(@Body registerRequest: RegistrationRequest): Flowable<Resource<Any>>

    @POST(ApiEndPoints.FORGET_PASSWORD)
    fun forgetPassword(@Body forgetPasswordRequest: ForgetPasswordRequest): Flowable<Resource<User>>

    @POST(ApiEndPoints.ACTIVATION_CODE)
    fun activateCode(@Body activationCodeRequest: ActivationCodeRequest): Flowable<Resource<User>>

    @GET(ApiEndPoints.ISLAMIC_CENTERS)
    fun getIslamicCenters(
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Flowable<Resource<IslamicCentersResponse>>

    @GET(ApiEndPoints.ISLAMIC_CENTER_DETAILS)
    fun getIslamicCenterDetails(
        @Path("centerId") centerId: Int
    ): Flowable<Resource<IslamicCenterDetailsResponse>>

    @GET(ApiEndPoints.ARTICLES)
    fun getArticles(
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Flowable<Resource<ArticlesResponse>>

    @GET(ApiEndPoints.ARTICLE_DETAILS)
    fun getArticleDetails(
        @Path("articleId") articleId: Int
    ): Flowable<Resource<ArticleDetailsResponse>>


}