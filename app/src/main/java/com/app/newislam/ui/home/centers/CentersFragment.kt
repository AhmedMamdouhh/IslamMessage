package com.app.newislam.ui.home.centers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.databinding.FragmentIslamicCentersBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.requests.home.IslamicCentersResponse
import org.koin.androidx.viewmodel.ext.android.viewModel

class CentersFragment : BaseDialogFragment() {

    val centersViewModel: CentersViewModel by viewModel()

    lateinit var binding: FragmentIslamicCentersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIslamicCentersBinding.inflate(inflater, container, false)
        val root = binding.root
        centersViewModel.islamicCenters.observe(this, EventObserver { event ->

            binding.rvCenters.apply {
                adapter = CentersAdapter(event)
                layoutManager = LinearLayoutManager(requireContext())
            }
        })
        return root
    }
}