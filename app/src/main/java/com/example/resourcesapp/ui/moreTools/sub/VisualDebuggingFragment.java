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

public class VisualDebuggingFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static VisualDebuggingFragment newInstance() {
        return new VisualDebuggingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_visual_debugging, container, false);
        rv = view.findViewById(R.id.recyclerView_visual_debug);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
          lists.add(new listingModel("", "", ""));
*/
        lists.add(new listingModel("LogRocket", "a tool to record what users do on your site so you can reproduce bugs and fix issues faster.", "https://logrocket.com/"));

        lists.add(new listingModel("PixelSnap", "the magical way to measure everything on your screen.", "https://getpixelsnap.com/"));

        lists.add(new listingModel("VisBug", "on any webpage: visually debug, quick inspect style and a11y, change CSS visually, click and drag elements around, and much more.", "https://github.com/GoogleChromeLabs/ProjectVisBug"));

        lists.add(new listingModel("Visual Inspector", "collaboration tool for website feedback and fixing design bugs.", "https://www.canvasflip.com/visual-inspector/"));



        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }



}