package com.app.newislam.ui.home.centers.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.requests.home.centers.IslamicCenterDetailsResponse
import com.app.newislam.ui.home.articles.details.ArticleDetailsRepository
import org.koin.core.inject

class CenterDetailsViewModel : BaseViewModel() {
    var centerId = 0
    val repository: CenterDetailsRepository by inject()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess
    private val _observeBackClick = MutableLiveData<Event<Boolean>>()
    val observeBackClick: LiveData<Event<Boolean>>
        get() = _observeBackClick

    private val _islamicCenterDetails = MutableLiveData<Event<IslamicCenterDetailsResponse>>()
    val islamicCenterDetails: LiveData<Event<IslamicCenterDetailsResponse>>
        get() = _islamicCenterDetails

    fun getIslamicCenterData() {
        responseManager.loading()
        disposable.add(
            repository.getIslamicCenterDetails(centerId).subscribe({ response ->
                if (response != null) {
                    responseManager.success(response.message)
                    _observeSuccess.value = Event(true)
                    if (response.data != null)
                        _islamicCenterDetails.value = Event(response.data!!)
                } else responseManager.noConnection()


            }, {
                responseManager.hideLoading()
                responseManager.failed(it.message)
            })
        )
    }

    fun closeCenterDetailsSheet() {
        _observeBackClick.value = Event(true)
    }
}