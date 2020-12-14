package com.app.newislam.ui.home.im_services

import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.entities.home.im_services.IslamMessageServicesResponse

class IslamMessageServicesAdapter(
     val services: ArrayList<IslamMessageServicesResponse>,
    private val viewLifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<IslamMessageServicesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IslamMessageServicesViewHolder =
        IslamMessageServicesViewHolder.from(parent)


    override fun onBindViewHolder(holder: IslamMessageServicesViewHolder, position: Int) {
        holder.bind(services[position])
        holder.servicesViewModel.observeservicesClick.observe(viewLifecycleOwner,
            EventObserver {
                //TODO:
            })

    }

    fun remove(position: Int){
        services.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }
    override fun getItemCount() = services.size


}
