package com.app.newislam.repository.home.services

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.home.services.IslamicCenter
import io.reactivex.Flowable

class IslamicCentersRepository : BaseRepository() {

    fun getIslamicCenters(
        pageIndex: Int,
        pageSize: Int
    ): Flowable<Resource<PaginationResource<IslamicCenter>>> {
        return api.getIslamicCenters(pageIndex = pageIndex, pageSize = pageSize)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}