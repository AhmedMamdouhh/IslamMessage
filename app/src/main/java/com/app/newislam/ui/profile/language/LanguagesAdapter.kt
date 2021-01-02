package com.app.newislam.ui.profile.language

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.model.entities.home.LanguageResponse

class LanguagesAdapter(private val languages: List<LanguageResponse>,private val viewModel: LanguagesViewModel) :
    RecyclerView.Adapter<LanguagesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        LanguagesViewHolder.from(parent)

    override fun onBindViewHolder(holder: LanguagesViewHolder, position: Int) {
        holder.bind(languages[position], this)
    }

    override fun getItemCount() = languages.size

    fun onLanguageItemClicked(language: LanguageResponse) {
        viewModel.itemLanguageClicked(language)
    }
}