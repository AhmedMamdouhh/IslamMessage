package com.app.newislam.repository.home.services

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.home.services.Events
import io.reactivex.Flowable

class EventsRepository : BaseRepository() {
    fun getEvents(
        pageIndex: Int,
        pageSize: Int
    ): Flowable<Resource<PaginationResource<Events>>> {
        return api.getEvents(pageIndex = pageIndex, pageSize = pageSize)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}