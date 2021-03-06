package com.app.newislam.ui.auth.password_container.new_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.newislam.R
import com.app.newislam.databinding.DialogNewPasswordBinding
import com.app.newislam.model.requests.auth.new_password.NewPasswordRequest
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class NewPasswordDialog : BottomSheetDialogFragment() {

    private lateinit var newPasswordBinding: DialogNewPasswordBinding
    private val newPasswordViewModel: NewPasswordViewModel by viewModel()
    private val nePasswordRequest: NewPasswordRequest by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        newPasswordBinding =
            DialogNewPasswordBinding.inflate(inflater, container, false)
        return newPasswordBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        newPasswordBinding.lifecycleOwner = this
        newPasswordBinding.newPasswordListener = newPasswordViewModel
        newPasswordBinding.newPasswordObject = nePasswordRequest

        observeSuccess()
    }



    private fun observeSuccess() {

    }


}