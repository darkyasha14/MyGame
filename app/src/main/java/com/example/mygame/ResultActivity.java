package com.example.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView imgGame = findViewById(R.id.img);
        TextView textTitle = findViewById(R.id.txttl);
        TextView txtdev = findViewById(R.id.txtdevelope);
        TextView txtdesc = findViewById(R.id.txtdesc);
        TextView txtrating = findViewById(R.id.txtrating);

        Intent intent = getIntent();
        imgGame.setImageResource(intent.getIntExtra("IMAGE",0));
        textTitle.setText(intent.getStringExtra("TITLE"));
        txtdev.setText(intent.getStringExtra("DEVELOPER"));
        txtdesc.setText(intent.getStringExtra("DESC"));
        txtrating.setText(intent.getStringExtra("RATING"));



    }

    public void downloadbtn(View view) {
        Toast.makeText(getApplicationContext(),"this game cant download",Toast.LENGTH_SHORT).show();
    }
}
