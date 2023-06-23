package com.example.resourcesapp.ui.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.resourcesapp.R;
import com.example.resourcesapp.ThemePreferenceUtil;

public class SettingsFragment extends Fragment {

    private SettingsViewModel mViewModel;

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch switchDarkMode;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_settings, container, false);
        // Inflate the fragment layout
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        // Retrieve the Switch reference
        switchDarkMode = view.findViewById(R.id.switch1);

        // Set initial state based on saved preference
        switchDarkMode.setChecked(ThemePreferenceUtil.getSavedThemePreference(requireContext()));

        // Set the OnCheckedChangeListener
        switchDarkMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Check if the switch state is different from the saved preference
                if (isChecked != ThemePreferenceUtil.getSavedThemePreference(requireContext())) {
                    // Update the app theme and save the preference
                    ThemePreferenceUtil.saveThemePreference(requireContext(), isChecked);

                    // Recreate the activity to apply the theme changes
                    requireActivity().recreate();
                }
            }
        });
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        // TODO: Use the ViewModel
    }
}