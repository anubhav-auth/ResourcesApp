package com.example.resourcesapp.views.grid;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.resourcesapp.R;
import java.util.ArrayList;

public class gridAdapter extends RecyclerView.Adapter<gridAdapter.myViewHolder> {

    Context context;
    ArrayList<gridModel> gridModelArrayList;
    Handler hd;
    private OnItemClickListener itemClickListener;


    public gridAdapter(Context context, ArrayList<gridModel> gridModelArrayList, OnItemClickListener itemClickListener) {
        this.context = context;
        this.gridModelArrayList = gridModelArrayList;
        this.itemClickListener = itemClickListener;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.grid_text);
        }
    }
    @NonNull
    @Override
    public gridAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view, parent, false);
        return new gridAdapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull gridAdapter.myViewHolder holder, int position) {
        gridModel model = gridModelArrayList.get(position);
        holder.title.setText(model.getTitle());

        //setting on click listener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        itemClickListener.onItemClick(position);
                    }
                },1);
//
            }
        });
    }

    @Override
    public int getItemCount() {
        return gridModelArrayList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

}
