package com.app.newislam.ui.auth.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.Observer
import androidx.navigation.Navigation.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmentWelcomeBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.navigateToActivity
import com.app.newislam.ui.home.HomeActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class WelcomeFragment : BaseFragment() {

    val viewModel: WelcomeViewModel by viewModel()
    lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        viewModel.navigateToHome.observe(viewLifecycleOwner, Observer {
            if (it){
                requireActivity().navigateToActivity<HomeActivity>()
                viewModel.reset()
            }
        })
        viewModel.navigateToLoggin.observe(viewLifecycleOwner, Observer {
            if (it){
                getNavHost().navigate(R.id.action_welcomeFragment_to_loginFragment)
                viewModel.reset()
            }
        })

        viewModel.navigateToRegister.observe(viewLifecycleOwner, Observer {
            if (it){
                getNavHost().navigate(R.id.action_welcomeFragment_to_registrationFragment)
                viewModel.reset()
            }
        })

        return binding.root
    }
}