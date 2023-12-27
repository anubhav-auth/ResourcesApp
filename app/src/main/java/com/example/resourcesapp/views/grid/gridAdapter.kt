package com.example.resourcesapp.views.grid

import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R

class gridAdapter(
    var context: Context,
    var gridModelArrayList: ArrayList<gridModel>,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<gridAdapter.myViewHolder>() {
    var hd: Handler? = null

    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView

        init {
            title = itemView.findViewById(R.id.grid_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_view, parent, false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val model = gridModelArrayList[position]
        holder.title.text = model.title

        //setting on click listener
        holder.itemView.setOnClickListener {
            hd = Handler()
            hd!!.postDelayed({ itemClickListener.onItemClick(position) }, 1)
            //
        }
    }

    override fun getItemCount(): Int {
        return gridModelArrayList.size
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}