package com.app.newislam.manager.connection
object ApiEndPoints {

    const val BASE_URL = "http://174.138.103.162:4000/Api/"
    const val USERS = "Users/"
    const val LOGIN = "${BASE_URL}${USERS}Login"
    const val REGISTER = "${BASE_URL}${USERS}Register"
    const val FORGET_PASSWORD = "${BASE_URL}${USERS}Reset"

}