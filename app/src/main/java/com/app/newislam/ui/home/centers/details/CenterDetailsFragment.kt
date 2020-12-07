package com.app.newislam.ui.home.centers.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.widget.NestedScrollView
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.FragmentCenterDetailsBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.EventObserver
import org.koin.androidx.viewmodel.ext.android.viewModel


class CenterDetailsFragment : BaseDialogFragment() {
    val centerDetailsViewModel: CenterDetailsViewModel by viewModel()
    private val args: CenterDetailsFragmentArgs by navArgs()


    lateinit var binding: FragmentCenterDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCenterDetailsBinding.inflate(inflater, container, false)
        val root = binding.root

        centerDetailsViewModel.centerId = args.centerId
        centerDetailsViewModel.getIslamicCenterData()

        observeCenterDetails()

        observeBackClick()



        binding.nsvCenterDetails.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (scrollY > oldScrollY) {
                ViewCompat.setElevation(binding.centerToolbar, 30f)
            }
            if (scrollY < oldScrollY) {
                ViewCompat.setElevation(binding.centerToolbar, 0f)
            }
        })

        return root
    }

    private fun observeCenterDetails() {
        centerDetailsViewModel.islamicCenterDetails.observe(this, EventObserver { data ->
            binding.centerDetails = data
        })
    }

    private fun observeBackClick() {
        centerDetailsViewModel.observeBackClick.observe(this, EventObserver {
            dismiss()
        })
    }
}