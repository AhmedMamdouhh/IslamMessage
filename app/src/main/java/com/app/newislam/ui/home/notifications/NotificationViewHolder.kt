package com.app.newislam.ui.home.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemNotificationBinding
import com.app.newislam.model.entities.home.notification.NotificationResponse
import org.koin.core.KoinComponent
import org.koin.core.inject

class NotificationViewHolder(val binding: ItemNotificationBinding) :
    RecyclerView.ViewHolder(binding.root), KoinComponent {
    val notificationViewModel: NotificationViewModel by inject()

    fun bind(notification: NotificationResponse) {
        binding.notificaiton = notification
        binding.clickListener = notificationViewModel
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): NotificationViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNotificationBinding.inflate(layoutInflater, parent, false)

            return NotificationViewHolder(binding)
        }
    }
}