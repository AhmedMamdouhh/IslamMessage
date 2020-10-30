package com.app.newislam.manager.utilities

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.navigation.ActivityNavigator


inline  fun <reified T> Context.navigateToActivity(){
    startActivity(Intent(this,T::class.java))
}

inline  fun <reified T> Context.navigateToActivity(intent: Intent){
    startActivity(Intent(this,T::class.java).putExtras(intent))
}

inline  fun <reified T> Activity.navigateToActivityResult(code:Int = 0){
    startActivityForResult(Intent(this,T::class.java),code)
}
inline  fun <reified T> Activity.navigateToActivityResult(intent: Intent,code:Int = 0){
    startActivityForResult(Intent(this,T::class.java).putExtras(intent),code)
}