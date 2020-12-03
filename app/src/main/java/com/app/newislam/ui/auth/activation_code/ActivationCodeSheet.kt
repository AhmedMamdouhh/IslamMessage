package com.app.newislam.ui.auth.activation_code

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.doOnTextChanged
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.app.newislam.R
import com.app.newislam.databinding.DialogActivationCodeBinding
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.model.requests.auth.activation_code.ActivationCodeRequest
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ActivationCodeSheet : BottomSheetDialogFragment() {

    private lateinit var dialogActivationCodeBinding: DialogActivationCodeBinding
    private val activationCodeViewModel: ActivationCodeViewModel by viewModel()
    private val activationCodeRequest: ActivationCodeRequest by inject()
    private val args: ActivationCodeSheetArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialogActivationCodeBinding =
            DialogActivationCodeBinding.inflate(inflater, container, false)
        return dialogActivationCodeBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getBundleEmail()
        dialogActivationCodeBinding.lifecycleOwner = this
        dialogActivationCodeBinding.activationListener = activationCodeViewModel
        dialogActivationCodeBinding.activationObject = activationCodeRequest

        writeCodeListener()
        observeSuccess()
    }

    private fun getBundleEmail() {
        activationCodeRequest.email = args.emailBundle
    }

    private fun writeCodeListener() {
        dialogActivationCodeBinding.pvActivationCode.doOnTextChanged { _, _, _, _ ->
            dialogActivationCodeBinding.pvActivationCode.setLineColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.colorWhite
                )
            )
        }
    }


    private fun observeSuccess() {
        activationCodeViewModel.observeSuccess.observe(viewLifecycleOwner, EventObserver {
            dismiss()
            findNavController().navigate(R.id.action_activationCodeSheet_to_homeFragment)
        })
    }


}