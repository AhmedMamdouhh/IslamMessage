package com.app.newislam.ui.home.im_services

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class IslamMessageServicesAdapter(
     val services: ArrayList<String>,
     val servicesViewModel: IslamMessageServicesViewModel
) : RecyclerView.Adapter<IslamMessageServicesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IslamMessageServicesViewHolder =
        IslamMessageServicesViewHolder.from(parent)


    override fun onBindViewHolder(holder: IslamMessageServicesViewHolder, position: Int) {
        holder.bind(services[position],servicesViewModel)
    }

    fun remove(position: Int){
        services.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }
    override fun getItemCount() = services.size


}
