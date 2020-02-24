package com.example.mygame;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    private ArrayList<ModelList>listitem;

    public Adapter(ArrayList<ModelList> listitem) {
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item,viewGroup,false);
        viewHolder viewHolder = new viewHolder(view);
        return new viewHolder(view) ;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder viewHolder, final int i) {
        viewHolder.imgview.setImageResource(listitem.get(i).getImg());
        viewHolder.txtjudul.setText(listitem.get(i).getTitle());
        viewHolder.txtrating.setText(listitem.get(i).getRating());
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ResultActivity.class);
                intent.putExtra("IMAGE",listitem.get(i).getImg());
                intent.putExtra("RATING",listitem.get(i).getRating());
                intent.putExtra("TITLE",listitem.get(i).getTitle());
                intent.putExtra("DEVELOPER",listitem.get(i).getDev());
                intent.putExtra("DESC",listitem.get(i).getDesc());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public ImageView imgview;
        public TextView txtjudul;
        public TextView txtrating;
        public CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgview=itemView.findViewById(R.id.img);
            txtjudul=itemView.findViewById(R.id.txttl);
            txtrating=itemView.findViewById(R.id.txtrating);
            cardView=itemView.findViewById((R.id.cdr));
        }
    }
}
