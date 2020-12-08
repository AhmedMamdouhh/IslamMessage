package com.app.newislam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.databinding.FragmentHomeBinding
import com.app.newislam.manager.utilities.*
import com.app.newislam.ui.MainActivity
import com.app.newislam.ui.home.home_banner.HomeBannerAdapter
import com.app.newislam.ui.home.home_categories.HomeCategoriesAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as MainActivity).toolBarVisibility(false)
        (activity as MainActivity).bottomNavigationVisibility(true)

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        homeViewModel.setBannerData()
        homeViewModel.setCategoriesData()

        observeBannerDataSuccess()
        observeCategoriesDataSuccess()

        return binding.root
    }

    private fun observeCategoriesDataSuccess() {
        homeViewModel.observeCategoriesDataSuccess.observe(viewLifecycleOwner, EventObserver {
            binding.rvHomeCategories.layoutManager = LinearLayoutManager(requireActivity())
            binding.rvHomeCategories.adapter = HomeCategoriesAdapter(it,homeViewModel,viewLifecycleOwner)
        })
    }

    private fun observeBannerDataSuccess() {
        homeViewModel.observeBannerDataSuccess.observe(viewLifecycleOwner, EventObserver {
            binding.viewpager.offscreenPageLimit = 1
            binding.viewpager.adapter = HomeBannerAdapter(it, requireContext())
            binding.viewpager.setPageTransformer(true, ZoomOutPageTransformer())
        })
    }




}