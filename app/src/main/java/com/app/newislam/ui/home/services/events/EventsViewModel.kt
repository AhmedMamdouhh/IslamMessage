package com.app.newislam.ui.home.services.events

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.services.Events
import com.app.newislam.repository.home.services.EventsRepository
import org.koin.core.inject

class EventsViewModel : BaseViewModel() {

    private var page = 1
    private var hasNextPage = true
    private var items = arrayListOf<Events>()
    private val eventsRepository: EventsRepository by inject()

    private val _observeEvents = MutableLiveData<Event<PaginationResource<Events>>>()



    init {
        getEvents()
    }

    fun updateDataFromServiceList(oldData: PaginationResource<*>) {
        if(oldData.hasNextPage){
            page = oldData.pageIndex+1
            items = oldData.items as ArrayList<Events>
        }

    }

    fun getEvents() {
        if (hasNextPage) {
            disposable.add(
                eventsRepository.getEvents(page, Constants.PAGE_SIZE)
                    .subscribe({ data ->
                        if (data != null) {
                            _observeEvents.value = Event(data.data!!)
                            items.addAll(data.data?.items!!)
                            hasNextPage = data.data?.hasNextPage ?: false
                            page = data.data!!.pageIndex + 1
                        } else responseManager.noConnection()
                    }, {
                        responseManager.failed(it.message)
                    })
            )
        }
    }

    val observeEvents: LiveData<Event<PaginationResource<Events>>>
        get() = _observeEvents


}