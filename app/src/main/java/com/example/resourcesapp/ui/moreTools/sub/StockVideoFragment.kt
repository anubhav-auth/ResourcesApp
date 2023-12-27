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

class StockVideoFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_stock_video, container, false)
        rv = view.findViewById(R.id.recyclerView_stock_video)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Coverr",
                "beautiful, free stock video footage for your homepage.",
                "https://coverr.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Life of Vids",
                "provides free stock videos, clips, and loops.",
                "http://www.lifeofvids.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Mazwai",
                "great collection of free creative commons HD video clips & footages.",
                "http://mazwai.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Motion Places ",
                "a curated collection of beautiful footage you can use for your projects.",
                "https://www.motionplaces.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Mixkit",
                "extraordinary Free HD videos. For you to use, completely free of charge.",
                "https://mixkit.co"
            )
        )
        lists!!.add(
            listingModel(
                "Pixabay",
                "it has more than 1.5 million royalty-free stock videos and photos shared by their community of creators.",
                "https://pixabay.com/"
            )
        )
        lists!!.add(
            listingModel(
                "https://www.pexels.com/videos/",
                "makes it easy to find free stock footage for your website, promo video or anything else.",
                "https://www.pexels.com/videos/"
            )
        )
        lists!!.add(
            listingModel(
                "Videezy",
                "download millions of free and premium stock footage and motion graphics instantly.",
                "https://www.videezy.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Videvo",
                "offers a large selection of HD video clips, motion graphics, and free stock footage.",
                "https://www.videvo.net/"
            )
        )
        lists!!.add(
            listingModel(
                "123RF",
                "over 100,000 daily new content & 24/7 online support",
                "https://www.123rf.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): StockVideoFragment {
            return StockVideoFragment()
        }
    }
}