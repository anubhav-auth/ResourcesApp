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

class Smm_Fragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_smm_, container, false)
        rv = view.findViewById(R.id.recyclerView_smm)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Canva",
                "create stunning designs for work, life, and play—even if you’re not a design expert!",
                "https://www.canva.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Crello",
                "create own designs: posts, covers, graphics, and posters using the best software on the web.",
                "https://crello.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Pablo by Buffer",
                "design engaging images for your social media posts.",
                "https://pablo.buffer.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Remove.bg",
                "a free service to remove the background of any photo.",
                "https://www.remove.bg/"
            )
        )
        lists!!.add(
            listingModel(
                "SocialSizes",
                "provides designers with the best sizes to use for image and video content on social media.",
                "https://socialsizes.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Stencil",
                "a graphic design tool that is all about creating social media images easily and quickly.",
                "https://getstencil.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): Smm_Fragment {
            return Smm_Fragment()
        }
    }
}