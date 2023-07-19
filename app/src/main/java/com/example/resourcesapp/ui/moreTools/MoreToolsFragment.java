package com.example.resourcesapp.ui.moreTools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;
import com.example.resourcesapp.views.grid.gridAdapter;
import com.example.resourcesapp.views.grid.gridModel;

import java.util.ArrayList;

public class MoreToolsFragment extends Fragment implements gridAdapter.OnItemClickListener{

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

        lists.add(new gridModel("3-D MODELING TOOLS"));
        lists.add(new gridModel("PROTOTYPING TOOLS"));
        lists.add(new gridModel("SCREENSHOT TOOLS"));
        lists.add(new gridModel("SKETCHING TOOLS"));
        lists.add(new gridModel("SMM DESIGN TOOLS" ));
        lists.add(new gridModel("SOUND DESIGN TOOLS"));
        lists.add(new gridModel("STOCK PHOTO TOOLS"));
        lists.add(new gridModel("STOCK VIDEO TOOLS"));
        lists.add(new gridModel("DESIGN LEARNING TOOLS"));
        lists.add(new gridModel("UI DESIGN TOOLS"));
        lists.add(new gridModel("USER FLOW TOOLS"));
        lists.add(new gridModel("USER RESEARCH TOOLS"));
        lists.add(new gridModel("VISUAL DEBUGGING TOOLS"));
        lists.add(new gridModel("WIREFRAMING TOOLS"));

        adapter = new gridAdapter(getContext(), lists, this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        switch (position) {
            case 0 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_tools_3d_Fragment);
            }
            case 1 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_prototypingFragment);
            }
            case 2 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_screenshotFragment);
            }
            case 3 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_sketchingFragment);
            }
            case 4 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_smm_Fragment);
            }
            case 5 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_soundFragment);
            }
            case 6 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_stockPhotosFragment);
            }
            case 7 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_stockVideoFragment);
            }
            case 8 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_learnDesignFragment);
            }
            case 9 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_uiFragment);
            }
            case 10 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_userFlowFragment);
            }
            case 11 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_userResearchFragment);
            }
            case 12 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_visualDebuggingFragment);
            }
            case 13 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_wireframingFragment);
            }
        }
    }
}