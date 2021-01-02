package com.app.newislam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.R
import com.app.newislam.databinding.FragmentHomeBinding
import com.app.newislam.manager.utilities.*
import com.app.newislam.model.entities.home.HomeServiceChips
import com.app.newislam.ui.MainActivity
import com.app.newislam.ui.home.home_banner.HomeBannerAdapter
import com.app.newislam.ui.home.home_services.main_services.HomeMainServicesAdapter
import com.google.android.material.chip.Chip
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModel()

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (savedInstanceState == null) {
            (activity as MainActivity).toolBarVisibility(false)
            (activity as MainActivity).bottomNavigationVisibility(true)

            binding = FragmentHomeBinding.inflate(inflater, container, false)

            observeBannerDataSuccess()
            observeMainServiceDataSuccess()
            observeChipsDataSuccess()

            //findNavController().navigate(R.id.languagesFragment)
            findNavController().navigate(R.id.aboutFragment)
        }
        return binding.root
    }

    private fun observeChipsDataSuccess() {
        homeViewModel.observeChipsDataSuccess.observe(viewLifecycleOwner,EventObserver{
            createChips(it)
        })
    }

    private fun observeMainServiceDataSuccess() {
        homeViewModel.observeMainServicesDataSuccess.observe(viewLifecycleOwner, EventObserver {
            binding.rvHomeMainServices.layoutManager = LinearLayoutManager(requireActivity())
            binding.rvHomeMainServices.adapter = HomeMainServicesAdapter(it,viewLifecycleOwner,homeViewModel)
        })
    }

    private fun observeBannerDataSuccess() {
        homeViewModel.homeBannerViewModel.observeHomeBannerData.observe(viewLifecycleOwner, EventObserver {
            binding.vpHomeBannerPager.offscreenPageLimit = 1
            binding.vpHomeBannerPager.adapter = HomeBannerAdapter(it, requireContext())
            binding.vpHomeBannerPager.setPageTransformer(true, ZoomOutPageTransformer())
        })
    }

    private fun createChips(chips: ArrayList<HomeServiceChips>) {
        chips.map {
            val chip = Chip(requireContext())
            chip.text = it.homeChipsName
            chip.setChipBackgroundColorResource(R.color.colorAccent)
            chip.setTextAppearanceResource(R.style.ChipTextStyle)
            binding.cgHomeServicesChips.addView(chip)
        }
    }


}