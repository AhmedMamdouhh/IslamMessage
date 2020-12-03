package com.app.newislam.ui.home.centers

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.home.IslamicCentersResponse
import io.reactivex.Flowable

class CentersRepository : BaseRepository() {

    fun getIslamicCenters(pageIndex:Int,pageSize: Int): Flowable<Resource<IslamicCentersResponse>> {
       return api.getIslamicCenters(pageIndex = pageIndex,pageSize = pageSize).compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}