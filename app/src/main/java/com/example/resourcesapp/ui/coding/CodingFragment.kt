package com.example.resourcesapp.ui.coding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.ui.home.HomeFragment
import com.example.resourcesapp.views.grid.gridAdapter
import com.example.resourcesapp.views.grid.gridModel

class CodingFragment : Fragment(), gridAdapter.OnItemClickListener {
    var lists: ArrayList<gridModel>? = null
    var rv: RecyclerView? = null
    var adapter: gridAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_coding, container, false)
        rv = view.findViewById(R.id.recyclerView_coding)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*         sample here
       lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(gridModel("CODING GAMES"))
        lists!!.add(gridModel("USEFULL IDE EXTENSIONS"))
        adapter = gridAdapter(requireContext(), lists!!, this)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                findNavController(requireView()).navigate(R.id.action_nav_coding_to_nav_codingGames)
            }

            1 -> {
                findNavController(requireView()).navigate(R.id.action_nav_coding_to_nav_usefullIDEExtensions)
            }
        }
    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}