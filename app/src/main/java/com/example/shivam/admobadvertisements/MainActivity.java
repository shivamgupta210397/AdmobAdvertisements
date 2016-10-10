package com.example.shivam.admobadvertisements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bannerButton=(Button)findViewById(R.id.bannerAdButton);
        bannerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),BannerActivity.class);
                startActivity(intent);
            }
        });

        Button interstitialButton=(Button)findViewById(R.id.interstitialAdButton);
        interstitialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),InterstitialActivity.class);
                startActivity(intent);
            }
        });
    }
}
