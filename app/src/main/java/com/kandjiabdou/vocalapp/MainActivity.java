package com.kandjiabdou.vocalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends Activity {
    private ImageView btVoc1;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
        
        btVoc1= findViewById(R.id.btVoc1);
        btVoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changer();
            }
        });
        

    }

    public void changer(){
        if(interstitialAd.isLoaded()){
            interstitialAd.show();
        }else {
            interstitialAd.loadAd(new AdRequest.Builder().build());
            Intent i = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
        }
    }
}