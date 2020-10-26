package com.app.newislam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.app.newislam.ui.auth.login.LoginFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val manager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.hostFragment, LoginFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}