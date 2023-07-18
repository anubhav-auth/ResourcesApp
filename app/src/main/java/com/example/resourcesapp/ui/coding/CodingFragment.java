package com.example.resourcesapp.ui.coding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.resourcesapp.views.*;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resourcesapp.R;
import com.example.resourcesapp.ui.home.HomeFragment;
import com.example.resourcesapp.views.grid.*;

import java.util.ArrayList;

public class CodingFragment extends Fragment implements gridAdapter.OnItemClickListener{

    ArrayList<gridModel> lists;
    RecyclerView rv;
    gridAdapter adapter;
    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_coding, container, false);
        rv = view.findViewById(R.id.recyclerView_coding);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<gridModel>();
/*         sample here
       lists.add(new listingModel("", "", "https://www."));
*/

        lists.add(new gridModel("CODING GAMES"));
        lists.add(new gridModel("USEFULL IDE EXTENSIONS"));

        adapter = new gridAdapter(getContext(), lists, this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


    @Override
    public void onItemClick(int position) {

                switch (position) {
                    case 0 -> {
                        Navigation.findNavController(requireView()).navigate(R.id.action_nav_coding_to_nav_codingGames);
                    }
                    case 1 -> {
                        Navigation.findNavController(requireView()).navigate(R.id.action_nav_coding_to_nav_usefullIDEExtensions);
                    }
                }
    }

}