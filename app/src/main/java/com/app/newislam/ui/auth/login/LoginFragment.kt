package com.app.newislam.ui.auth.login

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmentLoginBinding
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.model.requests.auth.login.LoginRequest
import com.app.newislam.ui.MainActivity
import com.app.newislam.ui.auth.forgot_password.ForgotPasswordSheet
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginFragment : Fragment() {
    private val loginViewModel: LoginViewModel by viewModel()
    private val userRequest: LoginRequest by inject()
    lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as MainActivity).toolBarVisibility(true)
        (activity as MainActivity).bottomNavigationVisibility(false)

        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.userObject = userRequest
        binding.viewModel = loginViewModel


        observeRegisterClick()
        observeForgotPasswordClick()
        observeSuccess()

        animateScreen()
        return binding.root
    }

    private fun observeSuccess() {
        loginViewModel.observeSuccess.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        })
    }

    private fun observeRegisterClick() {
        loginViewModel.observeRegisterClick.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        })
    }

    private fun observeForgotPasswordClick() {
        loginViewModel.observeForgotPasswordClick.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        })

    }


    private fun animateScreen() {
        val fromRight = AnimationUtils.loadAnimation(activity, R.anim.enter_from_right)
        fromRight.duration = Constants.DELAY_SMALL.toLong()
        binding.tilLoginPassword.animation = fromRight
        binding.btnLoginSubmit.animation = fromRight
        val fromLeft = AnimationUtils.loadAnimation(activity, R.anim.enter_from_left)
        fromLeft.duration = Constants.DELAY_SMALL.toLong()
        binding.tilLoginEmail.animation = fromLeft
        binding.llLoginAskContainer.animation = fromLeft
        val fade = AnimationUtils.loadAnimation(activity, R.anim.bounce)
        fade.duration = Constants.DELAY_SMALL.toLong()
        binding.tvLoginForgotPassword.animation = fade

    }


}