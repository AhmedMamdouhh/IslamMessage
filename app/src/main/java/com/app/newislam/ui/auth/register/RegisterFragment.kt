package com.app.newislam.ui.auth.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmentRegisterBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.model.requests.auth.register.RegistrationRequest
import com.app.newislam.ui.MainActivity
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class RegisterFragment : Fragment() {

    lateinit var binding: FragmentRegisterBinding
    private val registerViewModel: RegisterViewModel by viewModel()
    private val registerRequest: RegistrationRequest by inject()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as MainActivity).toolBarVisibility(true)
        (activity as MainActivity).bottomNavigationVisibility(false)

        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        binding.userObject = registerRequest
        binding.viewModel = registerViewModel



        animateScreen()
        observeSuccess()
        observeLoginClicked()

        return binding.root
    }

    private fun observeLoginClicked(){
        registerViewModel.observeLoginClicked.observe(viewLifecycleOwner,EventObserver{
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        })
    }

    private fun observeSuccess(){
        registerViewModel.observeSuccess.observe(viewLifecycleOwner,EventObserver{
            val action = RegisterFragmentDirections.actionRegistrationFragmentToActivationCodeSheet(it)
            findNavController().navigate(action)
        })
 }

    private fun animateScreen() {
        val fromRight = AnimationUtils.loadAnimation(activity, R.anim.enter_from_right)
        fromRight.duration = Constants.DELAY_SMALL.toLong()
        binding.tilRegisterEmail.animation = fromRight
        binding.tilRegisterPassword.animation = fromRight

        val fromLeft = AnimationUtils.loadAnimation(activity, R.anim.enter_from_left)
        fromLeft.duration = Constants.DELAY_SMALL.toLong()
        binding.tilRegisterName.animation = fromLeft
        binding.btnRegister.animation=fromLeft


        val fade = AnimationUtils.loadAnimation(activity, R.anim.bounce)
        fade.duration = Constants.DELAY_SMALL.toLong()
        binding.llLoginAskContainer.animation = fade

    }
}