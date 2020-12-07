package com.app.newislam.ui.home.articles

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.home.ArticlesResponse
import io.reactivex.Flowable

class ArticlesRepository : BaseRepository() {

    fun getArticles(pageIndex:Int,pageSize: Int): Flowable<Resource<ArticlesResponse>> {
       return api.getArticles(pageIndex = pageIndex,pageSize = pageSize).compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}