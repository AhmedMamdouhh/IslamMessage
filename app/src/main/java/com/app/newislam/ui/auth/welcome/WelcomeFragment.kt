package com.app.newislam.ui.auth.welcome

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.lifecycle.Observer
import com.app.newislam.R
import com.app.newislam.databinding.FragmentWelcomeBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.ui.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class WelcomeFragment : BaseFragment() {

    private val TAG: String? = "234324324"
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
    ): View? {

        welcomeBinding = FragmentWelcomeBinding.inflate(inflater, container, false)
        welcomeBinding.viewModel = welcomeViewModel


        welcomeViewModel.observeGuestClicked.observe(viewLifecycleOwner, Observer {
            if (it){
//                requireActivity().navigateToActivity<HomeActivity>()
                welcomeViewModel.reset()
            }
        })
        welcomeViewModel.observeLoginClicked.observe(viewLifecycleOwner, Observer {
            if (it){
                getNavHost().navigate(R.id.action_welcomeFragment_to_loginFragment)
                welcomeViewModel.reset()
            }
        })




        observeRegisterClicked()
        animateScreen()

        return welcomeBinding.root
    }

    private fun animateScreen() {
        val fromRight = AnimationUtils.loadAnimation(activity, R.anim.enter_from_right)
        fromRight.duration = Constants.DELAY_SMALL.toLong()
        welcomeBinding.tvWelcomeTitle.animation = fromRight
        welcomeBinding.btnWelcomeNewAccount.animation = fromRight


        val fromLeft = AnimationUtils.loadAnimation(activity, R.anim.enter_from_left)
        fromLeft.duration = Constants.DELAY_SMALL.toLong()
        welcomeBinding.tvWelcomeDescription.animation = fromLeft
        welcomeBinding.btnWelcomeLogin.animation=fromLeft


        val fade = AnimationUtils.loadAnimation(activity, R.anim.bounce)
        fade.duration = Constants.DELAY_SMALL.toLong()
        welcomeBinding.ivWelcomeLogo.animation = fade
        welcomeBinding.tvWelcomeGuest.animation = fade

    }
    private fun observeRegisterClicked(){
        welcomeViewModel.observeRegisterClicked.removeObservers(viewLifecycleOwner)
        welcomeViewModel.observeRegisterClicked.observe(viewLifecycleOwner, Observer {
            getNavHost().navigate(R.id.action_welcomeFragment_to_registrationFragment)
        })
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: " )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: " )
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG, "onDetach: " )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: " )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: " )
    }
}