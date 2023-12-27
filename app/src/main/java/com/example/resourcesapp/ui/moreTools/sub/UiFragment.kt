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

class UiFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ui, container, false)
        rv = view.findViewById(R.id.recyclerView_ui)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Adobe XD 1",
                "design, prototype, and share any user experience, from websites and mobile apps to voice interactions.",
                "https://www.adobe.com/products/xd.html"
            )
        )
        lists!!.add(
            listingModel(
                "Affinity Designer",
                "a vector graphics editor for macOS, iOS, and Microsoft Windows.",
                "https://affinity.serif.com/en-gb/designer/"
            )
        )
        lists!!.add(
            listingModel(
                "Akira",
                "native Linux App for UI and UX Design built in Vala and Gtk.",
                "https://github.com/akiraux/Akira"
            )
        )
        lists!!.add(
            listingModel(
                "Botmock",
                "design, prototype, and test voice and text conversational apps. Supports multiple platforms.",
                "https://www.botmock.com/"
            )
        )
        lists!!.add(
            listingModel(
                "CleverBrush",
                "a browser-based online vector editor and digital publishing tool which is possible to integrate to the page as JS component.",
                "https://www.cleverbrush.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Figma",
                "a design tool based in the browser, that allows to design and prototype with real-time collaboration.",
                "https://www.figma.com/"
            )
        )
        lists!!.add(
            listingModel(
                "GIMP",
                "a free & open-source imaging and graphic design software.",
                "https://www.gimp.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Gravit",
                "a free vector design app, available for macOS, Windows, Linux, ChromeOS, and browser.",
                "https://designer.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Illustrator",
                "create logos, icons, drawings, typography, and illustrations for print, web, video, and mobile. Made by Adobe.",
                "https://www.adobe.com/products/illustrator.html"
            )
        )
        lists!!.add(
            listingModel(
                "Inkscape",
                "a free and open-source vector graphics editor. It can create or edit vector graphics such as illustrations, diagrams, line arts, charts, logos, and complex paintings.",
                "https://inkscape.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Krita",
                "a free painting and graphic design software considered a good alternative to Adobe Photoshop.",
                "https://krita.org/en/"
            )
        )
        lists!!.add(
            listingModel(
                "Lunacy",
                "a free native windows app that works offline and supports .sketch files. Flexible and light weighed. Intuitive and easy to use. Speedups and empowers UI and UX designers. The must have to produce stunning designs.",
                "https://icons8.com/lunacy"
            )
        )
        lists!!.add(
            listingModel(
                "Photopea",
                "a free browser-based graphic design app alternative to Photoshop.",
                "https://www.photopea.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Photoshop",
                "imaging and graphic design software developed by Adobe.",
                "https://www.adobe.com/products/photoshop.html"
            )
        )
        lists!!.add(
            listingModel(
                "Pixelixe",
                "a graphic design tool built for marketers, bloggers and small businesses that needs to create stunning and unique images, graphics or static webpages in minutes.",
                "https://studio.pixelixe.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Sketch",
                "a design toolkit built for Mac.",
                "https://www.sketchapp.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Studio",
                "combines design, prototyping, and collaboration into one harmonious workflow. Made by InVision.",
                "https://www.invisionapp.com/studio"
            )
        )
        lists!!.add(
            listingModel(
                "TwitPile",
                "creates tiled images out of Twitter followers, interests and lists.",
                "https://twitpile.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Vectr",
                "a simple web and desktop cross-platform tool to create vector graphics easily and intuitively.",
                "https://vectr.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Voiceflow",
                "prototype, design and deploy real apps for Amazon Alexa & Google Home.",
                "https://www.voiceflow.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): UiFragment {
            return UiFragment()
        }
    }
}