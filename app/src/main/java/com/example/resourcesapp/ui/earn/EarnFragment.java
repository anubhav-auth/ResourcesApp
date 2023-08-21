package com.example.resourcesapp.ui.earn;

import androidx.lifecycle.ViewModelProvider;

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
import android.widget.Toast;

import com.example.resourcesapp.R;
import com.example.resourcesapp.views.grid.gridAdapter;
import com.example.resourcesapp.views.grid.gridModel;

import java.util.ArrayList;

public class EarnFragment extends Fragment implements gridAdapter.OnItemClickListener{

    ArrayList<gridModel> lists;
    RecyclerView rv;
    gridAdapter adapter;

    public static EarnFragment newInstance() {
        return new EarnFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_earn, container, false);
        rv = view.findViewById(R.id.recyclerView_earn);
        listings();



        return view;
    }

    public void listings(){
        lists =  new ArrayList<gridModel>();
/*         sample here
       lists.add(new listingModel("", "", "https://www."));
*/

        lists.add(new gridModel("Affiliate Marketing"));
        lists.add(new gridModel("Drop shipping"));
        lists.add(new gridModel("Earning Ideas"));
        lists.add(new gridModel("Earning Sites"));
        lists.add(new gridModel("Mystery Shopping"));
        lists.add(new gridModel("NFT Generator"));
        lists.add(new gridModel("Sell T-Shirts Online"));
        lists.add(new gridModel("Website Testing"));
        lists.add(new gridModel("Earn From Youtube"));

        adapter = new gridAdapter(getContext(), lists, this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {

        switch (position) {
            case 0 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_affiliateMarketingFragment);
            }
            case 1 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_dropShippingFragment);
            }
            case 2 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_earningIdeasFragment);
            }
            case 3 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_earningSitesFragment);
            }
            case 4 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_mysteryShoppingFragment);
            }
            case 5 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_NFTGeneratorFragment);
            }
            case 6 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_sellTshirtFragment);
            }
            case 7 -> {
                Toast.makeText(getContext(), "hello", Toast.LENGTH_SHORT).show();
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_websiteTestingFragment);
            }
            case 8 -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_nav_earn_to_youtubeFragment);
            }

        }
    }
}