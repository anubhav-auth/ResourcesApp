package com.example.resourcesapp.views

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R

class listingAdapter(var context: Context, var listData: ArrayList<listingModel>) :
    RecyclerView.Adapter<listingAdapter.myViewHolder>() {
    var hd: Handler? = null
    var tag = 0

    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var body: TextView

        init {
            title = itemView.findViewById(R.id.list_title)
            body = itemView.findViewById(R.id.list_body)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listing_view, parent, false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val model = listData[position]
        holder.title.text = model.title
        holder.body.text = model.body

        //setting on click listener
        holder.itemView.setOnClickListener {
            val url = model.url
            Toast.makeText(context, "Heading to " + model.title, Toast.LENGTH_SHORT).show()
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            hd = Handler()
            hd!!.postDelayed({ context.startActivity(i) }, 1000)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}