package com.app.newislam.ui.profile.terms

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import org.koin.core.inject

class TermsAndConditionsViewModel : BaseViewModel() {

    private val repository by inject<TermsAndConditionsRepository>()
    private val _observeTerms = MutableLiveData<Event<String>>()
    val observeTerms: LiveData<Event<String>>
        get() = _observeTerms


    private val _observeClose = MutableLiveData<Event<Boolean>>()
    val observeClose: LiveData<Event<Boolean>>
        get() = _observeClose


    init {
        getAboutData()
    }

    private fun getAboutData() {
        _observeTerms.value = Event(repository.fetchAboutData())
    }

    fun onCloseClicked() {
        _observeClose.value = Event(true)
    }
}