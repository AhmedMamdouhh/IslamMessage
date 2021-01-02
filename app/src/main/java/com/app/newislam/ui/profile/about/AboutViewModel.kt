package com.app.newislam.ui.profile.about

import android.app.usage.UsageEvents
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import org.koin.core.inject

class AboutViewModel : BaseViewModel() {

    private val repository by inject<AboutRepository>()
    private val _observeAbout = MutableLiveData<Event<String>>()
    val observeAbout: LiveData<Event<String>>
        get() = _observeAbout


    private val _observeClose = MutableLiveData<Boolean>()
    val observeClose: LiveData<Boolean>
        get() = _observeClose


    init {
        getAboutData()
    }

    private fun getAboutData() {
        _observeAbout.value = Event(repository.fetchAboutData())
    }

    fun onCloseClicked() {
        _observeClose.value = (true)
    }
}