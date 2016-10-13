package com.example.shivam.admobadvertisements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialActivity extends AppCompatActivity {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        final Button loadButton=(Button)findViewById(R.id.loadInterstitialButton);
        final Button showButton=(Button)findViewById(R.id.interstitialNotReadyButton);
        showButton.setEnabled(false);

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButton.setText("Loading Interstitial");
                showButton.setEnabled(false);

                interstitialAd=new InterstitialAd(getBaseContext());
                interstitialAd.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));
                interstitialAd.setAdListener(new ToastAdListener(getBaseContext()){
                    @Override
                    public void onAdLoaded() {
                        //As soon as our ad gets loaded this method gets called
                        super.onAdLoaded();
                        showButton.setText("Show Interstitial");
                        showButton.setEnabled(true);
                    }
                });
                AdRequest adRequest=new AdRequest.Builder().build();
                interstitialAd.loadAd(adRequest);
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd.isLoaded()){
                    interstitialAd.show();
                }
                showButton.setText("Interstitial Not Ready");
                showButton.setEnabled(false);
            }
        });
    }
}
