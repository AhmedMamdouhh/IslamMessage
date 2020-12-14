package com.app.newislam.ui.home.notifications

import com.app.newislam.manager.base.BaseRepository
import com.app.newislam.model.entities.home.notification.NotificationResponse

class NotificationRepository : BaseRepository() {

    private val listOfNotifications = arrayListOf<NotificationResponse>()

    fun getNotifications(): ArrayList<NotificationResponse> {
        listOfNotifications.add(NotificationResponse(1, "One", "islamic news notification text one", "2 minutes"))
        listOfNotifications.add(NotificationResponse(2, "Two", "islamic news notification text two", "1 hours"))
        listOfNotifications.add(NotificationResponse(3, "Three", "islamic news notification text three", "3 hours"))
        listOfNotifications.add(NotificationResponse(4, "Four", "islamic news notification text", "2 hours"))
        listOfNotifications.add(NotificationResponse(5, "Five", "islamic news notification text 000..", "4 hours"))
        listOfNotifications.add(NotificationResponse(6, "Six", "islamic news notification text ...", "0 hours"))
        listOfNotifications.add(NotificationResponse(7, "Seven", "islamic news notification text?", "2 hours"))
        listOfNotifications.add(NotificationResponse(8, "Eight", "islamic news notification text?", "2 hours"))
        return listOfNotifications
    }
}