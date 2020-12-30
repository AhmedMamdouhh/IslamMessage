package com.app.newislam.ui.home.services

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.app.newislam.R
import com.app.newislam.databinding.DialogServicesContainerBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.ui.home.home_services.single_service.HomeServiceAdapter
import kotlinx.android.synthetic.main.dialog_services_container.*

class ServicesContainerDialog : BaseDialogFragment() {

    lateinit var binding: DialogServicesContainerBinding
    private val args: ServicesContainerDialogArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogServicesContainerBinding.inflate(inflater, container, false)


        getNavHost()
        return binding.root
    }

    private fun getNavHost() {

        val bundle = bundleOf("serviceList" to args.serviceList)
        NavHostFragment.create(R.navigation.nav_service, bundle)
    }


}