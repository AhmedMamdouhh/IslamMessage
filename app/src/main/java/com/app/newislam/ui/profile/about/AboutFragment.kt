package com.app.newislam.ui.profile.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmnetAboutBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.EventObserver
import org.koin.androidx.viewmodel.ext.android.viewModel

class AboutFragment : BaseDialogFragment() {


    private val viewModel by viewModel<AboutViewModel>()
    private lateinit var binding: FragmnetAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmnetAboutBinding.inflate(layoutInflater)
        binding.viewModel= viewModel
        viewModel.observeAbout.observe(viewLifecycleOwner, EventObserver {
            binding.tvAbout.text = it
        })


        viewModel.observeClose.observe(viewLifecycleOwner, Observer {
            if (it)
            this.dialog?.dismiss()
        })


        return binding.root
    }

}