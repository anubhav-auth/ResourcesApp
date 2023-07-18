package com.example.resourcesapp.ui.coding.sub;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;
import com.example.resourcesapp.views.listingAdapter;
import com.example.resourcesapp.views.listingModel;

import java.util.ArrayList;

public class UsefullIDEExtensionsFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static UsefullIDEExtensionsFragment newInstance() {
        return new UsefullIDEExtensionsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_usefull_extensions, container, false);
        rv = view.findViewById(R.id.recyclerView_usefullIDEextension);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", "https://www."));

 */
        lists.add(new listingModel("Tabnine", "", "https://www."));
        lists.add(new listingModel("Mintlify", "", "https://www."));
        lists.add(new listingModel("ESLint", "", "https://www."));

        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

}