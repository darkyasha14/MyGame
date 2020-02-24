package com.example.mygame;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FlipperLayout flipperLayout=findViewById(R.id.flipper);

        int img[]={R.drawable.honkai,R.drawable.kagura,R.drawable.ragnarok};

        for (int i=0; i<img.length;i++){
            FlipperView flipperView = new FlipperView(getBaseContext());
            flipperView.setImageDrawable(img[i]);
            flipperLayout.addFlipperView(flipperView);
            flipperLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        ArrayList<ModelList> listitem = new ArrayList<>();
        listitem.addAll(DataList.getData2());


        recyclerView = findViewById(R.id.list);
        adapter = new Adapter(listitem);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, listitem.size());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void profil(View view) {
        Intent intentp = new Intent(MainActivity.this,ProfilActivity.class);
        startActivity(intentp);
    }

    public void moregame(View view) {
        Intent intent = new Intent(MainActivity.this,ListActivity.class);
        startActivity(intent);
    }

    public void callChoice(View view) {
        Intent intent = new Intent(MainActivity.this,CReslutActivity.class);
        startActivity(intent);
    }
}
