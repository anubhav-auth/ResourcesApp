package com.example.resourcesapp.ui.moreTools.sub;

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

public class soundFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static soundFragment newInstance() {
        return new soundFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sound, container, false);
        rv = view.findViewById(R.id.recyclerView_sound);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", "");
*/

        lists.add(new listingModel("Appsounds", "UI Sound packs for apps, games, and any product.", "https://appsounds.pro/"));

        lists.add(new listingModel("AudioJungle ", "836,206 tracks and sounds from the community of musicians and sound engineers.", "https://audiojungle.net/"));

        lists.add(new listingModel("Bensound", "download creative commons music, royalty free music for free and use it in your project.", "https://www.bensound.com/"));

        lists.add(new listingModel("Freesound", "a collaborative database of Creative Commons Licensed sounds. Browse, download and share sounds.", "https://freesound.org/"));

        lists.add(new listingModel("Fugue Music", "download free background music for your videos.", "https://icons8.com/music"));

        lists.add(new listingModel("Max", "connect objects with virtual patch cords to create interactive sounds, graphics, and custom effects.", "https://cycling74.com/products/max/"));


        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


}