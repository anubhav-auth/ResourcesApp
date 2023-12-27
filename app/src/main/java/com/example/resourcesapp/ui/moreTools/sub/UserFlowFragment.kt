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

class UserFlowFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user_flow, container, false)
        rv = view.findViewById(R.id.recyclerView_user_flow)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Draw.io",
                "a free online diagram software for making flowcharts, process diagrams, org charts, UML, ER, and network diagrams.",
                "https://www.draw.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Flowmapp",
                "an online tool for creating sitemaps and user flows that helps you to effectively design and plan user experience.",
                "https://flowmapp.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Google Drawings",
                "create diagrams and charts, for free; all within Google Docs.",
                "https://docs.google.com/drawings/"
            )
        )
        lists!!.add(
            listingModel(
                "Lucidchart",
                "an online tool for creating diagrams, flow charts, sitemaps, and more.",
                "https://www.lucidchart.com/"
            )
        )
        lists!!.add(
            listingModel(
                "MindNode",
                "a mind mapping app that makes brainstorming simple and easy.",
                "https://mindnode.com/"
            )
        )
        lists!!.add(
            listingModel(
                "NinjaMock",
                "wireframe and user flow online tool. Link your views and create logic flow prototype. All with freehand visual style.",
                "https://ninjamock.com/"
            )
        )
        lists!!.add(
            listingModel(
                "OmniGraffle",
                "a diagramming and digital illustration application for macOS and iOS.",
                "https://www.omnigroup.com/omnigraffle/"
            )
        )
        lists!!.add(
            listingModel(
                "Overflow",
                "turn your designs into playable user flow diagrams that tell a story.",
                "https://overflow.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Sketch.systems",
                "ui and flow design with interactive state machines.",
                "https://sketch.systems/"
            )
        )
        lists!!.add(
            listingModel(
                "SQUID",
                "create beautiful User Flows in Sketch in just minutes.",
                "https://uxmisfit.com/squid/"
            )
        )
        lists!!.add(
            listingModel(
                "WebSequenceDiagrams",
                "a simple webapp to work out object interactions arranged in time sequence.",
                "https://www.websequencediagrams.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Whimsical",
                "easy to create flow charts, wireframes and sticky notes.",
                "https://whimsical.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Wireflow",
                "free, online and open source tool for creating beautiful user flow prototypes.",
                "http://wireflow.co/"
            )
        )
        lists!!.add(
            listingModel(
                "XMind: ZEN",
                "a brainstorming and mind mapping tool that can switch between outline and tree-chart. Link topics with other charts.",
                "https://www.xmind.net/zen/"
            )
        )
        lists!!.add(
            listingModel(
                "yEd",
                "free desktop tool for making diagrams. Usable for the wide variety of use cases. Auto-layout helps a lot when making flowcharts.",
                "https://www.yworks.com/products/yed"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): UserFlowFragment {
            return UserFlowFragment()
        }
    }
}