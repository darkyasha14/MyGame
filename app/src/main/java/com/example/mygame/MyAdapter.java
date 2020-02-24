package com.example.mygame;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {
    private ArrayList<Model> itemImg;

    public MyAdapter(ArrayList<Model> itemImg) {
        this.itemImg = itemImg;
    }

    @NonNull
    @Override
    public MyAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_c,viewGroup,false);
        viewHolder viewHolder = new viewHolder(view);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.viewHolder viewHolder, int i) {
        viewHolder.imageView.setImageResource(itemImg.get(i).getImgpreview());

    }

    @Override
    public int getItemCount() {
        return itemImg.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imgpreview);
        }
    }
}
