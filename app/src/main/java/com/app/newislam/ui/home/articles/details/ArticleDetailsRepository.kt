package com.app.newislam.ui.home.articles.details

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.home.articles.ArticleDetailsResponse
import com.app.newislam.model.requests.home.centers.IslamicCenterDetailsResponse
import io.reactivex.Flowable

class ArticleDetailsRepository : BaseRepository() {

    fun getArticleDetails(articleId: Int): Flowable<Resource<ArticleDetailsResponse>> {
        return api.getArticleDetails(articleId)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}