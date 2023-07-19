package com.example.resourcesapp.ui.moreTools.sub;

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

public class StockPhotosFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static StockPhotosFragment newInstance() {
        return new StockPhotosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stock_photos, container, false);
        rv = view.findViewById(R.id.recyclerView_stock_photos);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/

        lists.add(new listingModel("Burst", "free stock photos for websites and commercial use.", "https://burst.shopify.com/"));

        lists.add(new listingModel("Duotone", "free duotone images to use in any project, or make custom duotone images.", "https://duotone.shapefactory.co/"));

        lists.add(new listingModel("Death to Stock", "paid-for stock photo service with a mailing list for occasional free packs, and a focus on not looking like stock photography.", "https://deathtothestockphoto.com/"));

        lists.add(new listingModel("FoodiesFeed", "thousands of beautiful realistic free food pictures in high resolution.", "https://foodiesfeed.com/"));

        lists.add(new listingModel("FreePhotos.cc", "free stock photos for commercial use.", "https://freephotos.cc/"));

        lists.add(new listingModel("Freestocks.org", "high quality photos all released under Creative Commons CC0.", "http://freestocks.org/"));

        lists.add(new listingModel("Gratisography", "a collection of free high-resolution pictures.", "https://gratisography.com/"));

        lists.add(new listingModel("Jay Mantri", "7 new photos released every Thursday under the Creative Commons CC0.", "https://jaymantri.com/"));

        lists.add(new listingModel("Kaboom Pics", "stock photos including abstract, city/architecture, fashion, food & landscapes.", "https://kaboompics.com/"));

        lists.add(new listingModel("LandingStock", "a collection of free images for your landing page.", "https://landingstock.com/"));

        lists.add(new listingModel("Life of Pix", "free high-resolution photos, created by the LEEROY team.", "https://www.lifeofpix.com/"));

        lists.add(new listingModel("LoremPixel", "an API that serves stock photos at specified sizes and categories. Great for placeholder/user-generated content.", "https://lorempixel.com/"));

        lists.add(new listingModel("Magdeleine", "free high-quality stock photos for your inspiration.", "https://magdeleine.co/"));

        lists.add(new listingModel("Moose", "don’t search for stock photos, create them.", "https://photos.icons8.com/"));

        lists.add(new listingModel("MMT STock", "high-resolution photos provided by Jeffrey Betts with Creative Commons CC0.", "http://mmtstock.com/"));

        lists.add(new listingModel("New Old Stock", "a vintage photos from the public archives free of known copyright restrictions.", "https://nos.twnsnd.co/"));

        lists.add(new listingModel("Pexels", "an aggregate of many free stock photo and video resources.", "https://www.pexels.com/"));

        lists.add(new listingModel("Photo Creator", "a free tool for creating realistic stock photos on your demand.", "https://photos.icons8.com/creator"));

        lists.add(new listingModel("Picography", "free stock photos by Dave Meier and various other photographers with Creative Commons CC0.", "https://picography.co/"));

        lists.add(new listingModel("pxhere", "free image stock.", "https://pxhere.com/"));

        lists.add(new listingModel("Reshot", "a massive library of handpicked free stock photos you won’t find elsewhere.", "https://www.reshot.com/"));

        lists.add(new listingModel("ShotStash", "thousands of free high-resolution CC0 photos and videos.", "https://shotstash.com/"));

        lists.add(new listingModel("SkitterPhoto", "a wide variety of stock photos and are released under Creative Commons CC0.", "https://skitterphoto.com/"));

        lists.add(new listingModel("Startup Stock Photos", "free photos for startups, bloggers and publishers.", "http://startupstockphotos.com/"));

        lists.add(new listingModel("StockSnap.io", "a large selection of free stock photos and high-resolution images.", "https://stocksnap.io/"));

        lists.add(new listingModel("StyledStock", "free feminine stock photography for every woman entrepreneur.", "https://styledstock.co/"));

        lists.add(new listingModel("The Gender Spectrum Collection", "a stock photo library featuring images of trans and non-binary models that go beyond the clichés.", "https://genderspectrum.vice.com/"));

        lists.add(new listingModel("UI Faces", "an aggregator that indexes various free avatar sources that you can use in your design mockups.", "https://uifaces.co/"));

        lists.add(new listingModel("Unsplash", "stock photos free to use.", "https://unsplash.com/"));

        lists.add(new listingModel("#WOCinTech Chat Photos", "free stock photos of women technologists of diverse backgrounds.", ""));

        lists.add(new listingModel("Zoommy", "helps you find awesome free stock photos for your creative product or inspiration.", "http://www.zoommyapp.com/"));

        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


}