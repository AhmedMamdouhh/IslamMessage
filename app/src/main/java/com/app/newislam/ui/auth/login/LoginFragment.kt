package com.app.newislam.ui.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.app.newislam.R
import com.app.newislam.databinding.FragmentLoginBinding
import com.app.newislam.di.viewModelModule
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.requests.auth.login.LoginRequest
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.toolbar.view.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.math.log


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
        binding.toolbar.tv_title.text = "Login"
        binding.toolbar.iv_back.setOnClickListener {
            getNavHost().popBackStack()
        }

        binding.layoutAskRegister.setOnClickListener {
            getNavHost().navigate(R.id.action_loginFragment_to_registrationFragment)
        }

        navigation()
        return binding.root
    }

    private fun navigation() {
        loginViewModel.navigateToForgotPassword.observe(viewLifecycleOwner, Observer {
            if (it){
                getNavHost().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
                loginViewModel.navigateToForgotPassword.value = false
            }

        })
    }


}