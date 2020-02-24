package com.example.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<ModelList> listitem = new ArrayList<>();
        listitem.addAll(DataList.getData());


        recyclerView = findViewById(R.id.list);
        adapter = new Adapter(listitem);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void back(View view) {
        Intent intent = new Intent(ListActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
