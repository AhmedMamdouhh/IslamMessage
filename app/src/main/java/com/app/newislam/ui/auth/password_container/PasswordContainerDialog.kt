package com.app.newislam.ui.auth.password_container

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.app.newislam.R
import com.app.newislam.databinding.DialogPasswordContainerBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PasswordContainerDialog : BottomSheetDialogFragment() {

    private lateinit var binding: DialogPasswordContainerBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogPasswordContainerBinding.inflate(inflater, container, false)

        setupNavHost()
        onSupportNavigateUp()
        return binding.root
    }

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }



    private fun setupNavHost() {

        val nestedNavHostFragment =
            childFragmentManager.findFragmentById(R.id.fcv_password_host_fragment) as? NavHostFragment
        navController = nestedNavHostFragment!!.navController

        val inflater = navController.navInflater
        val graph = inflater.inflate(R.navigation.nav_password)
        graph.startDestination = R.id.forgot_password_dialog
        navController.graph = graph

        appBarConfiguration = AppBarConfiguration.Builder(graph).build()
        binding.tbPasswordToolbar.setupWithNavController(
            navController,
            appBarConfiguration
        )

    }

    private fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }



}