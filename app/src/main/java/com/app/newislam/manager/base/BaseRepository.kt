package com.app.newislam.manager.base

import com.app.newislam.manager.connection.Api
import com.app.newislam.manager.connection.AppSchedulerProvider
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseRepository : KoinComponent {
    val api: Api by inject()
    val appSchedulerProvider: AppSchedulerProvider by inject()
}