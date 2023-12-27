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

class PrototypingFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_prototyping, container, false)
        rv = view.findViewById(R.id.recyclerView_prototyping)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(
            listingModel(
                "Axure RP",
                "wireframing, prototyping, collaboration & specifications generation.",
                "https://www.axure.com/"
            )
        )
        lists!!.add(
            listingModel(
                "SAP Build",
                "a complete set of cloud‑based tools to design and build your enterprise app.",
                "https://www.build.me/"
            )
        )
        lists!!.add(
            listingModel(
                "Creo",
                "prototyping, code exporting and built-in mobile app builder.",
                "https://www.build.me/"
            )
        )
        lists!!.add(
            listingModel(
                "Drama",
                "prototype, animate and design in a single Mac app.",
                "https://www.drama.app/"
            )
        )
        lists!!.add(
            listingModel(
                "InVision",
                "prototyping, collaboration & workflow platform.",
                "https://www.invisionapp.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Flinto",
                "a Mac app for creating interactive and animated prototypes of app designs.",
                "https://www.flinto.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Framer X",
                "a tool to visually design realistic interactive prototypes.",
                "https://framer.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Keynote",
                """the built-in Mac app for creating presentations that can also be used for quick prototyping (see how Apple designers use it in the WWDC 2014 session “Prototyping: Fake
     It Till You Make It” to verify design concepts).""",
                "https://www.apple.com/keynote/"
            )
        )
        lists!!.add(
            listingModel(
                "Lightwell",
                "visual tool and SDK to build mobile layouts and animations that translate into native iOS elements.",
                "https://lightwell.pro/"
            )
        )
        lists!!.add(
            listingModel(
                "Marvel App",
                "the collaborative design platform. Wireframe, prototype, design online and create design specs in one place.",
                "https://marvelapp.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Maze",
                "a tool for designers and developers that gives analytical results with actionable KPIs for your Invision prototypes.",
                "https://maze.design/"
            )
        )
        lists!!.add(
            listingModel(
                "Origami",
                "a free tool for designing modern user interfaces. Quickly put together a prototype, run it on your iPhone or iPad, iterate on it, and export code snippets your engineers can use. -",
                "https://origami.design/"
            )
        )
        lists!!.add(
            listingModel(
                "https://pencil.evolus.vn/",
                "prototyping tool with many built-in components that people can easily install and use to create mockups in popular desktop platforms.",
                "https://pencil.evolus.vn/"
            )
        )
        lists!!.add(
            listingModel(
                "Principle",
                "makes it easy to design animated and interactive user interfaces.",
                "https://principleformac.com/"
            )
        )
        lists!!.add(
            listingModel(
                "ProtoPie",
                "piece hi-fi interactions together, build sensor-aided prototypes and share your amazing creations in a matter of minutes.",
                "https://www.protopie.io/"
            )
        )
        lists!!.add(
            listingModel(
                "https://proto.io/",
                "an easy to use and intuitive prototyping tool, promotes team collaboration.",
                "https://prottapp.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Uizard",
                "transform wireframes into high-fidelity interactive prototypes, customize style systems, export to Sketch, export to HTML/CSS code.",
                "https://uizard.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Useberry",
                "a usability testing tool that allows importing prototypes from InVision, AdodeXD, Sketch, Marvel and getting users’ behavior insights with heatmaps, video recordings, user flows, time bars and answers of follow-up questions.",
                "https://www.useberry.com/"
            )
        )
        lists!!.add(
            listingModel(
                "UXPin",
                "build prototypes that feel real, with powers of code components, logic, states, and design systems.",
                "https://www.uxpin.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Reaper",
                "import any audio and MIDI, synthesize, sample, compose, arrange, edit, mix, and master songs or any other audio projects.",
                "http://reaper.fm/"
            )
        )
        lists!!.add(
            listingModel(
                "https://sonic-pi.net/",
                "a live coding music synth.",
                "https://sonic-pi.net/"
            )
        )
        lists!!.add(
            listingModel(
                "SoundKit",
                "a UI sound library designed for all of your interface needs.",
                "https://soundkit.io/"
            )
        )
        lists!!.add(
            listingModel(
                "https://uisounds.prototypr.io/",
                "learn sound design for user interfaces by example.",
                "https://uisounds.prototypr.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Wistia Music",
                "download some free background tracks to add energy and emotion to your videos.",
                "https://wistia.com/resources/music"
            )
        )
        lists!!.add(
            listingModel(
                "WOWA",
                "download royalty-free music for YouTube videos, podcasts, and apps. No copyright CC0. Music inspired by Unsplash.",
                "https://www.wowa.me/"
            )
        )
        lists!!.add(
            listingModel(
                "YouTube Audio Library",
                "browse and download free music for your project.",
                "https://www.youtube.com/audiolibrary/music"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): PrototypingFragment {
            return PrototypingFragment()
        }
    }
}