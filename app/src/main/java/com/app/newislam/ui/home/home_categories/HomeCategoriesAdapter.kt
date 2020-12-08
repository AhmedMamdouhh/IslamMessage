package com.app.newislam.ui.home.home_categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeCategoriesBinding
import com.app.newislam.model.entities.home.HomeCategory
import com.app.newislam.ui.home.HomeViewModel

class HomeCategoriesAdapter(
    private val homeCategoryList: ArrayList<HomeCategory>,
    private val homeViewModel: HomeViewModel,
    private val viewLifecycleOwner: LifecycleOwner
) :
    RecyclerView.Adapter<HomeCategoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCategoryViewHolder =
        HomeCategoryViewHolder(ItemHomeCategoriesBinding.inflate(LayoutInflater.from(parent.context)),parent.context,homeViewModel
        ,viewLifecycleOwner)


    override fun onBindViewHolder(holder: HomeCategoryViewHolder, position: Int) {
        holder.bind(homeCategoryList[position])
    }

    override fun getItemCount() = homeCategoryList.size
}

