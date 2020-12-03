package com.app.newislam.ui.home.centers

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.R
import com.app.newislam.databinding.ItemIslamicCenterBinding
import com.app.newislam.model.requests.home.Centers
import com.app.newislam.model.requests.home.IslamicCentersResponse


class CentersAdapter(private val islamicCentersResponse: IslamicCentersResponse) :
    RecyclerView.Adapter<CentersAdapter.CentersViewHolder>() {


     class CentersViewHolder (val binding: ItemIslamicCenterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(center: Centers) {
            binding.center = center
            binding.executePendingBindings()
        }
         companion object {
             fun from(parent: ViewGroup): CentersViewHolder {
                 val layoutInflater = LayoutInflater.from(parent.context)
                 val binding = ItemIslamicCenterBinding.inflate(layoutInflater, parent, false)

                 return CentersViewHolder(binding)
             }
         }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CentersViewHolder {
        return CentersViewHolder.from(viewGroup)
    }

    override fun onBindViewHolder(viewHolder: CentersViewHolder, position: Int) {
        viewHolder.bind(islamicCentersResponse.items[position])
    }

    override fun getItemCount() = islamicCentersResponse.items.size

}