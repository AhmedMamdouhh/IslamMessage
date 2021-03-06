package com.app.newislam.ui.home.home_services.single_service

import android.content.res.Resources
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemServiceBinding
import com.app.newislam.manager.utilities.gone
import com.app.newislam.model.entities.home.services.Events
import com.app.newislam.model.entities.home.services.IslamicCenter
import com.app.newislam.model.entities.home.services.News


class HomeServiceViewHolder<T>(
    private val binding: ItemServiceBinding,
    private val isSheetList: Boolean
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(homeCategory: T) {

        setImageToMatchParent()
        when (homeCategory) {

            is IslamicCenter -> {
                binding.tvServiceLocation.text = homeCategory.country
                binding.tvServiceName.text = homeCategory.name
                binding.tvServiceDate.gone()
            }

            is Events -> {
                binding.tvServiceLocation.text = homeCategory.address
                binding.tvServiceName.text = homeCategory.title
                binding.tvServiceDate.gone()
            }

            is News -> {
                binding.tvServiceDate.text = homeCategory.title
                binding.tvServiceName.text = homeCategory.summary
                binding.tvServiceLocation.gone()
            }

        }
    }

    private fun setImageToMatchParent() {
        if (isSheetList) {
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            binding.llServiceParent.layoutParams = params

            val layoutParams =
                binding.cvServiceImageContainer.layoutParams as LinearLayout.LayoutParams
            layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT
            layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT
            binding.cvServiceImageContainer.layoutParams = layoutParams
        }
    }
}