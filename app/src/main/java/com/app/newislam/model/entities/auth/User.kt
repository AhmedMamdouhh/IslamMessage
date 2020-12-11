package com.app.newislam.model.entities.auth

import com.google.gson.annotations.SerializedName

class User {
    var userData: UserData? = null
    var jwt: Jwt? = null
}

data class UserData(
    @SerializedName("firstName") val firstName: String,
    @SerializedName("lastName") val lastName: String,
    @SerializedName("id") val id: Int,
    @SerializedName("email") val email: String
)

data class Jwt(
    @SerializedName("jwt") val jwt: JwtX
)

data class JwtX(
    @SerializedName("jwt") val jwt: String,
    @SerializedName("validTo") val validTo: String
)
