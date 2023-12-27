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

class VisualDebuggingFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_visual_debugging, container, false)
        rv = view.findViewById(R.id.recyclerView_visual_debug)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
          lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "LogRocket",
                "a tool to record what users do on your site so you can reproduce bugs and fix issues faster.",
                "https://logrocket.com/"
            )
        )
        lists!!.add(
            listingModel(
                "PixelSnap",
                "the magical way to measure everything on your screen.",
                "https://getpixelsnap.com/"
            )
        )
        lists!!.add(
            listingModel(
                "VisBug",
                "on any webpage: visually debug, quick inspect style and a11y, change CSS visually, click and drag elements around, and much more.",
                "https://github.com/GoogleChromeLabs/ProjectVisBug"
            )
        )
        lists!!.add(
            listingModel(
                "Visual Inspector",
                "collaboration tool for website feedback and fixing design bugs.",
                "https://www.canvasflip.com/visual-inspector/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): VisualDebuggingFragment {
            return VisualDebuggingFragment()
        }
    }
}