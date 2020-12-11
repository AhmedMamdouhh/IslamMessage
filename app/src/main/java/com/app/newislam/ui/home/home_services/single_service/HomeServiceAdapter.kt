package com.app.newislam.ui.home.home_services.single_service

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemServiceBinding

class HomeServiceAdapter<T>(private val homeServiceList: ArrayList<T>) :
    RecyclerView.Adapter<HomeServiceViewHolder<T>>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeServiceViewHolder<T> =
        HomeServiceViewHolder(ItemServiceBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: HomeServiceViewHolder<T>, position: Int) {
        holder.bind(homeServiceList[position])
    }

    override fun getItemCount() = homeServiceList.size
}

