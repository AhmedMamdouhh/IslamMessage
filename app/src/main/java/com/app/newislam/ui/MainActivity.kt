package com.app.newislam.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.app.newislam.R
import com.app.newislam.databinding.ActivityMainBinding
import com.app.newislam.manager.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


    //        initializeAppBar()
    //        initializeBottomNav()
        setupViews()

    }

    private fun getNavHost(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        return navHostFragment.navController
    }


    private fun initializeAppBar() {
        appBarConfiguration = AppBarConfiguration.Builder(getNavHost().graph).build()
        findViewById<Toolbar>(R.id.tb_home_toolbar).setupWithNavController(getNavHost(),
            appBarConfiguration)
    }

    private fun initializeBottomNav() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.hostFragment) as NavHostFragment?
        NavigationUI.setupWithNavController(bottom_nav_view,
            navHostFragment!!.navController)

    }

    fun setupViews() {
        // Finding the Navigation Controller
        var navController = supportFragmentManager
            .findFragmentById(R.id.hostFragment) as NavHostFragment

        // Setting Navigation Controller with the BottomNavigationView
        bottom_nav_view.setupWithNavController(navController.navController)

        // Setting Up ActionBar with Navigation Controller
        var appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.homeFragment,
                R.id.islamMessageServicesFragment,
                R.id.notificationFragment
            )
        )

        findViewById<Toolbar>(R.id.tb_home_toolbar).setupWithNavController(navController.navController,
            appBarConfiguration)
    }


    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(getNavHost(), appBarConfiguration)
    }

}