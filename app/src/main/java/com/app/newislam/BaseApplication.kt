package com.app.newislam

import android.app.Application
import com.app.newislam.di.apiModule
import com.app.newislam.di.dataModule
import com.app.newislam.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            modules(listOf(dataModule, apiModule,viewModelModule))
        }

    }
}