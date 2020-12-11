package com.app.newislam.ui.home.home_services.single_service

import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemServiceBinding
import com.app.newislam.manager.utilities.gone
import com.app.newislam.model.entities.home.services.Events
import com.app.newislam.model.entities.home.services.IslamicCenter
import com.app.newislam.model.entities.home.services.News

class HomeServiceViewHolder<T>(private val binding: ItemServiceBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(homeCategory: T) {
        when(homeCategory){

            is IslamicCenter -> {
                binding.tvServiceLocation.text = homeCategory.country
                binding.tvServiceName.text = homeCategory.name
                binding.tvServiceDate.gone()
            }

            is Events -> {
            }

            is News ->{
                binding.tvServiceDate.text = homeCategory.title
                binding.tvServiceName.text = homeCategory.summary
                binding.tvServiceLocation.gone()
            }

        }
    }
}