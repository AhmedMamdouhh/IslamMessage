package com.app.newislam.ui.home.im_services

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemIslamMessageServicesBinding
import com.app.newislam.databinding.ItemNotificationBinding
import com.app.newislam.model.entities.home.im_services.IslamMessageServicesResponse
import com.app.newislam.model.entities.home.notification.NotificationResponse
import com.app.newislam.model.requests.home.centers.IslamicCenterDetailsResponse
import org.koin.core.KoinComponent
import org.koin.core.inject

class IslamMessageServicesViewHolder(val binding: ItemIslamMessageServicesBinding) :
    RecyclerView.ViewHolder(binding.root), KoinComponent {


    fun bind(services: String, servicesViewModel: IslamMessageServicesViewModel) {
        binding.services = services
        binding.clickListener = servicesViewModel
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): IslamMessageServicesViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemIslamMessageServicesBinding.inflate(layoutInflater, parent, false)

            return IslamMessageServicesViewHolder(binding)
        }
    }
}