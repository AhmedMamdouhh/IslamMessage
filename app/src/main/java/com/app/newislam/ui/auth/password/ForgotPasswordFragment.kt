package com.app.newislam.ui.auth.password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.newislam.databinding.FragmentForgotPasswordBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import kotlinx.android.synthetic.main.toolbar.view.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class ForgotPasswordFragment : BaseFragment() {

    lateinit var binding: FragmentForgotPasswordBinding
    val viewModel: ForgotPasswordViewModel by viewModel()
    val forgetPasswordRequest: ForgetPasswordRequest by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        binding.forgotPassRequest = forgetPasswordRequest
        binding.viewModel = viewModel
        binding.toolbar.tv_title.text = "Forget Password"
        binding.toolbar.iv_back.setOnClickListener {
            getNavHost().popBackStack()
        }
        return binding.root
    }
}