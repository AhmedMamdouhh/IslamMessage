package com.app.newislam.ui

import android.os.Bundle
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
import com.app.newislam.manager.base.ResponseManager
import org.koin.android.ext.android.inject


class MainActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        initializeAppBar()
    }

    private fun getNavHost(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        return navHostFragment.navController
    }


    private fun initializeAppBar() {
        appBarConfiguration = AppBarConfiguration.Builder(getNavHost().graph).build()
        findViewById<Toolbar>(R.id.tb_home_toolbar).setupWithNavController(getNavHost(), appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(getNavHost(), appBarConfiguration)
    }

}