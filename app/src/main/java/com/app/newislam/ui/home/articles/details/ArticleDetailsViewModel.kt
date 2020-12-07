package com.app.newislam.ui.home.articles.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.requests.home.articles.ArticleDetailsResponse
import org.koin.core.inject

class ArticleDetailsViewModel : BaseViewModel() {
    var articleId = 0
    val repository: ArticleDetailsRepository by inject()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess
    private val _observeBackClick = MutableLiveData<Event<Boolean>>()
    val observeBackClick: LiveData<Event<Boolean>>
        get() = _observeBackClick

    private val _articleDetails = MutableLiveData<Event<ArticleDetailsResponse>>()
    val articleDetails: LiveData<Event<ArticleDetailsResponse>>
        get() = _articleDetails

    fun getArticleData() {
        responseManager.loading()
        disposable.add(
            repository.getArticleDetails(articleId).subscribe({ response ->
                if (response != null) {
                    responseManager.success(response.message)
                    _observeSuccess.value = Event(true)
                    if (response.data != null)
                        _articleDetails.value = Event(response.data!!)
                } else responseManager.noConnection()


            }, {
                responseManager.hideLoading()
                responseManager.failed(it.message)
            })
        )
    }

    fun closeArticleDetailsSheet() {
        _observeBackClick.value = Event(true)
    }
}