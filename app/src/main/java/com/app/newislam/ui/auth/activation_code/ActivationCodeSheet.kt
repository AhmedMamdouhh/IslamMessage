package com.app.newislam.ui.auth.activation_code

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.app.newislam.R
import com.app.newislam.databinding.DialogActivationCodeBinding
import com.app.newislam.databinding.DialogForgotPasswordBinding
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.app.newislam.ui.auth.forgot_password.ForgotPasswordViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ActivationCodeSheet : BottomSheetDialogFragment() {

    private lateinit var dialogActivationCodeBinding: DialogActivationCodeBinding
    private val activationCodeViewModel: ActivationCodeViewModel by viewModel()
    val activationCodeRequest: ActivationCodeRequest by inject()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialogActivationCodeBinding =
            DataBindingUtil.inflate(inflater, R.layout.dialog_activation_code, container, false)
        return dialogActivationCodeBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dialogActivationCodeBinding.lifecycleOwner = this
        dialogActivationCodeBinding.activationListener = activationCodeViewModel
        dialogActivationCodeBinding.activationObject = activationCodeRequest
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        observeSuccess()
//        observeError()
    }

//    private fun observeError() {
//        forgotPasswordViewModel.observeError.removeObservers(viewLifecycleOwner)
//        forgotPasswordViewModel.observeError.observe(
//            viewLifecycleOwner,
//            Observer<String?> { msg -> Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show() })
//    }
//
//    private fun observeSuccess() {
//        forgotPasswordViewModel.observSucces.removeObservers(viewLifecycleOwner)
//        forgotPasswordViewModel.observSucces.observe(viewLifecycleOwner, Observer<Boolean?> {
//            try {
//                bottomSheetBehavior!!.isHideable = true
//                bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
//            } catch (ignored: NullPointerException) {
//            }
//        })
//    }


}