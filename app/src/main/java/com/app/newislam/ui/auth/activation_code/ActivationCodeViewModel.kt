package com.app.newislam.ui.auth.activation_code

import android.view.animation.AnimationUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.newislam.R
import com.app.newislam.manager.base.BaseViewModel
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.Event
import com.app.newislam.manager.utilities.Validation
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.repository.auth.ActivationCodeRepository
import com.chaos.view.PinView
import org.koin.core.inject

class ActivationCodeViewModel : BaseViewModel() {

    private val activationCodeRepository:ActivationCodeRepository by inject()
    private val _observeSuccess = MutableLiveData<Event<Boolean>>()


    fun onActivationCodeVerifyClicked(pinView: PinView,activationCodeRequest: ActivationCodeRequest){
        if(validateActivationCode(pinView,activationCodeRequest))
            getRepositoryData(activationCodeRequest)
    }
    fun onResendClicked(pinView: PinView,activationCodeRequest: ActivationCodeRequest){
        if(validateActivationCode(pinView,activationCodeRequest))
            getRepositoryData(activationCodeRequest)
    }


    private fun getRepositoryData(activationCodeRequest: ActivationCodeRequest) {
        responseManager.loading()

        disposable.add(
            activationCodeRepository.getActivateCode(activationCodeRequest).subscribe({ activationCodeResponse ->

                responseManager.hideLoading()


                if(activationCodeResponse!=null){
                    responseManager.success(activationCodeResponse.message)
                    responseManager.authenticated(activationCodeResponse.data )
                    _observeSuccess.value = Event(true)
                } else responseManager.noConnection()


                }, {
                    responseManager.hideLoading()
                    responseManager.failed(it.message)
                })
        )
    }


    //validation:
    private fun validateActivationCode(pinView: PinView,activationCodeRequest: ActivationCodeRequest): Boolean {
        var isValid = true
        if (Validation.isNullOrEmpty(activationCodeRequest.confirmationToken)) {
            activationCodeRequest.activationCodeErrors.confirmationTokenError = application.getString(R.string.error_activation_code_empty)
            pinView.setLineColor(application.resources.getColor(R.color.colorRed))
            pinView.startAnimation(AnimationUtils.loadAnimation(application,R.anim.shake_vibrate))
            isValid = false
        }else if (activationCodeRequest.confirmationToken.length < Constants.ACTIVATION_CODE_LENGTH) {
            activationCodeRequest.activationCodeErrors.confirmationTokenError = application.getString(R.string.error_activation_code_wrong)
            pinView.setLineColor(application.resources.getColor(R.color.colorRed))
            pinView.startAnimation(AnimationUtils.loadAnimation(application,R.anim.shake_vibrate))
            isValid = false
        }
        return isValid
    }
    

    //getters:
    val observeSuccess:LiveData<Event<Boolean>>
    get() = _observeSuccess

}