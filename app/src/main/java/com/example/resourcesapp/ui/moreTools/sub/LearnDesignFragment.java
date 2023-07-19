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

public class LearnDesignFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static LearnDesignFragment newInstance() {
        return new LearnDesignFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_learn_design, container, false);
        rv = view.findViewById(R.id.recyclerView_InfoGathering);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", "https://www."));
*/

        lists.add(new listingModel("Design Better", "discover the best practices, stories, and insights from the world’s top design teams and leaders.", "https://www.designbetter.co/"));

        lists.add(new listingModel("Design+Code", "complete courses about the best tools and design systems.", "https://www.designcode.io/"));

        lists.add(new listingModel("DesignerUp", "a collection of self-paced courses and mentorship to help you master Product Design (UI/UX).", "https://www.designerup.co/"));

        lists.add(new listingModel("Figma Training", "a crash course all about Figma, for UI designers.", "https://www.figmatraining.com/"));

        lists.add(new listingModel("Interaction Design Foundation", "a website that is the industry well known for learning UX/UI skills.", "https://www.interaction-design.org/"));

        lists.add(new listingModel("Laws of UX", "a collection of the maxims and principles that designers can consider when building user interfaces.", "https://www.lawsofux.com/"));

        lists.add(new listingModel("Learn UX", "a complete approach to learning UI & UX Tools.", "https://www.learnux.io/"));

        lists.add(new listingModel("Sketch Master", "a collection of video training courses for professionals learning Sketch.", "https://www.sketchmaster.com/"));


        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


}