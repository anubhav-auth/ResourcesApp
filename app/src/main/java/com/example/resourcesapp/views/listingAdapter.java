package com.example.resourcesapp.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resourcesapp.R;

import java.util.ArrayList;

public class listingAdapter extends RecyclerView.Adapter<listingAdapter.myViewHolder> {

        Context context;
        ArrayList<listingModel> listData;
        Handler hd;

        int tag;

        public listingAdapter(Context context, ArrayList<listingModel> listData) {
            this.context = context;
            this.listData = listData;
        }



        public static class myViewHolder extends RecyclerView.ViewHolder{

            public TextView title;
            TextView body;

            public myViewHolder(@NonNull View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.list_title);
                body = itemView.findViewById(R.id.list_body);
            }
        }
        @NonNull
        @Override
        public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listing_view, parent, false);

            return new myViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
            listingModel model = listData.get(position);
            holder.title.setText(model.getTitle());
            holder.body.setText(model.getBody());

            //setting on click listener
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = model.getUrl();
                    Toast.makeText(context, "Heading to "+ model.getTitle(), Toast.LENGTH_SHORT).show();
                    Intent i =  new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    hd = new Handler();
                    hd.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            context.startActivity(i);
                        }
                    },1000);

                }
            });
        }

        @Override
        public int getItemCount() {
            return listData.size();
        }


}
