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

class WireframingFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_wireframing, container, false)
        rv = view.findViewById(R.id.recyclerView_wireframing)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Balsamiq Cloud",
                "effortless UI sketching. Capture your ideas, collaborate on your designs, get everyone on board.",
                "https://balsamiq.cloud/"
            )
        )
        lists!!.add(
            listingModel(
                "BLOKK",
                "a font for quick mock-ups and wireframing for clients who do not understand Latin.",
                "http://www.blokkfont.com/"
            )
        )
        lists!!.add(
            listingModel(
                "CSS Grid Builder",
                "with this tool there is no HTML part to the grid. The grid only becomes apparent when content (elements) are added and positioned according to the grid rules.",
                "https://cssgrid.cc/css-grid-builder.html"
            )
        )
        lists!!.add(
            listingModel(
                "Gliffy",
                "a tool for creating the framework, UML diagrams, flowcharts, wireframes and more.",
                "https://www.gliffy.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Gridzzly",
                "the easiest way to create custom grid paper printable.",
                "http://gridzzly.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Layoutit",
                "a interface builder for CSS Grid & Bootstrap that wants to be the kick-off for your front-end developments.",
                "https://grid.layoutit.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Pidoco",
                "software that lets you quickly create click-through wireframes and fully interactive UX prototypes.",
                "https://pidoco.com/en"
            )
        )
        lists!!.add(
            listingModel(
                "Wireframe.cc",
                "a simple wireframing tool that doesn’t get in your way.",
                "https://wireframe.cc/"
            )
        )
        lists!!.add(
            listingModel(
                "Whimsical Wireframes",
                "instant wireframing at your fingertips. Rich library of configurable elements like buttons, inputs, checkboxes.",
                "https://whimsical.co/wireframes/"
            )
        )
        lists!!.add(
            listingModel(
                "1200px Grid System",
                "helps you build a grid system for much wider website designs than the 960-pixel style.",
                "https://1200px.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): WireframingFragment {
            return WireframingFragment()
        }
    }
}