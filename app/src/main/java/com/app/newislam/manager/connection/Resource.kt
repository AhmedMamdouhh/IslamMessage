package com.app.newislam.manager.connection

import com.google.gson.annotations.SerializedName

class Resource<T>   {

    var resourceStatus: ResourceStatus? = null

    @SerializedName("status") var status = 0

    @SerializedName("data") var data: T? = null

    @SerializedName("message") var message: String? = null

    enum class ResourceStatus {
        SUCCESS, FAILED, NO_CONNECTION, LOADING, LOGOUT, AUTHENTICATED, HIDE_LOADING
    }


}