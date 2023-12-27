package com.example.resourcesapp.ui.moreTools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.views.grid.gridAdapter
import com.example.resourcesapp.views.grid.gridModel

class MoreToolsFragment : Fragment(), gridAdapter.OnItemClickListener {
    var lists: ArrayList<gridModel>? = null
    var rv: RecyclerView? = null
    var adapter: gridAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_more_tools, container, false)
        rv = view.findViewById(R.id.recyclerView_moreTools)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*         sample here
       lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(gridModel("3-D MODELING TOOLS"))
        lists!!.add(gridModel("PROTOTYPING TOOLS"))
        lists!!.add(gridModel("SCREENSHOT TOOLS"))
        lists!!.add(gridModel("SKETCHING TOOLS"))
        lists!!.add(gridModel("SMM DESIGN TOOLS"))
        lists!!.add(gridModel("SOUND DESIGN TOOLS"))
        lists!!.add(gridModel("STOCK PHOTO TOOLS"))
        lists!!.add(gridModel("STOCK VIDEO TOOLS"))
        lists!!.add(gridModel("DESIGN LEARNING TOOLS"))
        lists!!.add(gridModel("UI DESIGN TOOLS"))
        lists!!.add(gridModel("USER FLOW TOOLS"))
        lists!!.add(gridModel("USER RESEARCH TOOLS"))
        lists!!.add(gridModel("VISUAL DEBUGGING TOOLS"))
        lists!!.add(gridModel("WIREFRAMING TOOLS"))
        adapter = gridAdapter(requireContext(), lists!!, this)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_tools_3d_Fragment)
            }

            1 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_prototypingFragment)
            }

            2 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_screenshotFragment)
            }

            3 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_sketchingFragment)
            }

            4 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_smm_Fragment)
            }

            5 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_soundFragment)
            }

            6 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_stockPhotosFragment)
            }

            7 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_stockVideoFragment)
            }

            8 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_learnDesignFragment)
            }

            9 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_uiFragment)
            }

            10 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_userFlowFragment)
            }

            11 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_userResearchFragment)
            }

            12 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_visualDebuggingFragment)
            }

            13 -> {
                findNavController(requireView()).navigate(R.id.action_nav_moreTools_to_wireframingFragment)
            }
        }
    }

    companion object {
        fun newInstance(): MoreToolsFragment {
            return MoreToolsFragment()
        }
    }
}