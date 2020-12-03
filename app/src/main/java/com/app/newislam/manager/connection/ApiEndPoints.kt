package com.app.newislam.manager.connection
object ApiEndPoints {

    const val BASE_URL = "http://174.138.103.162:4000/Api/"
    private const val USERS = "Users/"
    const val LOGIN = "${BASE_URL}${USERS}Login"
    const val REGISTER = "${BASE_URL}${USERS}Register"
    const val FORGET_PASSWORD = "${BASE_URL}${USERS}Reset"
    const val ACTIVATION_CODE = "${BASE_URL}${USERS}Confirm"
    const val ISLAMIC_CENTERS = "${BASE_URL}IslamicCenters"
    const val ARTICLES = "${BASE_URL}Articles"
}