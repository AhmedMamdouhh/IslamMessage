package com.app.newislam.ui.home.banner

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.HomeBanner
import com.app.newislam.repository.home.banner.HomeBannerRepository
import org.koin.core.inject

class HomeBannerViewModel : BaseViewModel() {

    private val homeBannerRepository: HomeBannerRepository by inject()
    private val _observeHomeBannerData = MutableLiveData<Event<ArrayList<HomeBanner>>>()
    private val _observeHomeBannerClicked = MutableLiveData<Event<HomeBanner>>()

   init {
       getBannerData()
   }


    fun onBannerClicked(homeBannerId : HomeBanner){
        _observeHomeBannerClicked.value = Event(homeBannerId)
    }


    private fun getBannerData() {

        disposable.add(
            homeBannerRepository.getHomeBanner()
                .subscribe({ homeBannerData ->
                    if (homeBannerData != null) {
                        _observeHomeBannerData.value = Event(homeBannerData.data!!)
                    } else responseManager.noConnection()
                }, {
                    responseManager.failed(it.message)
                })
        )

    }

    val observeHomeBannerData: LiveData<Event<ArrayList<HomeBanner>>>
        get() = _observeHomeBannerData

    val observeHomeBannerClicked: LiveData<Event<HomeBanner>>
        get() = _observeHomeBannerClicked
}