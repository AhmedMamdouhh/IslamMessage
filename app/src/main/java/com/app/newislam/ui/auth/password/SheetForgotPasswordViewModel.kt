//package com.app.newislam.ui.auth.password
//
//import android.app.Application
//import android.widget.EditText
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import com.app.newislam.R
//import com.app.newislam.manager.base.BaseViewModel
//import com.app.newislam.manager.connection.Resource
//import com.app.newislam.manager.utilities.Constants
//import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
//import com.app.newislam.repository.auth.ForgerPasswordRepository
//import com.rabe7.ResponseManager
//import com.rabe7.community.R
//import com.rabe7.community.manager.connection.Resource
//import com.rabe7.community.manager.utilities.Constants
//import com.rabe7.community.manager.utilities.Validation
//import com.rabe7.community.repository.auth.ForgotPasswordRepository
//import com.rabe7.community.repository.auth.RegisterRepository
//import io.reactivex.android.schedulers.AndroidSchedulers
//import io.reactivex.schedulers.Schedulers
//import io.reactivex.subscribers.ResourceSubscriber
//import org.koin.core.inject
//import javax.inject.Inject
//
//class SheetForgotPasswordViewModel : BaseViewModel() {
//    private var forgotPasswordRepository: ForgerPasswordRepository by inject()
//    private var observeSuccess: MutableLiveData<Boolean>?
//    private var observeError: MutableLiveData<String>?
//    private var observeCloseClick: MutableLiveData<Boolean>?
//
//    //Click:
//    fun onForgotPasswordClickedforgetPasswordRequest: ForgetPasswordRequest) {
//        if (validateForgotPassword(userEmail.text.toString())) getRepositoryData(userEmail.text.toString())
//    }
//
//    fun onCloseClicked() {
//        observeCloseClick!!.value = true
//    }
//
//    fun getRepositoryData(forgetPasswordRequest: ForgetPasswordRequest) {
//        responseManager.loading()
//        disposable.add(forgotPasswordRepository.forgetPassword(forgetPasswordRequest)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe({ forgotPasswordResponse ->
//                    if (forgotPasswordResponse != null) {
//                        if (forgotPasswordResponse.resourceStatus?.equals(Resource.ResourceStatus.SUCCESS)!!) {
//                            responseManager.success(forgotPasswordResponse.message)
//                            observeSuccess!!.setValue(true)
//                        } else if (forgotPasswordResponse.resourceStatus?.equals(Resource.ResourceStatus.FAILED)!!) {
//                            observeError!!.value = forgotPasswordResponse.message
//                        }
//                        responseManager.hideLoading()
//                    } else {
//                        responseManager.noConnection()
//                    }
//                }, {
//                    responseManager.noConnection()
//                }
//                ))
//    }
//
//    //getters:
//    fun observeSuccess(): LiveData<Boolean>? {
//        if (observeSuccess != null) observeSuccess = MutableLiveData()
//        return observeSuccess
//    }
//
//    val closeClick: LiveData<Boolean>?
//        get() {
//            if (observeCloseClick != null) observeCloseClick = MutableLiveData()
//            return observeCloseClick
//        }
//
//    fun observeError(): LiveData<String>? {
//        if (observeError != null) observeError = MutableLiveData()
//        return observeError
//    }
//
//    //validation:
//    private fun validateForgotPassword(email: String): Boolean {
//        var isValid = true
//        if (Validation.isNullOrEmpty(email)) {
//            observeError!!.setValue(application.getString(R.string.error_login_email_empty))
//            isValid = false
//        }
//        return isValid
//    }
//
//    init {
//        this.forgotPasswordRepository = forgotPasswordRepository
//        observeSuccess = MutableLiveData()
//        observeCloseClick = MutableLiveData()
//        observeError = MutableLiveData()
//    }
//}