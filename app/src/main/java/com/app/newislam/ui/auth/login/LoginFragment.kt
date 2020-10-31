package com.app.newislam.ui.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.lifecycle.Observer
import com.app.newislam.R
import com.app.newislam.databinding.FragmentLoginBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.model.requests.auth.login.LoginRequest
import kotlinx.android.synthetic.main.toolbar.view.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginFragment : BaseFragment() {
    val loginViewModel: LoginViewModel by viewModel()
    val userRequest: LoginRequest by inject()
    lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.userObject = userRequest
        binding.viewModel = loginViewModel
        binding.toolbar.tv_title.text = getString(R.string.login_title)
        binding.toolbar.iv_back.setOnClickListener {
            getNavHost().popBackStack()
        }

        binding.layoutAskRegister.setOnClickListener {
            getNavHost().navigate(R.id.action_loginFragment_to_registrationFragment)
        }

        navigation()
        animateScreen()


        return binding.root
    }

    private fun navigation() {
        loginViewModel.navigateToForgotPassword.observe(viewLifecycleOwner, Observer {
            if (it) {
                getNavHost().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
                loginViewModel.navigateToForgotPassword.value = false
            }

        })
    }

    private fun animateScreen() {
        val fromRight = AnimationUtils.loadAnimation(activity, R.anim.enter_from_right)
        fromRight.duration = Constants.DELAY_SMALL.toLong()
        binding.tilLoginPassword.animation = fromRight
        binding.btnLogin.animation = fromRight
        val fromLeft = AnimationUtils.loadAnimation(activity, R.anim.enter_from_left)
        fromLeft.duration = Constants.DELAY_SMALL.toLong()
        binding.tilLoginEmail.animation = fromLeft
        binding.layoutAskRegister.animation=fromLeft
        val fade = AnimationUtils.loadAnimation(activity, R.anim.bounce)
        fade.duration = Constants.DELAY_SMALL.toLong()
        binding.tvForgotPassword.animation = fade

    }


}