package com.app.newislam.ui.profile.language

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ChangeLanguageSheetBinding
import com.app.newislam.databinding.ItemLangageBinding
import com.app.newislam.model.entities.home.LanguageResponse

class LanguagesViewHolder constructor(val binding: ItemLangageBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun bind(language: LanguageResponse, adapter: LanguagesAdapter) {
        binding.adapter = adapter
        binding.language = language
    }


    companion object {
        fun from(parent: ViewGroup) = LanguagesViewHolder(
            ItemLangageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
}