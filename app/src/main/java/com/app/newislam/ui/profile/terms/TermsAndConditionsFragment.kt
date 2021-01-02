package com.app.newislam.ui.profile.terms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmentTermsBinding
import com.app.newislam.databinding.FragmnetAboutBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.EventObserver
import org.koin.androidx.viewmodel.ext.android.viewModel

class TermsAndConditionsFragment : BaseDialogFragment() {

    private val viewModel by viewModel<TermsAndConditionsViewModel>()
    private lateinit var binding: FragmentTermsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTermsBinding.inflate(layoutInflater)
        binding.viewModel= viewModel
        viewModel.observeTerms.observe(viewLifecycleOwner, EventObserver {
            binding.tvTerms.text = it
        })

        viewModel.observeClose.observe(viewLifecycleOwner, EventObserver {
            this.dialog?.dismiss()
        })


        return binding.root
    }

}