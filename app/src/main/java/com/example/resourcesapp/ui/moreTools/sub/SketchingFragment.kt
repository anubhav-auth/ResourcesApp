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

class SketchingFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sketching, container, false)
        rv = view.findViewById(R.id.recyclerView_sketching)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Responsive Sketchsheets",
                "offers responsive pre-design templates. These will automatically adapt their layout to any screen size and include neat features.",
                "https://zurb.com/playground/responsive-sketchsheets"
            )
        )
        lists!!.add(
            listingModel(
                "Sketchsheets",
                "an open source project dedicated to providing free printable templates of the latest devices and platforms for wireframing designs.",
                "https://sketchsheets.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Sneakpeekit",
                "print note taking grids and devices frames.",
                "https://sneakpeekit.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Sketchize",
                "just choose any of the sketch sheets that fits your project, print it out and start to sketch your dream.",
                "https://sketchize.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): SketchingFragment {
            return SketchingFragment()
        }
    }
}