package com.example.resourcesapp.ui.infoGathering;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;

public class InfoGatheringFragment extends Fragment {

    private InfoGatheringViewModel mViewModel;

    public static InfoGatheringFragment newInstance() {
        return new InfoGatheringFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info_gathering, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InfoGatheringViewModel.class);
        // TODO: Use the ViewModel
    }

}