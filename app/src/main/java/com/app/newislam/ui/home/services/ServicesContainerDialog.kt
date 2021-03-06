package com.app.newislam.ui.home.services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavArgument
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import com.app.newislam.R
import com.app.newislam.databinding.DialogServicesContainerBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.Constants


class ServicesContainerDialog : BaseDialogFragment() {

    lateinit var binding: DialogServicesContainerBinding
    private val args: ServicesContainerDialogArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogServicesContainerBinding.inflate(inflater, container, false)

        setupNavHost()
        return binding.root
    }


    private fun setupNavHost() {

        val nestedNavHostFragment =
            childFragmentManager.findFragmentById(R.id.fcv_services_host_fragment) as? NavHostFragment
        val navController = nestedNavHostFragment?.navController
        val inflater = navController?.navInflater
        val graph = inflater?.inflate(R.navigation.nav_service)
        graph?.startDestination = R.id.servicesListDialog

        val bundle = bundleOf(
            Constants.BUNDLE_SERVICE_LIST to args.serviceList,
            Constants.BUNDLE_SERVICE_ID to args.serviceId
        )

        navController?.setGraph(graph!!, bundle)
    }


}