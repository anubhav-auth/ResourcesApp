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

class CodingGamesFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_coding_games, container, false)
        rv = view.findViewById(R.id.recyclerView_codinggames)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(
            listingModel(
                "Z Type", """
     Transform any website
     into a typing game.
     """.trimIndent(), "https://zty.pe/?load/"
            )
        )
        lists!!.add(
            listingModel(
                "CodinGame",
                "Learn new concepts by solving fun challenges in 25+ languages addressing all the hot programming topics.",
                "https://www.codingame.com/start"
            )
        )
        lists!!.add(
            listingModel(
                "CodeCombat",
                "CodeCombat is a multiplayer programming game for learning how to code.",
                "https://codecombat.com/"
            )
        )
        lists!!.add(
            listingModel(
                "CodeWars",
                "Improve your development skills by training with your peers on code kata that continuously challenge and push your coding practice.",
                "https://www.codewars.com/"
            )
        )
        lists!!.add(
            listingModel(
                "RoboCode",
                "Robocode is a programming game, where the goal is to develop a robot battle tank to battle against other tanks in Java. The robot battles are running in real-time and on-screen.",
                "https://robocode.sourceforge.io/"
            )
        )
        lists!!.add(
            listingModel(
                "CSS-Diner",
                "It's a fun game to learn and practice CSS selectors.",
                "https://flukeout.github.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Flexbox Froggy",
                "A game where you help Froggy and friends by writing CSS code!",
                "https://flexboxfroggy.com/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): CodingGamesFragment {
            return CodingGamesFragment()
        }
    }
}