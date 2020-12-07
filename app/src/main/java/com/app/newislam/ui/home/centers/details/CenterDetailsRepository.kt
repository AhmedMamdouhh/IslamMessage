package com.app.newislam.ui.home.centers.details

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.home.centers.IslamicCenterDetailsResponse
import io.reactivex.Flowable

class CenterDetailsRepository : BaseRepository() {

    fun getIslamicCenterDetails(centerId: Int): Flowable<Resource<IslamicCenterDetailsResponse>>{
        return api.getIslamicCenterDetails(centerId)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}