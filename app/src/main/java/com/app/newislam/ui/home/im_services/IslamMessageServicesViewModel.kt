package com.app.newislam.ui.home.im_services

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.im_services.IslamMessageServicesResponse
import org.koin.core.inject

class IslamMessageServicesViewModel : BaseViewModel() {
    private val servicesRepository: IslamMessageServicesRepository by inject()
    private var page = 1
    private var hasNextPage = false
    private val items = arrayListOf<IslamMessageServicesResponse>()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    private val _observeServicesClick = MutableLiveData<Event<Boolean>>()
    private val _moreServicess = MutableLiveData<Event<List<IslamMessageServicesResponse>>>()
    private val _servicess = MutableLiveData<Event<ArrayList<IslamMessageServicesResponse>>>()


    init {
        getservicess()
    }

    fun getservicess() {
        _servicess.value = Event(servicesRepository.getIslamMessageServices())
    }


    fun servicesItemClicked() {
        _observeServicesClick.value = Event(true)
    }


    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess

    val servicess: LiveData<Event<ArrayList<IslamMessageServicesResponse>>>
        get() = _servicess

    val moreservicess: LiveData<Event<List<IslamMessageServicesResponse>>>
        get() = _moreServicess

    val observeservicesClick: LiveData<Event<Boolean>>
        get() = _observeServicesClick
}