package com.example.resourcesapp.ui.general;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;
import com.example.resourcesapp.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class GenralFragment extends Fragment {

    private GenralViewModel mViewModel;

    public static GenralFragment newInstance() {
        return new GenralFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_genral, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GenralViewModel.class);
        // TODO: Use the ViewModel
    }

}