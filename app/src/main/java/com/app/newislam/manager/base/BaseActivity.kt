package com.app.newislam.manager.base

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.app.newislam.R
import com.app.newislam.manager.connection.Resource
import org.aviran.cookiebar2.CookieBar
import org.koin.androidx.viewmodel.ext.android.viewModel

abstract class BaseActivity : AppCompatActivity() {

    protected var loadingBar: Dialog? = null
    val baseViewModel: BaseViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeProgress()
        observeResponse()
    }


    open fun observeResponse() {
        baseViewModel.responseManager.getResponseManager().observe(this,
            Observer<Any> { responseResource ->
                responseResource as Resource<*>
                try {
                    when (responseResource.resourceStatus) {
                        Resource.ResourceStatus.LOADING -> {
                            showProgress()
                        }
                        Resource.ResourceStatus.AUTHENTICATED, Resource.ResourceStatus.HIDE_LOADING -> {
                            hideProgress()
                        }
                        Resource.ResourceStatus.SUCCESS -> {
                            hideProgress()
                            successMessage(responseResource.message)
                        }
                        Resource.ResourceStatus.FAILED -> {
                            hideProgress()
                            failedMessage(responseResource.message)
                        }
                        Resource.ResourceStatus.NO_CONNECTION -> {
                            hideProgress()
                            noConnection()
                        }
                        Resource.ResourceStatus.LOGOUT -> {
                        }
                    }
                } catch (ex: NullPointerException) {
                }
            })
    }

    //Snack bar :
    fun successMessage(message: String?) {
        CookieBar.build(this@BaseActivity)
            .setCustomView(R.layout.layout_success)
            .setTitle(R.string.success_message_title)
            .setMessage(message)
            .setCookiePosition(CookieBar.BOTTOM)
            .show()
    }

    fun failedMessage(message: String?) {
        CookieBar.build(this@BaseActivity)
            .setCustomView(R.layout.layout_error)
            .setTitle(R.string.error_message_title)
            .setMessage(message)
            .setCookiePosition(CookieBar.BOTTOM)
            .show()
    }

    fun noConnection() {
        CookieBar.build(this@BaseActivity)
            .setCustomView(R.layout.layout_no_connection)
            .setCustomViewInitializer { view ->
                val close = view.findViewById<ImageView>(R.id.iv_no_connection_close)
                close.setOnClickListener { CookieBar.dismiss(this@BaseActivity) }
            }
            .setEnableAutoDismiss(false) // Cookie will stay on display until manually dismissed
            .setCookiePosition(CookieBar.BOTTOM)
            .show()
    }


    private fun initializeProgress() {
        loadingBar = Dialog(this, R.style.Theme_AppCompat_DayNight)
        loadingBar!!.setCancelable(false)
        loadingBar!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val inflater = LayoutInflater.from(this)
        val loadingView = inflater.inflate(R.layout.layout_loader, null)
        loadingBar!!.setContentView(loadingView)
        loadingBar!!.window!!.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#0effffff"))
        )
    }

    fun showProgress() {
        if (loadingBar != null && !this.isFinishing) loadingBar!!.show()
    }

    fun hideProgress() {
        if (loadingBar != null && loadingBar!!.isShowing && !this.isFinishing) loadingBar!!.dismiss()
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }
}