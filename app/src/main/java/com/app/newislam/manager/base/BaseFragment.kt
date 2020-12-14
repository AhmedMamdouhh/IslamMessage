package com.app.newislam.manager.base

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.app.newislam.R

open class BaseFragment : Fragment() {

    fun getNavHost(): NavController {
        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        return navHostFragment.navController
    }
}