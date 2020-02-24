package com.example.mygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class CReslutActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter myadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creslut);
        recyclerView=findViewById(R.id.imgscr);

        ArrayList<Model> itemImg = new ArrayList<>();
        itemImg.add(new Model(R.drawable.h1));
        itemImg.add(new Model(R.drawable.h2));
        itemImg.add(new Model(R.drawable.h3));


        myadapter = new MyAdapter(itemImg);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, itemImg.size());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myadapter);
    }

    public void downloadbtn(View view) {
        Toast.makeText(getApplicationContext(),"this game cant download",Toast.LENGTH_SHORT).show();
    }
}
