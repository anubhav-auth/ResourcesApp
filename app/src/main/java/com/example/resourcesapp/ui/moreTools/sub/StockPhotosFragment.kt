package com.example.resourcesapp.ui.moreTools.sub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.views.listingAdapter
import com.example.resourcesapp.views.listingModel

class StockPhotosFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_stock_photos, container, false)
        rv = view.findViewById(R.id.recyclerView_stock_photos)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Burst",
                "free stock photos for websites and commercial use.",
                "https://burst.shopify.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Duotone",
                "free duotone images to use in any project, or make custom duotone images.",
                "https://duotone.shapefactory.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Death to Stock",
                "paid-for stock photo service with a mailing list for occasional free packs, and a focus on not looking like stock photography.",
                "https://deathtothestockphoto.com/"
            )
        )
        lists!!.add(
            listingModel(
                "FoodiesFeed",
                "thousands of beautiful realistic free food pictures in high resolution.",
                "https://foodiesfeed.com/"
            )
        )
        lists!!.add(
            listingModel(
                "FreePhotos.cc",
                "free stock photos for commercial use.",
                "https://freephotos.cc/"
            )
        )
        lists!!.add(
            listingModel(
                "Freestocks.org",
                "high quality photos all released under Creative Commons CC0.",
                "http://freestocks.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Gratisography",
                "a collection of free high-resolution pictures.",
                "https://gratisography.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Jay Mantri",
                "7 new photos released every Thursday under the Creative Commons CC0.",
                "https://jaymantri.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Kaboom Pics",
                "stock photos including abstract, city/architecture, fashion, food & landscapes.",
                "https://kaboompics.com/"
            )
        )
        lists!!.add(
            listingModel(
                "LandingStock",
                "a collection of free images for your landing page.",
                "https://landingstock.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Life of Pix",
                "free high-resolution photos, created by the LEEROY team.",
                "https://www.lifeofpix.com/"
            )
        )
        lists!!.add(
            listingModel(
                "LoremPixel",
                "an API that serves stock photos at specified sizes and categories. Great for placeholder/user-generated content.",
                "https://lorempixel.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Magdeleine",
                "free high-quality stock photos for your inspiration.",
                "https://magdeleine.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Moose",
                "don’t search for stock photos, create them.",
                "https://photos.icons8.com/"
            )
        )
        lists!!.add(
            listingModel(
                "MMT STock",
                "high-resolution photos provided by Jeffrey Betts with Creative Commons CC0.",
                "http://mmtstock.com/"
            )
        )
        lists!!.add(
            listingModel(
                "New Old Stock",
                "a vintage photos from the public archives free of known copyright restrictions.",
                "https://nos.twnsnd.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Pexels",
                "an aggregate of many free stock photo and video resources.",
                "https://www.pexels.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Photo Creator",
                "a free tool for creating realistic stock photos on your demand.",
                "https://photos.icons8.com/creator"
            )
        )
        lists!!.add(
            listingModel(
                "Picography",
                "free stock photos by Dave Meier and various other photographers with Creative Commons CC0.",
                "https://picography.co/"
            )
        )
        lists!!.add(listingModel("pxhere", "free image stock.", "https://pxhere.com/"))
        lists!!.add(
            listingModel(
                "Reshot",
                "a massive library of handpicked free stock photos you won’t find elsewhere.",
                "https://www.reshot.com/"
            )
        )
        lists!!.add(
            listingModel(
                "ShotStash",
                "thousands of free high-resolution CC0 photos and videos.",
                "https://shotstash.com/"
            )
        )
        lists!!.add(
            listingModel(
                "SkitterPhoto",
                "a wide variety of stock photos and are released under Creative Commons CC0.",
                "https://skitterphoto.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Startup Stock Photos",
                "free photos for startups, bloggers and publishers.",
                "http://startupstockphotos.com/"
            )
        )
        lists!!.add(
            listingModel(
                "StockSnap.io",
                "a large selection of free stock photos and high-resolution images.",
                "https://stocksnap.io/"
            )
        )
        lists!!.add(
            listingModel(
                "StyledStock",
                "free feminine stock photography for every woman entrepreneur.",
                "https://styledstock.co/"
            )
        )
        lists!!.add(
            listingModel(
                "The Gender Spectrum Collection",
                "a stock photo library featuring images of trans and non-binary models that go beyond the clichés.",
                "https://genderspectrum.vice.com/"
            )
        )
        lists!!.add(
            listingModel(
                "UI Faces",
                "an aggregator that indexes various free avatar sources that you can use in your design mockups.",
                "https://uifaces.co/"
            )
        )
        lists!!.add(listingModel("Unsplash", "stock photos free to use.", "https://unsplash.com/"))
        lists!!.add(
            listingModel(
                "#WOCinTech Chat Photos",
                "free stock photos of women technologists of diverse backgrounds.",
                ""
            )
        )
        lists!!.add(
            listingModel(
                "Zoommy",
                "helps you find awesome free stock photos for your creative product or inspiration.",
                "http://www.zoommyapp.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): StockPhotosFragment {
            return StockPhotosFragment()
        }
    }
}