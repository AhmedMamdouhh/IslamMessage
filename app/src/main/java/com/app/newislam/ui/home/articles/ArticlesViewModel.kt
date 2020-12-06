package com.app.newislam.ui.home.articles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.requests.home.Articles
import org.koin.core.inject

class ArticlesViewModel : BaseViewModel() {

    private var page = 1
    private var hasNextPage = false
    private val items = arrayListOf<Articles>()

    private val articlesRepository: ArticlesRepository by inject()

    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess

    private val _islamicArticles = MutableLiveData<Event<List<Articles>>>()
    val islamicArticles: LiveData<Event<List<Articles>>>
        get() = _islamicArticles

    private val _moreIslamicArticles = MutableLiveData<Event<List<Articles>>>()
    val moreIslamicArticles: LiveData<Event<List<Articles>>>
        get() = _moreIslamicArticles

    init {
        getIslamicArticles()
    }

    fun getIslamicArticles() {
        responseManager.loading()
        disposable.add(
            articlesRepository.getArticles(page, 10).subscribe({ data ->
                responseManager.hideLoading()
                if (data != null) {
                    _observeSuccess.value = Event(true)
                    _islamicArticles.value = Event(data.data?.items!!)
                    items.addAll(data.data?.items!!)
                    hasNextPage = data.data?.hasNextPage ?: false
                }
            }, {

            })
        )
    }

    fun loadMoreItems() {
        if (hasNextPage)
            disposable.add(
                articlesRepository.getArticles(page++, 10).subscribe({ data ->
                    responseManager.hideLoading()
                    if (data != null) {
                        if (data.data?.items!!.isNotEmpty()) {
                            items.addAll(data.data?.items!!)
                            _moreIslamicArticles.value = Event(items)
                            hasNextPage = data.data?.hasNextPage ?: false
                        }
                    }
                }, {

                })
            )
    }
}