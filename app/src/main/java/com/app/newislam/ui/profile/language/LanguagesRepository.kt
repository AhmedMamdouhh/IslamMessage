package com.app.newislam.ui.profile.language

import com.app.newislam.model.entities.home.LanguageResponse

class LanguagesRepository {

    fun fetchLanguages() = listOf(
        LanguageResponse(1, "English", "en"),
        LanguageResponse(2, "Arabic", "ar"),
        LanguageResponse(3, "French", "fr")
    )
}