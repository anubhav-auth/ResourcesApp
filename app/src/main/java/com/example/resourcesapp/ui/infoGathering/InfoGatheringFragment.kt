package com.example.resourcesapp.ui.infoGathering

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.views.grid.gridAdapter
import com.example.resourcesapp.views.grid.gridModel

class InfoGatheringFragment : Fragment() {
    private var mViewModel: InfoGatheringViewModel? = null
    var lists: ArrayList<gridModel>? = null
    var rv: RecyclerView? = null
    var adapter: gridAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info_gathering, container, false)
        rv = view.findViewById(R.id.recyclerView_InfoGathering)
        return view
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(InfoGatheringViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance(): InfoGatheringFragment {
            return InfoGatheringFragment()
        }
    }
}