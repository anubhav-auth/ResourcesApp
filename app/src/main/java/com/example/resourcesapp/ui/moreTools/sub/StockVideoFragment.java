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

public class StockVideoFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static StockVideoFragment newInstance() {
        return new StockVideoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stock_video, container, false);
        rv = view.findViewById(R.id.recyclerView_stock_video);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/

        lists.add(new listingModel("Coverr", "beautiful, free stock video footage for your homepage.", "https://coverr.co/"));

        lists.add(new listingModel("Life of Vids", "provides free stock videos, clips, and loops.", "http://www.lifeofvids.com/"));

        lists.add(new listingModel("Mazwai", "great collection of free creative commons HD video clips & footages.", "http://mazwai.com/"));

        lists.add(new listingModel("Motion Places ", "a curated collection of beautiful footage you can use for your projects.", "https://www.motionplaces.com/"));

        lists.add(new listingModel("Mixkit", "extraordinary Free HD videos. For you to use, completely free of charge.", "https://mixkit.co"));

        lists.add(new listingModel("Pixabay", "it has more than 1.5 million royalty-free stock videos and photos shared by their community of creators.", "https://pixabay.com/"));

        lists.add(new listingModel("https://www.pexels.com/videos/", "makes it easy to find free stock footage for your website, promo video or anything else.", "https://www.pexels.com/videos/"));

        lists.add(new listingModel("Videezy", "download millions of free and premium stock footage and motion graphics instantly.", "https://www.videezy.com/"));

        lists.add(new listingModel("Videvo", "offers a large selection of HD video clips, motion graphics, and free stock footage.", "https://www.videvo.net/"));

        lists.add(new listingModel("123RF", "over 100,000 daily new content & 24/7 online support", "https://www.123rf.com/"));

        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }



}