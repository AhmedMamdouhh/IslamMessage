package com.app.newislam.ui.home.im_services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.databinding.FragmentIslamMessageServicesBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.ui.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class IslamMessageServicesFragment : BaseFragment() {
    lateinit var binding: FragmentIslamMessageServicesBinding
    val viewModel: IslamMessageServicesViewModel by viewModel()
    var islamMessageServicesAdapter: IslamMessageServicesAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (savedInstanceState == null) {
            (activity as MainActivity).toolBarVisibility(true)
            (activity as MainActivity).bottomNavigationVisibility(true)
            binding = FragmentIslamMessageServicesBinding.inflate(layoutInflater)
            viewModel.servicess.observe(viewLifecycleOwner, EventObserver {
                binding.tvIslamMessageServices.apply {
                    layoutManager = LinearLayoutManager(requireContext())
                    islamMessageServicesAdapter =
                        IslamMessageServicesAdapter(it, viewLifecycleOwner)
                    adapter = islamMessageServicesAdapter
                    addItemDecoration(DividerItemDecoration(
                        context,
                        LinearLayoutManager.HORIZONTAL
                    ))
                }
            })
        }
        return binding.root

    }
}