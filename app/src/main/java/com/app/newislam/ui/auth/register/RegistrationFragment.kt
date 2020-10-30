package com.app.newislam.ui.auth.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.app.newislam.R
import com.app.newislam.databinding.FragmentRegisterBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import kotlinx.android.synthetic.main.toolbar.view.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class RegistrationFragment : BaseFragment() {
    lateinit var binding: FragmentRegisterBinding
    val viewModel: RegisterViewModel by viewModel()
    val registrationRequest: RegistrationRequest by inject()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        binding.userObject = registrationRequest
        binding.viewModel = viewModel
        viewModel.navigateToLogin.observe(this, Observer {
            if (it) {
                getNavHost().navigate(R.id.action_registrationFragment_to_loginFragment)
                viewModel.reset()
            }
        })
        binding.toolbar.iv_back.setOnClickListener {
            getNavHost().popBackStack()
        }
        return binding.root
    }
}