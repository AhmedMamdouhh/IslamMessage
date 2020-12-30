package com.app.newislam.model.entities.home.services

import android.os.Parcelable
import com.app.newislam.manager.connection.PaginationResource
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomeMainServices(var mainServicesTitle: String):Parcelable{
      lateinit var subServicesList : PaginationResource<*>
}


