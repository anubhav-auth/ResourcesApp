package com.example.resourcesapp.ui.coding.sub;

import androidx.lifecycle.ViewModelProvider;

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

public class CodingGamesFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static CodingGamesFragment newInstance() {

        return new CodingGamesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coding_games, container, false);
        rv = view.findViewById(R.id.recyclerView_codinggames);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", "https://www."));
*/

        lists.add(new listingModel("Z Type", "Transform any website\n" +
                "into a typing game.", "https://zty.pe/?load/"));

        lists.add(new listingModel("CodinGame", "Learn new concepts by solving fun challenges in 25+ languages addressing all the hot programming topics.", "https://www.codingame.com/start"));

        lists.add(new listingModel("CodeCombat", "", "https://codecombat.com/"));

        lists.add(new listingModel("CodeWars", "Improve your development skills by training with your peers on code kata that continuously challenge and push your coding practice.", "https://www.codewars.com/"));

        lists.add(new listingModel("RoboCode", "Robocode is a programming game, where the goal is to develop a robot battle tank to battle against other tanks in Java. The robot battles are running in real-time and on-screen.", "https://robocode.sourceforge.io/"));

        lists.add(new listingModel("CSS-Diner", "It's a fun game to learn and practice CSS selectors.", "https://flukeout.github.io/"));

        lists.add(new listingModel("Flexbox Froggy", "A game where you help Froggy and friends by writing CSS code!", "https://flexboxfroggy.com/"));


        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

}