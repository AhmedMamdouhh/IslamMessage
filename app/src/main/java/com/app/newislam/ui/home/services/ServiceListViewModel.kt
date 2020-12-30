package com.app.newislam.ui.home.services

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.connection.Resource
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.services.IslamicCenter
import com.app.newislam.ui.home.services.islamic_centers.IslamicCentersViewModel
import com.app.newislam.ui.home.services.news.NewsViewModel
import org.koin.core.inject

class ServiceListViewModel : BaseViewModel() {

    val islamicCentersViewModel: IslamicCentersViewModel by inject()
    private val newsViewModel: NewsViewModel by inject()
    //TODO : Events view model

    private var servicePosition = 0

    private val _observeMoreData =
        MutableLiveData<Event<Resource<PaginationResource<IslamicCenter>>>>()
    val observeIslamicCenters: LiveData<Event<Resource<PaginationResource<IslamicCenter>>>>
        get() = _observeMoreData


    //click:
    fun onBackClicked() {

    }

    fun serviceFactory(servicePosition: Int, oldData: PaginationResource<*>) {
        this.servicePosition = servicePosition

        when (servicePosition) {

            Constants.ISLAMIC_CENTER_ID -> {
                islamicCentersViewModel.updateDataFromServiceList(oldData)
            }
            Constants.EVENTS_ID -> {
            }
            Constants.NEWS_ID -> {
            }
        }
    }

    fun getMore(servicePosition: Int){
        when (servicePosition) {

            Constants.ISLAMIC_CENTER_ID -> {
                islamicCentersViewModel.getIslamicCenters()
            }
            Constants.EVENTS_ID -> {
            }
            Constants.NEWS_ID -> {
            }
        }
    }
}