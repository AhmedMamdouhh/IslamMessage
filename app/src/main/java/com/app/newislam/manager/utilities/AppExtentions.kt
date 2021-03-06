package com.app.newislam.manager.utilities

import android.annotation.SuppressLint
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import com.app.newislam.R
import kotlinx.android.synthetic.main.activity_main.*


@SuppressLint("RestrictedApi")
fun AppCompatActivity.toolBarVisibility(isVisible: Boolean){

    tb_home_toolbar.setNavigationIcon(R.drawable.ic_arrow_left_solid)

    when(isVisible){
        true ->{
            tb_home_toolbar?.isVisible = true
            bottom_nav_view.isVisible = true
        }
        false ->{
            tb_home_toolbar?.isVisible = false
            bottom_nav_view.isVisible = false
        }
    }
}

fun AppCompatActivity.bottomNavigationVisibility(isVisible: Boolean){

    when(isVisible){
        true ->{
            bottom_nav_view.isVisible = true
        }
        false ->{
            bottom_nav_view.isVisible = false
        }
    }
}

fun View.gone(){
    this.visibility = View.GONE
}

fun View.visible(){
    this.visibility = View.VISIBLE
}



