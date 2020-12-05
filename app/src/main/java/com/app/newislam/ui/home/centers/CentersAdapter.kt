package com.app.newislam.ui.home.centers

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.R
import com.app.newislam.databinding.ItemIslamicCenterBinding
import com.app.newislam.model.requests.home.Centers
import com.app.newislam.model.requests.home.IslamicCentersResponse


class CentersAdapter :
    ListAdapter<Centers, CentersAdapter.CentersViewHolder>(CentersDiffCallback()), Filterable {

    var mFilteredList: List<Centers>? = null
    var mCentersList: List<Centers>? = null

    class CentersViewHolder(val binding: ItemIslamicCenterBinding) :
        RecyclerView.ViewHolder(binding.root) {
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
        viewHolder.bind(getItem(position))
    }


    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {

                val charString = charSequence.toString()

                if (charString.isEmpty()) {

                    mFilteredList = mCentersList
                } else {
                    mCentersList?.let {
                        val filteredList = arrayListOf<Centers>()
                        for (baseDataItem in mCentersList!!) {
                            if (baseDataItem.name.toLowerCase().contains(charString.toLowerCase())) {
                                filteredList.add(baseDataItem)
                            }
                        }

                        mFilteredList = filteredList
                    }
                }
                val filterResults = FilterResults()
                filterResults.values = mFilteredList
                return filterResults
            }

            override fun publishResults(
                charSequence: CharSequence,
                filterResults: FilterResults
            ) {
                mFilteredList = filterResults.values as List<Centers>?
                submitList(mFilteredList)
                notifyDataSetChanged()
            }
        }
    }

    class CentersDiffCallback : DiffUtil.ItemCallback<Centers>() {
        override fun areItemsTheSame(oldItem: Centers, newItem: Centers): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Centers, newItem: Centers): Boolean {
            return oldItem == newItem
        }

    }
}