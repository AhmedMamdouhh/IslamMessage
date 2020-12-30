package com.app.newislam.ui.home.home_services.single_service

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemServiceBinding
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.model.entities.home.services.IslamicCenter

class HomeServiceAdapter<T>(
    private val homeServiceList: PaginationResource<T>,
    private val isSheetList: Boolean
) :
    RecyclerView.Adapter<HomeServiceViewHolder<T>>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeServiceViewHolder<T> =
        HomeServiceViewHolder(ItemServiceBinding.inflate(LayoutInflater.from(parent.context)),
            isSheetList)

    override fun onBindViewHolder(holder: HomeServiceViewHolder<T>, position: Int) {
        holder.bind(homeServiceList.items[position])
    }

    fun addData(moreServices:PaginationResource<T>){
        val homeServiceListSize = homeServiceList.items.size
        homeServiceList.items.addAll(moreServices.items)
        val moreServicesSize = homeServiceList.items.size
        notifyItemRangeChanged(homeServiceListSize,moreServicesSize)
    }

    override fun getItemCount() = homeServiceList.items.size
}

