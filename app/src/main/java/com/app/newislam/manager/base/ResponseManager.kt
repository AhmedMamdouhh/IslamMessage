package com.app.newislam.manager.base

import android.content.SharedPreferences
import androidx.lifecycle.MutableLiveData
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.connection.Resource
import com.app.newislam.model.entities.User
import com.google.gson.Gson

data class ResponseManager constructor(
    private val resource: Resource<Any>,
    private val sharedPreferences: SharedPreferences,
    private var currentUser: User?
){

    private val responseManager = MutableLiveData<Resource<Any>>()

    fun isAuthenticated() : Boolean{
        return if(sharedPreferences.contains(Constants.USER_ID)){
            getSavedUser()
            true
        }else false
    }

    fun authenticated(currentUser: User){
        this.currentUser = currentUser
        saveUser()
        setResponseObject(Resource.ResourceStatus.AUTHENTICATED, null)
    }


    fun loading() { setResponseObject(Resource.ResourceStatus.LOADING, null) }
    fun hideLoading() { setResponseObject(Resource.ResourceStatus.HIDE_LOADING, null) }
    fun success(message: String?) { setResponseObject(Resource.ResourceStatus.SUCCESS, message) }
    fun failed(message: String?) { setResponseObject(Resource.ResourceStatus.FAILED, message) }
    fun noConnection() { setResponseObject(Resource.ResourceStatus.NO_CONNECTION, null) }
    fun logout() {
        removeUser()
        setResponseObject(Resource.ResourceStatus.LOGOUT, null)
    }


    private fun setResponseObject(status: Resource.ResourceStatus, message: String?){
        resource.resourceStatus = status
        resource.message = message
        responseManager.value = resource
    }

    //User shared pref
    private fun getSavedUser(){
        val gson = Gson()
        val user = sharedPreferences.getString(Constants.USER, "")
        currentUser  = gson.fromJson(user, User::class.java)
    }

    private fun saveUser(){
        sharedPreferences.edit().putInt(Constants.USER_ID, currentUser?.userData?.id?:0).apply()

        val gson = Gson()
        val user = gson.toJson(currentUser)
        sharedPreferences.edit().putString(Constants.USER, user).apply()
    }

    private fun removeUser() {
        sharedPreferences.edit().remove(Constants.USER_ID).apply()
        sharedPreferences.edit().remove(Constants.USER).apply()
        currentUser = null
    }

    //getters
    fun getResponseManager() =   responseManager
    fun getCurrentUser() =  currentUser

}