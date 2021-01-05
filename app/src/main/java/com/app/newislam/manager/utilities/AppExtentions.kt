package com.app.newislam.manager.utilities

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*


@SuppressLint("RestrictedApi")
fun AppCompatActivity.toolBarVisibility(isVisible: Boolean) {


    when (isVisible) {
        true -> {
            tb_home_toolbar?.isVisible = true
            bottom_nav_view.isVisible = true
        }
        false -> {
            tb_home_toolbar?.isVisible = false
            bottom_nav_view.isVisible = false
        }
    }
}

fun AppCompatActivity.bottomNavigationVisibility(isVisible: Boolean) {

    when (isVisible) {
        true -> {
            bottom_nav_view.isVisible = true
        }
        false -> {
            bottom_nav_view.isVisible = false
        }
    }
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}


/* share PlayStore link via intent */
fun AppCompatActivity.shareAppLink() {
    ShareCompat.IntentBuilder.from(this)
        .setType("text/plain")
        .setChooserTitle("Chooser title")
        .setText("http://play.google.com/store/apps/details?id=" + this.packageName)
        .startChooser()
}


