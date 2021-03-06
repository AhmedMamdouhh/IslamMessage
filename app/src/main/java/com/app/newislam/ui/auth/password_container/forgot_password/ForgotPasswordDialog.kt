package com.app.newislam.ui.auth.password_container.forgot_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.newislam.R
import com.app.newislam.databinding.DialogForgotPasswordBinding
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.requests.auth.forgot_password.ForgotPasswordRequest
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ForgotPasswordDialog : BottomSheetDialogFragment() {

    private lateinit var forgotPasswordBinding: DialogForgotPasswordBinding
    private val forgotPasswordViewModel: ForgotPasswordViewModel by viewModel()
    private val forgotPasswordRequest: ForgotPasswordRequest by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        forgotPasswordBinding =
            DialogForgotPasswordBinding.inflate(inflater, container, false)
        return forgotPasswordBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        forgotPasswordBinding.lifecycleOwner = this
        forgotPasswordBinding.forgotPasswordListener = forgotPasswordViewModel
        forgotPasswordBinding.forgotPasswordRequest = forgotPasswordRequest

        observeSuccess()
    }



    private fun observeSuccess() {
        forgotPasswordViewModel.observeSuccess.observe(viewLifecycleOwner, EventObserver {userEmail->
            val action = ForgotPasswordDialogDirections.actionForgotPasswordDialogToNewPasswordDialog(userEmail)
            findNavController().navigate(action)
        })
    }


}