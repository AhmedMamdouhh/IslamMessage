package com.app.newislam.ui.home.home_services.main_services

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeMainServicesBinding
import com.app.newislam.model.entities.home.services.HomeMainServices

class HomeMainServicesAdapter(
    private val homeMainServicesList: ArrayList<HomeMainServices>,
    private val viewLifecycleOwner: LifecycleOwner) :
    RecyclerView.Adapter<HomeMainServicesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMainServicesViewHolder =
        HomeMainServicesViewHolder(ItemHomeMainServicesBinding.inflate(LayoutInflater.from(parent.context)),parent.context
        ,viewLifecycleOwner)


    override fun onBindViewHolder(holder: HomeMainServicesViewHolder, position: Int) {
        holder.bind(homeMainServicesList[position],position)
    }

    override fun getItemCount() = homeMainServicesList.size
}

