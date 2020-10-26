package com.app.newislam.model

import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.google.gson.annotations.SerializedName

class Resource<T> private constructor() {

    var resourceStatus: ResourceStatus? = null
        private set

    @SerializedName("status") var status = 0
     private set

    @SerializedName("data") var data: T? = null
        private set

    @SerializedName("message") var message: String? = null
        private set

    class ResourceBuilder<T> {
        private val resource: Resource<T> = Resource<T>()
        fun withMessage( msg: String): ResourceBuilder<T> {
            resource.message = msg
            return this
        }

        fun holdingData( data: T): ResourceBuilder<T> {
            resource.data = data
            return this
        }

        fun withStatus( status: ResourceStatus): ResourceBuilder<T> {
            resource.resourceStatus = status
            return this
        }

        fun build(): Resource<T> {
            return resource
        }

    }

    enum class ResourceStatus {
        SUCCESS, FAILED, NO_CONNECTION, LOADING, NOT_AUTHENTICATED
    }

    companion object {
        fun <T> success( msg: String?,  data: T): Resource<T> {
            return ResourceBuilder<T>()
                .withStatus(ResourceStatus.SUCCESS)
                .withMessage(msg!!)
                .holdingData(data)
                .build()
        }

        fun <T> failed( msg: String?): Resource<T> {
            return ResourceBuilder<T>()
                .withStatus(ResourceStatus.FAILED)
                .withMessage(msg!!)
                .build()
        }

        fun <T> noConnection( msg: String?): Resource<T> {
            return ResourceBuilder<T>()
                .withStatus(ResourceStatus.NO_CONNECTION)
                .withMessage(msg!!)
                .build()
        }

        fun <T> loading(): Resource<T> {
            return ResourceBuilder<T>()
                .withStatus(ResourceStatus.LOADING)
                .build()
        }

        fun <T> logout(): Resource<T> {
            return ResourceBuilder<T>()
                .withStatus(ResourceStatus.NOT_AUTHENTICATED)
                .build()
        }
    }
}