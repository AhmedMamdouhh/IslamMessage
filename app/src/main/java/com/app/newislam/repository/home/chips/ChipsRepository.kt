package com.app.newislam.repository.home.chips

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.home.HomeMainServices
import io.reactivex.Flowable

class ChipsRepository : BaseRepository() {

    fun getChipsService(): Flowable<Resource<ArrayList<HomeMainServices>>> {
        return api.getChipsService()
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}