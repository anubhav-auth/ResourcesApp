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

public class Smm_Fragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static Smm_Fragment newInstance() {
        return new Smm_Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_smm_, container, false);
        rv = view.findViewById(R.id.recyclerView_smm);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/
        lists.add(new listingModel("Canva", "create stunning designs for work, life, and play—even if you’re not a design expert!", "https://www.canva.com/"));

        lists.add(new listingModel("Crello", "create own designs: posts, covers, graphics, and posters using the best software on the web.", "https://crello.com/"));

        lists.add(new listingModel("Pablo by Buffer", "design engaging images for your social media posts.", "https://pablo.buffer.com/"));

        lists.add(new listingModel("Remove.bg", "a free service to remove the background of any photo.", "https://www.remove.bg/"));

        lists.add(new listingModel("SocialSizes", "provides designers with the best sizes to use for image and video content on social media.", "https://socialsizes.io/"));

        lists.add(new listingModel("Stencil", "a graphic design tool that is all about creating social media images easily and quickly.", "https://getstencil.com/"));

        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

}