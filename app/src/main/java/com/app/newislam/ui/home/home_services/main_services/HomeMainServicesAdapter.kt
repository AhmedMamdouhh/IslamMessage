package com.app.newislam.ui.home.home_services.main_services

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeMainServicesBinding
import com.app.newislam.model.entities.home.HomeMainServices
import com.app.newislam.ui.home.HomeViewModel
import kotlin.collections.ArrayList

class HomeMainServicesAdapter(
    private val homeMainServicesList: ArrayList<HomeMainServices>,
    private val viewLifecycleOwner: LifecycleOwner,
    private val homeViewModel: HomeViewModel
) :
    RecyclerView.Adapter<HomeMainServicesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMainServicesViewHolder =
        HomeMainServicesViewHolder(
            ItemHomeMainServicesBinding.inflate(LayoutInflater.from(parent.context)),
            parent.context,
            viewLifecycleOwner,
            homeViewModel,
            homeMainServicesList
        )


    override fun onBindViewHolder(holder: HomeMainServicesViewHolder, position: Int) {
        holder.binding.tvHomeMainServicesSeeAll.setOnClickListener { holder.observeSeeAllClicked() }
        holder.bind(homeMainServicesList[position])
    }

    override fun getItemCount() = homeMainServicesList.size
}

