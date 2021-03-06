package com.app.newislam.ui.home.chips

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.HomeMainServices
import com.app.newislam.repository.home.chips.ChipsRepository
import org.koin.core.inject

class ChipsViewModel : BaseViewModel() {

    private val chipsRepository: ChipsRepository by inject()
    private val _observeChipsServicesData = MutableLiveData<Event<ArrayList<HomeMainServices>>>()


    init {
        getChipsData()
    }


    private fun getChipsData() {

        disposable.add(
            chipsRepository.getChipsService()
                .subscribe({ chipsServicesData ->
                    if (chipsServicesData != null) {
                        _observeChipsServicesData.value = Event(chipsServicesData.data!!)
                    } else responseManager.noConnection()
                }, {
                    responseManager.failed(it.message)
                })
        )
    }

    val observeChipsServicesData: LiveData<Event<ArrayList<HomeMainServices>>>
        get() = _observeChipsServicesData
}