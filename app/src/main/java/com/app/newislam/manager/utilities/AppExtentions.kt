package com.app.newislam.manager.utilities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*


@SuppressLint("RestrictedApi")
fun AppCompatActivity.toolBarVisibility(isVisible: Boolean){


    when(isVisible){
        true ->{
            toolbar?.isVisible = true
            bottom_nav_view.isVisible = true
        }
        false ->{
            toolbar?.isVisible = false
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


