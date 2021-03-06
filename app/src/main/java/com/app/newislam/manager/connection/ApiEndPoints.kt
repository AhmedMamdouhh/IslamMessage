package com.app.newislam.manager.connection

object ApiEndPoints {

    const val BASE_URL = "http://174.138.103.162:4000/api/v1/"
    private const val USERS = "Users/"

    //User Management
    const val LOGIN = "${BASE_URL}${USERS}Login"
    const val REGISTER = "${BASE_URL}${USERS}Register"
    const val FORGET_PASSWORD = "${BASE_URL}${USERS}Reset"
    const val ACTIVATION_CODE = "${BASE_URL}${USERS}Confirm"
    const val CONFIRM_RESET = "${BASE_URL}${USERS}confirmreset"

    //Home
    const val HOME_BANNER = "${BASE_URL}banners"
    const val CHIPS_SERVICES = "${BASE_URL}services"
    const val ISLAMIC_CENTERS = "${BASE_URL}IslamicCenters"
    const val ISLAMIC_CENTER_DETAILS = "${BASE_URL}IslamicCenters/{centerId}"
    const val EVENTS = "${BASE_URL}events"
    const val NEWS = "${BASE_URL}Articles"
    const val ARTICLE_DETAILS = "${BASE_URL}Articles/{articleId}"
}