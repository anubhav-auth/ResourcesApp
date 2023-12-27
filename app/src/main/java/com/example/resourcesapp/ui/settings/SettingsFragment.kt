package com.example.resourcesapp.ui.settings

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Switch
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.resourcesapp.R
import com.example.resourcesapp.ThemePreferenceUtil.getSavedThemePreference
import com.example.resourcesapp.ThemePreferenceUtil.saveThemePreference

class SettingsFragment : Fragment() {
    private var mViewModel: SettingsViewModel? = null

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    var switchDarkMode: Switch? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return inflater.inflate(R.layout.fragment_settings, container, false);
        // Inflate the fragment layout
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        // Retrieve the Switch reference
        switchDarkMode = view.findViewById(R.id.switch1)

        // Set initial state based on saved preference
        switchDarkMode?.setChecked(getSavedThemePreference(requireContext()))

        // Set the OnCheckedChangeListener
        switchDarkMode?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            // Check if the switch state is different from the saved preference
            if (isChecked != getSavedThemePreference(requireContext())) {
                // Update the app theme and save the preference
                saveThemePreference(requireContext(), isChecked)

                // Recreate the activity to apply the theme changes
                requireActivity().recreate()
            }
        })
        return view
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance(): SettingsFragment {
            return SettingsFragment()
        }
    }
}