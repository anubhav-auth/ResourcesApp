package com.example.resourcesapp.ui.moreTools;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.resourcesapp.MainActivity;
import com.example.resourcesapp.R;
import com.example.resourcesapp.views.grid.gridAdapter;
import com.example.resourcesapp.views.grid.gridModel;

import java.util.ArrayList;

public class MoreToolsFragment extends Fragment {

    ArrayList<gridModel> lists;
    RecyclerView rv;
    gridAdapter adapter;

    public static MoreToolsFragment newInstance() {
        return new MoreToolsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_more_tools, container, false);
        rv = view.findViewById(R.id.recyclerView_moreTools);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<gridModel>();
/*         sample here
       lists.add(new listingModel("", "", "https://www."));
*/

        lists.add(new gridModel("3-D MODELING TOOLS", 1));
        lists.add(new gridModel("PROTOTYPING TOOLS", 2));
        lists.add(new gridModel("SCREENSHOT TOOLS",3));
        lists.add(new gridModel("SKETCHING TOOLS",4));
        lists.add(new gridModel("SMM DESIGN TOOLS",5 ));
        lists.add(new gridModel("SOUND DESIGN TOOLS", 6));
        lists.add(new gridModel("STOCK PHOTO TOOLS", 7));
        lists.add(new gridModel("STOCK VIDEO TOOLS", 8));
        lists.add(new gridModel("DESIGN LEARNING TOOLS", 9));
        lists.add(new gridModel("UI DESIGN TOOLS", 10));
        lists.add(new gridModel("USER FLOW TOOLS",11));
        lists.add(new gridModel("USER RESEARCH TOOLS", 12));
        lists.add(new gridModel("VISUAL DEBUGGING TOOLS", 13));
        lists.add(new gridModel("WIREFRAMING TOOLS", 14));

        adapter = new gridAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }



}