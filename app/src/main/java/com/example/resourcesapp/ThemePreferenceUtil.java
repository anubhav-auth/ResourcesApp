package com.example.resourcesapp;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class ThemePreferenceUtil {

    private static final String THEME_PREFERENCE_KEY = "theme_preference";
    private static final String DEFAULT_THEME = "light";

    private static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void saveThemePreference(Context context, boolean isDarkModeEnabled) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putBoolean(THEME_PREFERENCE_KEY, isDarkModeEnabled);
        editor.apply();
    }

    public static boolean getSavedThemePreference(Context context) {
        return getSharedPreferences(context).getBoolean(THEME_PREFERENCE_KEY, false);
    }

}
