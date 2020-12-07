package com.app.newislam.ui.home.centers

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.requests.home.centers.Centers
import org.koin.core.inject

class CentersViewModel : BaseViewModel() {

    private var page = 1
    private var hasNextPage = false
    private val items = arrayListOf<Centers>()
    var centerId = 0

    private val centersRepository: CentersRepository by inject()

    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess

    private val _islamicCenters = MutableLiveData<Event<List<Centers>>>()
    val islamicCenters: LiveData<Event<List<Centers>>>
        get() = _islamicCenters

    private val _moreIslamicCenters = MutableLiveData<Event<List<Centers>>>()
    val moreIslamicCenters: LiveData<Event<List<Centers>>>
        get() = _moreIslamicCenters


    init {
        getIslamicCenters()
    }

    fun getIslamicCenters() {
        responseManager.loading()
        disposable.add(
            centersRepository.getIslamicCenters(page, 10).subscribe({ data ->
                responseManager.hideLoading()
                if (data != null) {
                    _observeSuccess.value = Event(true)
                    _islamicCenters.value = Event(data.data?.items!!)
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
                centersRepository.getIslamicCenters(page++, 10).subscribe({ data ->
                    responseManager.hideLoading()
                    if (data != null) {
                        if (data.data?.items!!.isNotEmpty()) {
                            items.addAll(data.data?.items!!)
                            _moreIslamicCenters.value = Event(items)
                            hasNextPage = data.data?.hasNextPage ?: false
                        }
                    }
                }, {

                })
            )
    }

    fun closeCentersSheet(){

    }
}