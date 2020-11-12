package com.app.newislam.ui.splash

import android.animation.Animator
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewGroup
import com.app.newislam.databinding.FragmentSplashBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.ui.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.math.hypot

class SplashFragment : BaseFragment() {
    val splashViewModel: SplashViewModel by viewModel()
    lateinit var splashBinding: FragmentSplashBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        splashBinding = FragmentSplashBinding.inflate(inflater, container, false)
        return splashBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).toolBarVisibility(false)
        (activity as MainActivity).bottomNavigationVisibility(false)

        animateSplash()
    }

    private fun animateSplash() {
        splashBinding.ivSplashLogo.post(Runnable {
            val anim =
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ViewAnimationUtils.createCircularReveal(
                        splashBinding.llSplashParent,
                        splashBinding.llSplashParent.width / 2,
                        splashBinding.llSplashParent.height / 2, 0f,
                        hypot(
                            splashBinding.llSplashParent.width.toDouble(),
                            splashBinding.llSplashParent.height.toDouble()
                        ).toFloat()
                    )
                } else {
                    TODO("VERSION.SDK_INT < LOLLIPOP")
                }
            anim.duration = Constants.DELAY_SMALL.toLong()
            anim.start()


        })
    }
}