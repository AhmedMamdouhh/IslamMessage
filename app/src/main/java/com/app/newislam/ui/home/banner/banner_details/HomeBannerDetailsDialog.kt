package com.app.newislam.ui.home.banner.banner_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.app.newislam.R
import com.app.newislam.databinding.DialogHomeBannerDetailsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class HomeBannerDetailsDialog : BottomSheetDialogFragment() {

    private lateinit var dialogHomeBannerDetailsBinding: DialogHomeBannerDetailsBinding
    private val args: HomeBannerDetailsDialogArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialogHomeBannerDetailsBinding =
            DialogHomeBannerDetailsBinding.inflate(inflater, container, false)
        getBannerObjectArgs()
        return dialogHomeBannerDetailsBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme)
    }

    private fun getBannerObjectArgs() {
        dialogHomeBannerDetailsBinding.bannerObject = args.homeBannerObject
    }

}