package com.app.newislam.ui.home.home_categories

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeCategoriesBinding
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.entities.home.*
import com.app.newislam.ui.home.HomeViewModel
import com.app.newislam.ui.home.home_categories.home_single_category.HomeSingleCategoryAdapter

class HomeCategoryViewHolder(
    private val binding: ItemHomeCategoriesBinding, private val context: Context,
    private val homeViewModel: HomeViewModel,
    private val viewLifecycleOwner: LifecycleOwner
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(homeCategory: HomeCategory) {
        binding.tvHomeCategoriesTitle.text = homeCategory.categoryTitle
        binding.rvSingleHomeCategories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)

        observe()
    }

    private fun observe() {
        homeViewModel.observeIslamicCentersDataSuccess.observe(
            viewLifecycleOwner,
            EventObserver {
                binding.rvSingleHomeCategories.adapter = HomeSingleCategoryAdapter(it)
            })
    }
}