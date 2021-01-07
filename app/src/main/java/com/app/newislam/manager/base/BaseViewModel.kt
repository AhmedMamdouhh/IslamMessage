package com.app.newislam.manager.base

import android.app.Application
import android.content.SharedPreferences
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import io.reactivex.disposables.CompositeDisposable
import org.koin.android.ext.android.inject
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseViewModel : ViewModel(), KoinComponent {
    val responseManager: ResponseManager by inject()
    val disposable: CompositeDisposable by inject()
    val application: Application by inject()



}