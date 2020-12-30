package com.app.newislam.ui.home.services.islamic_centers

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.connection.Resource
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.services.IslamicCenter
import com.app.newislam.repository.home.services.IslamicCentersRepository
import org.koin.core.inject

class IslamicCentersViewModel : BaseViewModel() {

    private var page = 1
    private var hasNextPage = true
    private var items = arrayListOf<IslamicCenter>()
    private val islamicCentersRepository: IslamicCentersRepository by inject()

    private val _observeIslamicCenters = MutableLiveData<Event<PaginationResource<IslamicCenter>>>()
    val observeIslamicCenters: LiveData<Event<PaginationResource<IslamicCenter>>>
        get() = _observeIslamicCenters


    init {
        getIslamicCenters()
    }

    fun updateDataFromServiceList(oldData: PaginationResource<*>) {
        if(oldData.hasNextPage){
            page = oldData.pageIndex+1
            items = oldData.items as ArrayList<IslamicCenter>
        }

    }

    fun getIslamicCenters() {
        if (hasNextPage) {
            disposable.add(
                islamicCentersRepository.getIslamicCenters(page, Constants.PAGE_SIZE)
                    .subscribe({ data ->
                        if (data != null) {
                            _observeIslamicCenters.value = Event(data.data!!)
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


}