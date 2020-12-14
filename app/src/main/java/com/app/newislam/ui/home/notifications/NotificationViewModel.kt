package com.app.newislam.ui.home.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Event
import com.app.newislam.model.entities.home.notification.NotificationResponse
import org.koin.core.inject

class NotificationViewModel : BaseViewModel() {
    private val notificationRepository: NotificationRepository by inject()
    private var page = 1
    private var hasNextPage = false
    private val items = arrayListOf<NotificationResponse>()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()
    private val _observeNotificationClick = MutableLiveData<Event<Boolean>>()
    private val _moreNotifications = MutableLiveData<Event<List<NotificationResponse>>>()
    private val _notifications = MutableLiveData<Event<ArrayList<NotificationResponse>>>()



    fun getNotifications() {
        _notifications.value = Event(notificationRepository.getNotifications())
    }


    fun notificationItemClicked() {
        _observeNotificationClick.value = Event(true)
    }


    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess

    val notifications: LiveData<Event<ArrayList<NotificationResponse>>>
        get() = _notifications

    val moreNotifications: LiveData<Event<List<NotificationResponse>>>
        get() = _moreNotifications

    val observeNotificationClick: LiveData<Event<Boolean>>
        get() = _observeNotificationClick
}