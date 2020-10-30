package com.app.newislam.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.app.newislam.R
import com.app.newislam.manager.base.BaseActivity
import com.app.newislam.ui.auth.login.LoginFragment
import com.app.newislam.ui.home.HomeActivity


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNavigation()
    }

    private fun userNavigation(){
        Handler(Looper.getMainLooper()).postDelayed({
            baseViewModel.isUserAuthenticated.observe(this, Observer {
                if (it) {
                    startActivity(Intent(this,HomeActivity::class.java))
                    finish()
                } else {
                    getNavHost().navigate(R.id.action_splashFragment_to_welcomeFragment)
                }
            })

        }, 2000)
    }

    fun getNavHost(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        return navHostFragment.navController
    }
}