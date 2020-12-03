package com.app.newislam.ui.home.centers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.requests.home.IslamicCentersResponse
import com.app.newislam.repository.auth.LoginRepository
import org.koin.core.inject

class CentersViewModel : BaseViewModel() {
    private val centersRepository: CentersRepository by inject()

    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess

    private val _islamicCenters = MutableLiveData<Event<IslamicCentersResponse>>()
    val islamicCenters: LiveData<Event<IslamicCentersResponse>>
        get() = _islamicCenters

    init {
        getIslamicCenters()
    }

    fun getIslamicCenters() {
        responseManager.loading()
        disposable.add(
            centersRepository.getIslamicCenters(1, 5).subscribe({ data ->
                responseManager.hideLoading()
                if (data != null) {
                    _observeSuccess.value = Event(true)
                    _islamicCenters.value = Event(data.data!!)
                }
            }, {

            })
        )
    }
}