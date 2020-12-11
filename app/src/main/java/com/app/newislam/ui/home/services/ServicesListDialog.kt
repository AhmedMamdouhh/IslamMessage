package com.app.newislam.ui.home.services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.newislam.databinding.DialogServiceListBinding
import com.app.newislam.manager.base.BaseDialogFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class ServicesListDialog : BaseDialogFragment() {

    private val serviceListViewModel:ServiceListViewModel by viewModel()
    lateinit var binding: DialogServiceListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogServiceListBinding.inflate(inflater,container,false)



        return binding.root
    }
}