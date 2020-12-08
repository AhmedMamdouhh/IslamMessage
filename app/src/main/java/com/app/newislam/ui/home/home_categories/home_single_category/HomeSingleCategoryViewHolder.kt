package com.app.newislam.ui.home.home_categories.home_single_category

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeCategoriesBinding
import com.app.newislam.databinding.ItemHomeSingleCategoryBinding
import com.app.newislam.manager.utilities.gone
import com.app.newislam.model.entities.home.CategoryItem
import com.app.newislam.model.entities.home.HomeBanner
import com.app.newislam.model.entities.home.HomeCategory
import com.app.newislam.model.entities.home.IslamicCenter

class HomeSingleCategoryViewHolder<T>(private val binding: ItemHomeSingleCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(homeCategory: T) {
        when(homeCategory){

            is IslamicCenter-> {
                binding.tvHomeSingleLocation.text = homeCategory.islamicCenterLocation
                binding.tvHomeSingleTitle.text = homeCategory.islamicCenterTitle
                binding.tvHomeSingleTime.gone()
            }

        }
    }
}