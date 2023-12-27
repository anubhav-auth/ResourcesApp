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

class LearnDesignFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_learn_design, container, false)
        rv = view.findViewById(R.id.recyclerView_learn_design)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(
            listingModel(
                "Design Better",
                "discover the best practices, stories, and insights from the world’s top design teams and leaders.",
                "https://www.designbetter.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Design+Code",
                "complete courses about the best tools and design systems.",
                "https://www.designcode.io/"
            )
        )
        lists!!.add(
            listingModel(
                "DesignerUp",
                "a collection of self-paced courses and mentorship to help you master Product Design (UI/UX).",
                "https://www.designerup.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Figma Training",
                "a crash course all about Figma, for UI designers.",
                "https://www.figmatraining.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Interaction Design Foundation",
                "a website that is the industry well known for learning UX/UI skills.",
                "https://www.interaction-design.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Laws of UX",
                "a collection of the maxims and principles that designers can consider when building user interfaces.",
                "https://www.lawsofux.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Learn UX",
                "a complete approach to learning UI & UX Tools.",
                "https://www.learnux.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Sketch Master",
                "a collection of video training courses for professionals learning Sketch.",
                "https://www.sketchmaster.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): LearnDesignFragment {
            return LearnDesignFragment()
        }
    }
}