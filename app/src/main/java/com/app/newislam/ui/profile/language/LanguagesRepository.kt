package com.app.newislam.ui.profile.language

import android.content.SharedPreferences
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.model.entities.home.LanguageResponse
import org.koin.core.KoinComponent
import org.koin.core.inject

class LanguagesRepository : KoinComponent {
    val sharedPreferences: SharedPreferences by inject()
    fun fetchLanguages() = listOf(
        LanguageResponse(1, "English", "en"),
        LanguageResponse(2, "Arabic", "ar"),
        LanguageResponse(3, "French", "fr")
    )

    fun changeLanguage(language: String) {
        sharedPreferences.edit().putString(Constants.APP_LANGUAGE, language).apply()
    }
}