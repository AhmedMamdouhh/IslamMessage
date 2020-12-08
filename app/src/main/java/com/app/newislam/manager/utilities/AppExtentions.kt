package com.app.newislam.manager.utilities

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.navigation.ActivityNavigator
import com.app.newislam.R
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


