package com.app.newislam.ui.resource_layout.error

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.databinding.DataBindingUtil
import com.app.newislam.R
import com.app.newislam.databinding.LayoutErrorBinding
import com.app.newislam.databinding.LayoutNoConnectionBinding
import com.app.newislam.databinding.LayoutSuccessBinding
import com.app.newislam.manager.utilities.Constants
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ErrorSheet : BottomSheetDialogFragment() {
    private lateinit var errorBinding: LayoutErrorBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        errorBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_error, container, false)
        getBundleMessage()
        errorBinding.lifecycleOwner = this

        return errorBinding.root
    }

    private fun getBundleMessage(){
        if(arguments?.containsKey(Constants.MESSAGE) == true){
            errorBinding.tvMessage.text = requireArguments().getString(Constants.MESSAGE)
        }
    }
}

