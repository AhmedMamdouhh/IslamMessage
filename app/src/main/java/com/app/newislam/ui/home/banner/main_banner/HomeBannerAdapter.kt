package com.app.newislam.ui.home.banner.main_banner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter
import com.app.newislam.databinding.ItemHomeBannerBinding
import com.app.newislam.model.entities.home.HomeBanner
import com.app.newislam.ui.home.banner.HomeBannerViewModel

class HomeBannerAdapter(
    private val homeBannerList: ArrayList<HomeBanner>,
    private val context: Context,
    private val homeBannerViewModel: HomeBannerViewModel
) :
    PagerAdapter() {


    override fun getCount(): Int = homeBannerList.size
    override fun isViewFromObject(view: View, `object`: Any): Boolean { return view == `object` }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = ItemHomeBannerBinding.inflate(LayoutInflater.from(context), container, false)
        binding.bannerObject = homeBannerList[position]
        binding.bannerListener = homeBannerViewModel

        container.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as CardView)
    }
}