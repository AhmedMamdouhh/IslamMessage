package com.app.newislam.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.*

class HomeViewModel : BaseViewModel() {

    //TODO : banner repository

    private val _observeBannerDataSuccess = MutableLiveData<Event<ArrayList<HomeBanner>>>()
    private val _observeCategoriesDataSuccess = MutableLiveData<Event<ArrayList<HomeCategory>>>()
    private val _observeIslamicCentersDataSuccess = MutableLiveData<Event<ArrayList<IslamicCenter>>>()
    private val _observeEventsDataSuccess = MutableLiveData<Event<ArrayList<Events>>>()
    private val _observeNewsDataSuccess = MutableLiveData<Event<ArrayList<News>>>()

    init {
        setIslamicCentersData()
        setEventsData()
        setNewsData()
    }


    //getters
    val observeBannerDataSuccess: LiveData<Event<ArrayList<HomeBanner>>>
        get() = _observeBannerDataSuccess

    val observeCategoriesDataSuccess: LiveData<Event<ArrayList<HomeCategory>>>
        get() = _observeCategoriesDataSuccess

    val observeIslamicCentersDataSuccess: LiveData<Event<ArrayList<IslamicCenter>>>
        get() = _observeIslamicCentersDataSuccess

    val observeEventsDataSuccess: LiveData<Event<ArrayList<Events>>>
        get() = _observeEventsDataSuccess

    val observeNewsDataSuccess: LiveData<Event<ArrayList<News>>>
        get() = _observeNewsDataSuccess

    //DUMMY//
    fun setBannerData() {
        val homeBanner = HomeBanner()

        homeBanner.homeBannerTitle = "Title"
        homeBanner.homeBannerDescription = "Description"

        val homeBannerList = ArrayList<HomeBanner>()

        homeBannerList.add(homeBanner)
        homeBannerList.add(homeBanner)
        homeBannerList.add(homeBanner)
        homeBannerList.add(homeBanner)

        _observeBannerDataSuccess.value = Event(homeBannerList)
    }

    fun setServiceChipsData() {

    }

    fun setCategoriesData() {
        val homeCategories  = ArrayList<HomeCategory>()

        homeCategories.add(HomeCategory(application.getString(R.string.home_islamic_centers_title)))
        homeCategories.add(HomeCategory(application.getString(R.string.home_events_title)))
        homeCategories.add(HomeCategory(application.getString(R.string.home_news_title)))



        _observeCategoriesDataSuccess.value = Event(homeCategories)
    }

    private fun setIslamicCentersData(){
        val islamicCenter = IslamicCenter()

        // islamic centers :
        islamicCenter.islamicCenterImage =
            "https://static.smarttravelapp.com/data/pois/6034_IslamicCenterMaldives6_1484296678.jpg"
        islamicCenter.islamicCenterTitle = "West London Islamic center"
        islamicCenter.islamicCenterLocation = "West London Islamic center"

        val islamicList = ArrayList<IslamicCenter>()
        islamicList.add(islamicCenter)
        islamicList.add(islamicCenter)
        islamicList.add(islamicCenter)
        islamicList.add(islamicCenter)

        _observeIslamicCentersDataSuccess.value = Event(islamicList)
    }

    private fun setEventsData(){
        val event = Events()

        // events :
        event.eventImage =
            "https://upload.wikimedia.org/wikipedia/commons/3/3c/Islamic_Center_of_America.jpg"
        event.eventLocation = "England, London city"
        event.eventTitle = "West London Islamic center"
        event.eventTime = "MON, 28 SEP 2020"

        val eventList = ArrayList<Events>()
        eventList.add(event)
        eventList.add(event)
        eventList.add(event)
        eventList.add(event)

        _observeEventsDataSuccess.value = Event(eventList)
    }

    private fun setNewsData(){
        val news = News()

        // news:
        news.newsImage =
            "https://static.smarttravelapp.com/data/pois/6034_IslamicCenterMaldives6_1484296678.jpg"
        news.newsTitle = "West London Islamic center"
        news.newsTime = "MON, 28 SEP 2020"

        val newsList = ArrayList<News>()
        newsList.add(news)
        newsList.add(news)
        newsList.add(news)
        newsList.add(news)

        _observeNewsDataSuccess.value = Event(newsList)
    }
}