package com.app.newislam.ui.profile.language

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.LanguageResponse
import org.koin.core.inject

class LanguagesViewModel : BaseViewModel() {

    private val _observeLanguageClick = MutableLiveData<Event<LanguageResponse>>()
    val observeLanguageClick: LiveData<Event<LanguageResponse>> get() = _observeLanguageClick

    private val _observeLanguages = MutableLiveData<Event<List<LanguageResponse>>>()
    val observeLanguages : LiveData<Event<List<LanguageResponse>>> get() = _observeLanguages

    private val languagesRepository :LanguagesRepository by inject()


    init {
        getLanguages()
    }

    fun getLanguages(){
        _observeLanguages.value = Event(languagesRepository.fetchLanguages())
    }

    fun itemLanguageClicked(language: LanguageResponse) {
        _observeLanguageClick.value = Event(language)
    }
}