package com.app.newislam.ui.auth.forgot_password

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.lifecycle.Observer
import com.app.newislam.R
import com.app.newislam.databinding.DialogForgotPasswordBinding
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.requests.auth.forgot_password.ForgetPasswordRequest
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ForgotPasswordSheet : BottomSheetDialogFragment() {

    private lateinit var forgotPasswordBinding: DialogForgotPasswordBinding
    private val forgotPasswordViewModel: ForgotPasswordViewModel by viewModel()
    private val forgetPasswordRequest: ForgetPasswordRequest by inject()
    private var bottomSheetBehavior: BottomSheetBehavior<*>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        forgotPasswordBinding = DialogForgotPasswordBinding.inflate(inflater, container, false)

        return forgotPasswordBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        forgotPasswordBinding.lifecycleOwner = this
        forgotPasswordBinding.viewModel = (forgotPasswordViewModel)
        forgotPasswordBinding.forgotPassRequest = forgetPasswordRequest
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeSuccess()
        observeCloseClick()
    }

    private fun observeSuccess() {
        forgotPasswordViewModel.observeSuccess.observe(viewLifecycleOwner, EventObserver {
            bottomSheetBehavior!!.isHideable = true
            bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
        })
    }

    private fun observeCloseClick() {
      forgotPasswordViewModel.observeForgotPasswordClick.observe(viewLifecycleOwner,EventObserver{
          bottomSheetBehavior!!.isHideable = true
          bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
      })
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        var bottomSheet: View? = null
        if (dialog != null) {
            bottomSheet = dialog.findViewById(R.id.design_bottom_sheet)
            bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        }
        val view = view
        val finalBottomSheet = bottomSheet
        view!!.post {
            val parent = view.parent as View
            val params = parent.layoutParams as CoordinatorLayout.LayoutParams
            val behavior = params.behavior
            bottomSheetBehavior = behavior as BottomSheetBehavior<*>?
            bottomSheetBehavior!!.peekHeight = view.measuredHeight
            (finalBottomSheet!!.parent as View).setBackgroundColor(Color.TRANSPARENT)
        }
    }


}