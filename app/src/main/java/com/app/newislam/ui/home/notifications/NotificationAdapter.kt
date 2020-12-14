package com.app.newislam.ui.home.notifications

import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.entities.home.notification.NotificationResponse

class NotificationAdapter(
     val notifications: ArrayList<NotificationResponse>,
    private val viewLifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<NotificationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder =
         NotificationViewHolder.from(parent)


    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(notifications[position])
        holder.notificationViewModel.observeNotificationClick.observe(viewLifecycleOwner,
            EventObserver {
                //TODO:
            })

    }

    fun remove(position: Int){
        notifications.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }
    override fun getItemCount() = notifications.size


}
