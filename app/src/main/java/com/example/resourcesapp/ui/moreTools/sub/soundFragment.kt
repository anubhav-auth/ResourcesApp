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

class soundFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sound, container, false)
        rv = view.findViewById(R.id.recyclerView_sound)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", "");
*/lists!!.add(
            listingModel(
                "Appsounds",
                "UI Sound packs for apps, games, and any product.",
                "https://appsounds.pro/"
            )
        )
        lists!!.add(
            listingModel(
                "AudioJungle ",
                "836,206 tracks and sounds from the community of musicians and sound engineers.",
                "https://audiojungle.net/"
            )
        )
        lists!!.add(
            listingModel(
                "Bensound",
                "download creative commons music, royalty free music for free and use it in your project.",
                "https://www.bensound.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Freesound",
                "a collaborative database of Creative Commons Licensed sounds. Browse, download and share sounds.",
                "https://freesound.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Fugue Music",
                "download free background music for your videos.",
                "https://icons8.com/music"
            )
        )
        lists!!.add(
            listingModel(
                "Max",
                "connect objects with virtual patch cords to create interactive sounds, graphics, and custom effects.",
                "https://cycling74.com/products/max/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): soundFragment {
            return soundFragment()
        }
    }
}