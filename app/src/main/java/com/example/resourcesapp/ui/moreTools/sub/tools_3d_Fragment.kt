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

class tools_3d_Fragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tools_3d_, container, false)
        rv = view.findViewById(R.id.recyclerView_3d)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", ""));
*/lists!!.add(
            listingModel(
                "Autodesk",
                "integrated CAD, CAM, and CAE software. Unify design, engineering, and manufacturing into a single platform.",
                "https://www.autodesk.com/products/fusion-360/overview"
            )
        )
        lists!!.add(
            listingModel(
                "Blender",
                "free and open-source 3D Creation Software.",
                "https://www.blender.org/"
            )
        )
        lists!!.add(
            listingModel(
                "FreeCAD",
                "a free and open-source multiplatform 3D parametric modeler.",
                "https://www.freecadweb.org/"
            )
        )
        lists!!.add(
            listingModel(
                "MatterControl",
                "a free, open-source, all-in-one software package that lets you design, slice, organize and manage your 3D prints.",
                "https://www.matterhackers.com/store/l/mattercontrol/sk/MKZGTDW6"
            )
        )
        lists!!.add(
            listingModel(
                "Maya",
                "make animations, environments, motion graphics, virtual reality, and character creation, all in one toolset.",
                "https://www.autodesk.com/products/maya/overview"
            )
        )
        lists!!.add(
            listingModel(
                "Onshape",
                "a modeling software specially oriented to design technical and spare parts, was the first full-cloud 3D software created.",
                "https://www.onshape.com/"
            )
        )
        lists!!.add(
            listingModel(
                "OpenSCAD",
                "a software for creating solid 3D CAD objects.",
                "https://www.openscad.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Rhino",
                "a curve-based 3D modeling software that creates mathematically-precise models of 3D surfaces.",
                "https://www.rhino3d.com/"
            )
        )
        lists!!.add(
            listingModel(
                "SketchUp",
                "3D design software that truly makes 3D modeling for everyone, with a simple to learn yet robust toolset.",
                "https://www.sketchup.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Tinkercad",
                "a free, easy-to-use app for 3D design, electronics, and coding.",
                "https://www.tinkercad.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Vectary",
                "create beautiful 3D models with our drag and drop 3D modeling tool.",
                "https://www.vectary.com/"
            )
        )
        lists!!.add(
            listingModel(
                "3D Slash",
                "3D modeling tool, available on all devices and all OS, online and offline.",
                "https://www.3dslash.net/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): tools_3d_Fragment {
            return tools_3d_Fragment()
        }
    }
}