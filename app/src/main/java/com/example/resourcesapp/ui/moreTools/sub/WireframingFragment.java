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

public class WireframingFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static WireframingFragment newInstance() {
        return new WireframingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wireframing, container, false);
        rv = view.findViewById(R.id.recyclerView_wireframing);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/


        lists.add(new listingModel("Balsamiq Cloud", "effortless UI sketching. Capture your ideas, collaborate on your designs, get everyone on board.", "https://balsamiq.cloud/"));

        lists.add(new listingModel("BLOKK", "a font for quick mock-ups and wireframing for clients who do not understand Latin.", "http://www.blokkfont.com/"));

        lists.add(new listingModel("CSS Grid Builder", "with this tool there is no HTML part to the grid. The grid only becomes apparent when content (elements) are added and positioned according to the grid rules.", "https://cssgrid.cc/css-grid-builder.html"));

        lists.add(new listingModel("Gliffy", "a tool for creating the framework, UML diagrams, flowcharts, wireframes and more.", "https://www.gliffy.com/"));

        lists.add(new listingModel("Gridzzly", "the easiest way to create custom grid paper printable.", "http://gridzzly.com/"));

        lists.add(new listingModel("Layoutit", "a interface builder for CSS Grid & Bootstrap that wants to be the kick-off for your front-end developments.", "https://grid.layoutit.com/"));

        lists.add(new listingModel("Pidoco", "software that lets you quickly create click-through wireframes and fully interactive UX prototypes.", "https://pidoco.com/en"));

        lists.add(new listingModel("Wireframe.cc", "a simple wireframing tool that doesn’t get in your way.", "https://wireframe.cc/"));

        lists.add(new listingModel("Whimsical Wireframes", "instant wireframing at your fingertips. Rich library of configurable elements like buttons, inputs, checkboxes.", "https://whimsical.co/wireframes/"));

        lists.add(new listingModel("1200px Grid System", "helps you build a grid system for much wider website designs than the 960-pixel style.", "https://1200px.com/"));


        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }



}