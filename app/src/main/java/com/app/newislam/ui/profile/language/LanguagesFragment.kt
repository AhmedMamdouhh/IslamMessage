package com.app.newislam.ui.profile.language

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.R
import com.app.newislam.databinding.ChangeLanguageSheetBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.EventObserver
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class LanguagesFragment : BottomSheetDialogFragment() {
    private lateinit var binding: ChangeLanguageSheetBinding
    private val viewModel by viewModel<LanguagesViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ChangeLanguageSheetBinding.inflate(layoutInflater)

        observeLanguages()
        observeChangeLanguage()

        return binding.root
    }

    private fun observeLanguages() {
        viewModel.observeLanguages.observe(viewLifecycleOwner, EventObserver {
            binding.rvLangauges.apply {
                adapter = LanguagesAdapter(it, viewModel)
                layoutManager = LinearLayoutManager(requireContext())
            }
        })
    }

    private fun observeChangeLanguage() {
        viewModel.observeLanguageChange.observe(viewLifecycleOwner, EventObserver {
            startActivity(requireActivity().intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }
}