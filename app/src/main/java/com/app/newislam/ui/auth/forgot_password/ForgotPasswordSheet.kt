package com.app.newislam.ui.auth.forgot_password

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.app.newislam.R
import com.app.newislam.databinding.DialogForgotPasswordBinding
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ForgotPasswordSheet : BottomSheetDialogFragment() {

    private lateinit var forgotPasswordBinding: DialogForgotPasswordBinding
    private val forgotPasswordViewModel: ForgotPasswordViewModel by viewModel()
    val forgetPasswordRequest: ForgetPasswordRequest by inject()
    private var bottomSheetBehavior: BottomSheetBehavior<*>? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        forgotPasswordBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.dialog_forgot_password,
            container,
            false
        )
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
        observeError()
        observeCloseClick()
    }

    private fun observeError() {
        forgotPasswordViewModel.observeError.removeObservers(viewLifecycleOwner)
        forgotPasswordViewModel.observeError.observe(viewLifecycleOwner, Observer<String?> { msg ->
            Toast.makeText(
                activity,
                msg,
                Toast.LENGTH_SHORT
            ).show()
        })
    }

    private fun observeSuccess() {
        forgotPasswordViewModel.observSucces.removeObservers(viewLifecycleOwner)
        forgotPasswordViewModel.observSucces.observe(viewLifecycleOwner, Observer<Boolean?> {
            try {
                bottomSheetBehavior!!.isHideable = true
                bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
            } catch (ignored: NullPointerException) {
            }
        })
    }

    private fun observeCloseClick() {
        forgotPasswordViewModel.closeClick!!.removeObservers(viewLifecycleOwner)
        forgotPasswordViewModel.closeClick!!.observe(viewLifecycleOwner, Observer {
            try {
                bottomSheetBehavior!!.isHideable = true
                bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
            } catch (ignored: NullPointerException) {
            }
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

    override fun onDestroy() {
        super.onDestroy()
        Navigation.findNavController(requireActivity(), R.id.hostFragment)
            .popBackStack(R.id.loginFragment, true)
        Navigation.findNavController(requireActivity(), R.id.hostFragment)
            .navigate(R.id.loginFragment)
    }
}