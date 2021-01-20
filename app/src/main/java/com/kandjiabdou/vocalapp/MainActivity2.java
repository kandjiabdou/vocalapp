package com.kandjiabdou.vocalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView btVoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btVoc2= findViewById(R.id.btVoc2);
        btVoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changer();
            }
        });

    }

    public void changer(){
        Intent i = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(i);
    }
}