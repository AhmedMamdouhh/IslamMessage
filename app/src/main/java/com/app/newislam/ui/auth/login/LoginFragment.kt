package com.app.newislam.ui.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.app.newislam.R
import com.app.newislam.databinding.FragmentLoginBinding
import com.app.newislam.model.Resource
import com.app.newislam.model.requests.auth.login.LoginRequest
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.toolbar.view.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginFragment : Fragment() {
    val loginViewModel: LoginViewModel by viewModel()
    val userRequest: LoginRequest by inject ()
    lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate( inflater,container,false)
        binding.userObject = userRequest
        binding.viewModel = loginViewModel
        binding.toolbar.tv_title.text = "Login"

        loginViewModel.resource.observe(viewLifecycleOwner, Observer {
           if (it!=null){
               when(it.resourceStatus){
                   Resource.ResourceStatus.SUCCESS->{
                       loadingView.visibility = View.GONE
                   }
                   Resource.ResourceStatus.LOADING->{
                       loadingView.visibility = View.VISIBLE
                       loadingView.playAnimation()
                   }
                   Resource.ResourceStatus.FAILED->{
                       loadingView.visibility = View.GONE
                   }
               }
           }
        })
        return binding.root
    }
}