package com.app.newislam.repository.home.banner

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.home.HomeBanner
import io.reactivex.Flowable

class HomeBannerRepository : BaseRepository() {

    fun getHomeBanner(): Flowable<Resource<ArrayList<HomeBanner>>> {
        return api.getHomeBanner()
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }

}