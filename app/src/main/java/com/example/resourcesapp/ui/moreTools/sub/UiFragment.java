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

public class UiFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static UiFragment newInstance() {
        return new UiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ui, container, false);
        rv = view.findViewById(R.id.recyclerView_ui);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/

        lists.add(new listingModel("Adobe XD 1", "design, prototype, and share any user experience, from websites and mobile apps to voice interactions.", "https://www.adobe.com/products/xd.html"));

        lists.add(new listingModel("Affinity Designer", "a vector graphics editor for macOS, iOS, and Microsoft Windows.", "https://affinity.serif.com/en-gb/designer/"));

        lists.add(new listingModel("Akira", "native Linux App for UI and UX Design built in Vala and Gtk.", "https://github.com/akiraux/Akira"));

        lists.add(new listingModel("Botmock", "design, prototype, and test voice and text conversational apps. Supports multiple platforms.", "https://www.botmock.com/"));

        lists.add(new listingModel("CleverBrush", "a browser-based online vector editor and digital publishing tool which is possible to integrate to the page as JS component.", "https://www.cleverbrush.com/"));

        lists.add(new listingModel("Figma", "a design tool based in the browser, that allows to design and prototype with real-time collaboration.", "https://www.figma.com/"));

        lists.add(new listingModel("GIMP", "a free & open-source imaging and graphic design software.", "https://www.gimp.org/"));

        lists.add(new listingModel("Gravit", "a free vector design app, available for macOS, Windows, Linux, ChromeOS, and browser.", "https://designer.io/"));

        lists.add(new listingModel("Illustrator", "create logos, icons, drawings, typography, and illustrations for print, web, video, and mobile. Made by Adobe.", "https://www.adobe.com/products/illustrator.html"));

        lists.add(new listingModel("Inkscape", "a free and open-source vector graphics editor. It can create or edit vector graphics such as illustrations, diagrams, line arts, charts, logos, and complex paintings.", "https://inkscape.org/"));

        lists.add(new listingModel("Krita", "a free painting and graphic design software considered a good alternative to Adobe Photoshop.", "https://krita.org/en/"));

        lists.add(new listingModel("Lunacy", "a free native windows app that works offline and supports .sketch files. Flexible and light weighed. Intuitive and easy to use. Speedups and empowers UI and UX designers. The must have to produce stunning designs.", "https://icons8.com/lunacy"));

        lists.add(new listingModel("Photopea", "a free browser-based graphic design app alternative to Photoshop.", "https://www.photopea.com/"));

        lists.add(new listingModel("Photoshop", "imaging and graphic design software developed by Adobe.", "https://www.adobe.com/products/photoshop.html"));

        lists.add(new listingModel("Pixelixe", "a graphic design tool built for marketers, bloggers and small businesses that needs to create stunning and unique images, graphics or static webpages in minutes.", "https://studio.pixelixe.com/"));

        lists.add(new listingModel("Sketch", "a design toolkit built for Mac.", "https://www.sketchapp.com/"));

        lists.add(new listingModel("Studio", "combines design, prototyping, and collaboration into one harmonious workflow. Made by InVision.", "https://www.invisionapp.com/studio"));

        lists.add(new listingModel("TwitPile", "creates tiled images out of Twitter followers, interests and lists.", "https://twitpile.com/"));

        lists.add(new listingModel("Vectr", "a simple web and desktop cross-platform tool to create vector graphics easily and intuitively.", "https://vectr.com/"));

        lists.add(new listingModel("Voiceflow", "prototype, design and deploy real apps for Amazon Alexa & Google Home.", "https://www.voiceflow.com/"));


        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }



}