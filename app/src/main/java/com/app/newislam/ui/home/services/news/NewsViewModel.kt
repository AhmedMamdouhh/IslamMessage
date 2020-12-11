package com.app.newislam.ui.home.services.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.services.News
import com.app.newislam.repository.home.services.NewsRepository
import org.koin.core.inject

class NewsViewModel : BaseViewModel() {

    private var page = 1
    private var hasNextPage = false
    private val items = arrayListOf<News>()
    private val newsRepository: NewsRepository by inject()

    private val _observeNews = MutableLiveData<Event<ArrayList<News>>>()
    val observeNews: LiveData<Event<ArrayList<News>>>
        get() = _observeNews

    init {
        getNews()
    }

    private fun getNews() {
        disposable.add(
            newsRepository.getNews(page, Constants.PAGE_SIZE).subscribe({ data ->
                if (data != null) {
                    _observeNews.value = Event(data.data?.items!!)
                    items.addAll(data.data?.items!!)
                    hasNextPage = data.data?.hasNextPage ?: false
                } else responseManager.noConnection()
            }, {
                responseManager.failed(it.message)
            })
        )
    }

}