package com.app.newislam.ui.home.services.islamic_centers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.services.IslamicCenter
import com.app.newislam.repository.home.services.IslamicCentersRepository
import org.koin.core.inject

class IslamicCentersViewModel : BaseViewModel() {

    private var page = 1
    private var hasNextPage = false
    private val items = arrayListOf<IslamicCenter>()
    private val islamicCentersRepository: IslamicCentersRepository by inject()


    private val _islamicCenters = MutableLiveData<Event<ArrayList<IslamicCenter>>>()
    val islamicCenters: LiveData<Event<ArrayList<IslamicCenter>>>
        get() = _islamicCenters


    init {
        getIslamicCenters()
    }

    private fun getIslamicCenters() {
        disposable.add(
            islamicCentersRepository.getIslamicCenters(page, Constants.PAGE_SIZE)
                .subscribe({ data ->
                    if (data != null) {
                        _islamicCenters.value = Event(data.data?.items!!)
                        items.addAll(data.data?.items!!)
                        hasNextPage = data.data?.hasNextPage ?: false
                    } else responseManager.noConnection()
                }, {
                    responseManager.failed(it.message)
                })
        )
    }


}