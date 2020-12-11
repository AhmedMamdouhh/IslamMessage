package com.app.newislam.ui.auth.welcome

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmentWelcomeBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.ui.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class WelcomeFragment : Fragment() {

    private val welcomeViewModel: WelcomeViewModel by viewModel()
    private lateinit var welcomeBinding: FragmentWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity).toolBarVisibility(false)
        (activity as MainActivity).bottomNavigationVisibility(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        welcomeBinding = FragmentWelcomeBinding.inflate(inflater, container, false)
        welcomeBinding.viewModel = welcomeViewModel


        observeRegisterClicked()
        observeLoginClicked()
        observeGuestClicked()
        animateScreen()


        return welcomeBinding.root
    }

    private fun observeGuestClicked() {
        welcomeViewModel.observeGuestClicked.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
        })
    }

    private fun observeLoginClicked() {
        welcomeViewModel.observeLoginClicked.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        })
    }

    private fun observeRegisterClicked() {
        welcomeViewModel.observeRegisterClicked.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_welcomeFragment_to_registrationFragment)
        })
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).toolBarVisibility(false)
        (activity as MainActivity).bottomNavigationVisibility(false)
    }


    private fun animateScreen() {
        val fromRight = AnimationUtils.loadAnimation(activity, R.anim.enter_from_right)
        fromRight.duration = Constants.DELAY_SMALL.toLong()
        welcomeBinding.tvWelcomeTitle.animation = fromRight
        welcomeBinding.btnWelcomeNewAccount.animation = fromRight


        val fromLeft = AnimationUtils.loadAnimation(activity, R.anim.enter_from_left)
        fromLeft.duration = Constants.DELAY_SMALL.toLong()
        welcomeBinding.tvWelcomeDescription.animation = fromLeft
        welcomeBinding.btnWelcomeLogin.animation = fromLeft


        val fade = AnimationUtils.loadAnimation(activity, R.anim.bounce)
        fade.duration = Constants.DELAY_SMALL.toLong()
        welcomeBinding.ivWelcomeLogo.animation = fade
        welcomeBinding.tvWelcomeGuest.animation = fade

    }


}