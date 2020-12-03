package com.app.newislam.ui.splash

import android.animation.Animator
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.FragmentSplashBinding
import com.app.newislam.manager.base.ResponseManager
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.ui.MainActivity
import kotlinx.android.synthetic.main.fragment_splash.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.math.hypot

class SplashFragment : Fragment() {
    val splashViewModel: SplashViewModel by viewModel()
    private val responseManager: ResponseManager by inject()

    lateinit var splashBinding: FragmentSplashBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        splashBinding = FragmentSplashBinding.inflate(inflater, container, false)
        return splashBinding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeStatusBar(R.color.colorPrimary)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).toolBarVisibility(false)
        (activity as MainActivity).bottomNavigationVisibility(false)

        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                if (responseManager.isAuthenticated()) findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
                else findNavController().navigate(R.id.action_splashFragment_to_welcomeFragment)
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) { }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) { }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) { }
        })

        animateSplash()
    }

    override fun onResume() {
        super.onResume()
        motionLayout.startLayoutAnimation()
    }

    private fun animateSplash() {
        splashBinding.ivSplashLogo.post(Runnable {
            val anim =
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ViewAnimationUtils.createCircularReveal(
                        splashBinding.motionLayout,
                        splashBinding.motionLayout.width / 2,
                        splashBinding.motionLayout.height / 2, 0f,
                        hypot(
                            splashBinding.motionLayout.width.toDouble(),
                            splashBinding.motionLayout.height.toDouble()
                        ).toFloat()
                    )
                } else {
                    TODO("VERSION.SDK_INT < LOLLIPOP")
                }
            anim.duration = Constants.DELAY_SMALL.toLong()
            anim.start()


        })
    }

    private fun initializeStatusBar(color: Int) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            (activity as MainActivity).window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            (activity as MainActivity).window.statusBarColor = (activity as MainActivity).getColor(color)
        }
    }

    override fun onPause() {
        super.onPause()
        initializeStatusBar(R.color.colorWhite)
    }
}