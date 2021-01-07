package com.app.newislam.ui.home.im_services

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.model.entities.home.im_services.IslamMessageServicesResponse

class IslamMessageServicesRepository : BaseRepository() {
    private val listOfServices = arrayListOf<IslamMessageServicesResponse>()


    fun getIslamMessageServices(): ArrayList<IslamMessageServicesResponse> {
        listOfServices.add(
            IslamMessageServicesResponse(
                1,
                "Islamic centers",
                "islamic news service text one"
            )
        )
        listOfServices.add(
            IslamMessageServicesResponse(
                2,
                "Islamic Schools",
                "islamic news service text two"
            )
        )
        listOfServices.add(
            IslamMessageServicesResponse(
                3,
                "Events",
                "islamic news service text three"
            )
        )
        listOfServices.add(IslamMessageServicesResponse(4, "News", "islamic news service text"))
        listOfServices.add(
            IslamMessageServicesResponse(
                5,
                "Halal restaurants",
                "islamic news service text 000.."
            )
        )
        return listOfServices
    }

    fun getIslamMessageServices(pageIndex: Int, pageSize: Int) = api.getServices(
        pageIndex, pageSize
    ).compose(appSchedulerProvider.ioToMainFlowableScheduler())
}