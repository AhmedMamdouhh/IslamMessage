package com.app.newislam.ui.auth.password_container.new_password

import android.view.animation.AnimationUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.new_password.NewPasswordRequest
import com.app.newislam.repository.auth.NewPasswordRepository
import com.chaos.view.PinView
import org.koin.core.inject

class NewPasswordViewModel : BaseViewModel() {

    private val newPasswordRepository: NewPasswordRepository by inject()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()


    fun onResetPasswordClicked(pinView: PinView,newPasswordRequest: NewPasswordRequest) {
        if (validateNewPassword(newPasswordRequest,pinView))
            getRepositoryData(newPasswordRequest)
    }


    private fun getRepositoryData(newPasswordRequest: NewPasswordRequest) {
        responseManager.loading()

        disposable.add(
            newPasswordRepository.newPassword(newPasswordRequest)
                .subscribe({ newPasswordResponse ->

                    responseManager.hideLoading()


                    if (newPasswordResponse != null) {
                        responseManager.success(newPasswordResponse.message)
                        _observeSuccess.value = Event(true)
                    } else responseManager.noConnection()


                }, {
                    responseManager.hideLoading()
                    responseManager.failed(it.message)
                })
        )
    }


    //validation:
    private fun validateNewPassword(
        newPasswordRequest: NewPasswordRequest,
        pinView: PinView
    ): Boolean {

        var valid = true

        //Code errors:
        if (Validation.isNullOrEmpty(newPasswordRequest.newPasswordCode)) {
            newPasswordRequest.newPasswordErrors.newPasswordCodeError = application.getString(R.string.error_activation_code_empty)
            pinView.setLineColor(application.resources.getColor(R.color.colorRed))
            pinView.startAnimation(AnimationUtils.loadAnimation(application,R.anim.shake_vibrate))
            valid = false
        }else if (newPasswordRequest.newPasswordCode.length < Constants.ACTIVATION_CODE_LENGTH) {
            newPasswordRequest.newPasswordErrors.newPasswordCodeError = application.getString(R.string.error_activation_code_wrong)
            pinView.setLineColor(application.resources.getColor(R.color.colorRed))
            pinView.startAnimation(AnimationUtils.loadAnimation(application,R.anim.shake_vibrate))
            valid = false
        }
        //Password errors:
        if (Validation.isNullOrEmpty(newPasswordRequest.newPassword)) {
            newPasswordRequest.newPasswordErrors.newPasswordError =
                application.getString(R.string.error_new_password_empty)
            valid = false
        } else if (newPasswordRequest.newPassword.length < Constants.PASSWORD_LENGTH) {
            newPasswordRequest.newPasswordErrors.newPasswordError =
                application.getString(R.string.error_new_password_size)
            valid = false
        }
        //Confirm password errors:
        if (Validation.isNullOrEmpty(newPasswordRequest.confirmPassword)) {
            newPasswordRequest.newPasswordErrors.confirmPasswordError =
                application.getString(R.string.error_new_password_confirm_empty)
            valid = false
        } else if (newPasswordRequest.newPassword != newPasswordRequest.confirmPassword) {
            newPasswordRequest.newPasswordErrors.confirmPasswordError =
                application.getString(R.string.error_new_password_confirm_wrong)
            valid = false
        }

        return valid
    }


    //getters:
    val observeSuccess: LiveData<Event<Boolean>>
        get() = _observeSuccess

}