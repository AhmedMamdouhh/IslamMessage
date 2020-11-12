package com.app.newislam.ui.resource_layout.success

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.databinding.DataBindingUtil
import com.app.newislam.R
import com.app.newislam.databinding.LayoutNoConnectionBinding
import com.app.newislam.databinding.LayoutSuccessBinding
import com.app.newislam.manager.utilities.Constants
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SuccessSheet : BottomSheetDialogFragment() {
    private lateinit var successBinding: LayoutSuccessBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        successBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_success, container, false)
        getBundleMessage()
        successBinding.lifecycleOwner = this

        return successBinding.root
    }

    private fun getBundleMessage(){
        if(arguments?.containsKey(Constants.MESSAGE) == true){
            successBinding.tvMessage.text = requireArguments().getString(Constants.MESSAGE)
        }
    }

}

