package com.example.resourcesapp.ui.infoGathering;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;
import com.example.resourcesapp.views.listingAdapter;
import com.example.resourcesapp.views.listingModel;

import java.util.ArrayList;
import com.example.resourcesapp.views.grid.*;

public class InfoGatheringFragment extends Fragment {

    private InfoGatheringViewModel mViewModel;
    ArrayList<gridModel> lists;
    RecyclerView rv;
    gridAdapter adapter;

    public static InfoGatheringFragment newInstance() {
        return new InfoGatheringFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_info_gathering, container, false);
        rv = view.findViewById(R.id.recyclerView_InfoGathering);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InfoGatheringViewModel.class);
        // TODO: Use the ViewModel
    }


}