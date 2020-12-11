package com.app.newislam.repository.home.services

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.home.services.News
import io.reactivex.Flowable

class NewsRepository : BaseRepository() {

    fun getNews(pageIndex: Int, pageSize: Int): Flowable<Resource<PaginationResource<News>>> {
        return api.getNews(pageIndex = pageIndex, pageSize = pageSize)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}