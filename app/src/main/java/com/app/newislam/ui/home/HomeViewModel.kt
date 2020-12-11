package com.app.newislam.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.*
import com.app.newislam.model.entities.home.services.HomeMainServices
import com.app.newislam.ui.home.services.islamic_centers.IslamicCentersViewModel
import com.app.newislam.ui.home.services.news.NewsViewModel
import org.koin.core.inject

class HomeViewModel : BaseViewModel() {

    //TODO : banner repository
    //TODO : chips repository

    val islamicCentersViewModel: IslamicCentersViewModel by inject()
    val newsViewModel: NewsViewModel by inject()
    //TODO : Events view model

    private val _observeBannerDataSuccess = MutableLiveData<Event<ArrayList<HomeBanner>>>()
    private val _observeMainServicesDataSuccess = MutableLiveData<Event<ArrayList<HomeMainServices>>>()
    private val _observeSeeAllClicked = MutableLiveData<Event<Boolean>>()
    private val _observeChipsDataSuccess = MutableLiveData<Event<ArrayList<HomeServiceChips>>>()
    private val _observeIslamicCentersPosition = MutableLiveData<Event<Boolean>>()
    private val _observeEventsPosition = MutableLiveData<Event<Boolean>>()
    private val _observeNewsPosition = MutableLiveData<Event<Boolean>>()


    init {
        setBannerData()
        setServiceChipsData()
        setMainServicesData()
    }

    //click
    fun onSeeAllClicked() {
        _observeSeeAllClicked.value = Event(true)
    }


    //other
    fun servicePositionFactory(serviceId: Int) {

        when (serviceId) {
            Constants.ISLAMIC_CENTER_ID -> { _observeIslamicCentersPosition.value = Event(true) }
            Constants.EVENTS_ID -> { _observeEventsPosition.value = Event(true) }
            Constants.NEWS_ID -> { _observeNewsPosition.value = Event(true) }
        }
    }

    //getters
    val observeBannerDataSuccess: LiveData<Event<ArrayList<HomeBanner>>>
        get() = _observeBannerDataSuccess

    val observeMainServicesDataSuccess: LiveData<Event<ArrayList<HomeMainServices>>>
        get() = _observeMainServicesDataSuccess

    val observeSeeAllClicked: LiveData<Event<Boolean>>
        get() = _observeSeeAllClicked

    val observeChipsDataSuccess: LiveData<Event<ArrayList<HomeServiceChips>>>
        get() = _observeChipsDataSuccess

    val observeIslamicCentersPosition: LiveData<Event<Boolean>>
        get() = _observeIslamicCentersPosition

    val observeEventsPosition: LiveData<Event<Boolean>>
        get() = _observeEventsPosition

    val observeNewsPosition: LiveData<Event<Boolean>>
        get() = _observeNewsPosition


    //DUMMY//
    private fun setBannerData() {
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
    private fun setServiceChipsData() {
        val homeChipsArray: ArrayList<HomeServiceChips> = arrayListOf()


        homeChipsArray.add(HomeServiceChips(application.getString(R.string.islamic_centers_title)))
        homeChipsArray.add(HomeServiceChips(application.getString(R.string.islamic_centers_title)))
        homeChipsArray.add(HomeServiceChips(application.getString(R.string.islamic_centers_title)))
        homeChipsArray.add(HomeServiceChips(application.getString(R.string.islamic_centers_title)))
        homeChipsArray.add(HomeServiceChips(application.getString(R.string.islamic_centers_title)))
        homeChipsArray.add(HomeServiceChips(application.getString(R.string.islamic_centers_title)))

        _observeChipsDataSuccess.value = Event(homeChipsArray)

    }
    private fun setMainServicesData() {
        val homeCategories = ArrayList<HomeMainServices>()

        homeCategories.add(HomeMainServices(application.getString(R.string.home_islamic_centers_title)))
        homeCategories.add(HomeMainServices(application.getString(R.string.home_events_title)))
        homeCategories.add(HomeMainServices(application.getString(R.string.home_news_title)))



        _observeMainServicesDataSuccess.value = Event(homeCategories)
    }


}