package com.example.resourcesapp

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

object ThemePreferenceUtil {
    private const val THEME_PREFERENCE_KEY = "theme_preference"
    private const val DEFAULT_THEME = "light"
    private fun getSharedPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @JvmStatic
    fun saveThemePreference(context: Context, isDarkModeEnabled: Boolean) {
        val editor = getSharedPreferences(context).edit()
        editor.putBoolean(THEME_PREFERENCE_KEY, isDarkModeEnabled)
        editor.apply()
    }

    @JvmStatic
    fun getSavedThemePreference(context: Context): Boolean {
        return getSharedPreferences(context).getBoolean(THEME_PREFERENCE_KEY, false)
    }
}