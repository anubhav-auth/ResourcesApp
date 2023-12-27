package com.example.resourcesapp.ui.earn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.views.grid.gridAdapter
import com.example.resourcesapp.views.grid.gridModel

class EarnFragment : Fragment(), gridAdapter.OnItemClickListener {
    var lists: ArrayList<gridModel>? = null
    var rv: RecyclerView? = null
    var adapter: gridAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_earn, container, false)
        rv = view.findViewById(R.id.recyclerView_earn)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*         sample here
       lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(gridModel("Affiliate Marketing"))
        lists!!.add(gridModel("Drop shipping"))
        lists!!.add(gridModel("Earning Ideas"))
        lists!!.add(gridModel("Earning Sites"))
        lists!!.add(gridModel("Mystery Shopping"))
        lists!!.add(gridModel("NFT Generator"))
        lists!!.add(gridModel("Sell T-Shirts Online"))
        lists!!.add(gridModel("Website Testing"))
        lists!!.add(gridModel("Earn From Youtube"))
        adapter = gridAdapter(requireContext(), lists!!, this)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_affiliateMarketingFragment)
            }

            1 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_dropShippingFragment)
            }

            2 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_earningIdeasFragment)
            }

            3 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_earningSitesFragment)
            }

            4 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_mysteryShoppingFragment)
            }

            5 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_NFTGeneratorFragment)
            }

            6 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_sellTshirtFragment)
            }

            7 -> {
                Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show()
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_websiteTestingFragment)
            }

            8 -> {
                findNavController(requireView()).navigate(R.id.action_nav_earn_to_youtubeFragment)
            }
        }
    }

    companion object {
        fun newInstance(): EarnFragment {
            return EarnFragment()
        }
    }
}