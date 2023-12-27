package com.example.resourcesapp.ui.coding.sub

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

class UsefullIDEExtensionsFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_usefull_extensions, container, false)
        rv = view.findViewById(R.id.recyclerView_usefullIDEextension)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", "https://www."));

 */lists!!.add(
            listingModel(
                "Tabnine", """
     Autocomplete lines of code
     Suggests full function completion based on function declaration
     Generates blocks of code based on natural language comments
     """.trimIndent(), "https://www.tabnine.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Mintlify",
                "✍️ AI powered documentation writer",
                "https://writer.mintlify.com/"
            )
        )
        lists!!.add(
            listingModel(
                "ESLint",
                "ESLint is an open source project that helps you find and fix problems with your JavaScript code.",
                "https://eslint.org/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): UsefullIDEExtensionsFragment {
            return UsefullIDEExtensionsFragment()
        }
    }
}