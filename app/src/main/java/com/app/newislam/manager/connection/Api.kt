package com.app.newislam.manager.connection

import com.app.newislam.model.entities.auth.User
import com.app.newislam.model.entities.home.HomeBanner
import com.app.newislam.model.entities.home.services.Events
import com.app.newislam.model.entities.home.HomeMainServices
import com.app.newislam.model.entities.home.services.IslamicCenter
import com.app.newislam.model.entities.home.services.News
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordRequest
import com.app.newislam.model.requests.auth.new_password.NewPasswordRequest
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.model.requests.home.articles.ArticleDetailsResponse
import com.app.newislam.model.requests.home.centers.IslamicCenterDetailsResponse
import io.reactivex.Flowable
import retrofit2.http.*

interface Api {

    //User Management
    @POST(ApiEndPoints.LOGIN)
    fun userLogin(@Body loginRequest: LoginRequest): Flowable<Resource<User>>

    @POST(ApiEndPoints.REGISTER)
    fun createNewUser(@Body registerRequest: RegistrationRequest): Flowable<Resource<Any>>

    @POST(ApiEndPoints.FORGET_PASSWORD)
    fun forgetPassword(@Body forgotPasswordRequest: ForgotPasswordRequest): Flowable<Resource<Any>>

    @POST(ApiEndPoints.ACTIVATION_CODE)
    fun activateCode(@Body activationCodeRequest: ActivationCodeRequest): Flowable<Resource<User>>

    @POST(ApiEndPoints.CONFIRM_RESET)
    fun confirmResetPassword(@Body newPasswordRequest: NewPasswordRequest): Flowable<Resource<User>>


    //Home
    @GET(ApiEndPoints.HOME_BANNER)
    fun getHomeBanner(): Flowable<Resource<ArrayList<HomeBanner>>>

    @GET(ApiEndPoints.ISLAMIC_CENTERS)
    fun getIslamicCenters(
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Flowable<Resource<PaginationResource<IslamicCenter>>>

    @GET(ApiEndPoints.ISLAMIC_CENTER_DETAILS)
    fun getIslamicCenterDetails(
        @Path("centerId") centerId: Int
    ): Flowable<Resource<IslamicCenterDetailsResponse>>

    @GET(ApiEndPoints.EVENTS)
    fun getEvents(
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Flowable<Resource<PaginationResource<Events>>>

    @GET(ApiEndPoints.NEWS)
    fun getNews(
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Flowable<Resource<PaginationResource<News>>>

    @GET(ApiEndPoints.ARTICLE_DETAILS)
    fun getArticleDetails(
        @Path("articleId") articleId: Int
    ): Flowable<Resource<ArticleDetailsResponse>>

    @GET(ApiEndPoints.CHIPS_SERVICES)
    fun getChipsService(): Flowable<Resource<ArrayList<HomeMainServices>>>


}