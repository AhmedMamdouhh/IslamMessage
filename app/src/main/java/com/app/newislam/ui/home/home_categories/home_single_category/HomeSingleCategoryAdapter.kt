package com.app.newislam.ui.home.home_categories.home_single_category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeCategoriesBinding
import com.app.newislam.databinding.ItemHomeSingleCategoryBinding
import com.app.newislam.model.entities.home.HomeCategory
import com.app.newislam.ui.home.home_categories.HomeCategoryViewHolder
import com.app.newislam.ui.home.home_categories.home_single_category.HomeSingleCategoryViewHolder

class HomeSingleCategoryAdapter<T>(private val homeCategoryList: ArrayList<T>) :
    RecyclerView.Adapter<HomeSingleCategoryViewHolder<T>>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeSingleCategoryViewHolder<T> =
        HomeSingleCategoryViewHolder(ItemHomeSingleCategoryBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: HomeSingleCategoryViewHolder<T>, position: Int) {
        holder.bind(homeCategoryList[position])
    }

    override fun getItemCount() = homeCategoryList.size
}

