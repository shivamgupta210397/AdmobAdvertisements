package com.example.shivam.admobadvertisements;

/**
 * Created by Shivam on 10-10-2016.
 */

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

/**
 * Created by Shivam on 09-10-2016.
 */

public class ToastAdListener extends AdListener {

    private Context context;

    public ToastAdListener(Context context) {
        this.context=context;
    }

    @Override
    public void onAdLoaded() {
        super.onAdLoaded();
        Toast.makeText(context,"onAdLoaded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdClosed() {
        super.onAdClosed();
        Toast.makeText(context,"onAdClosed",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLeftApplication() {
        super.onAdLeftApplication();
        Toast.makeText(context,"onAdLeftApplication",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdOpened() {
        super.onAdOpened();
        Toast.makeText(context,"onAdOpened",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdFailedToLoad(int errorCode) {
        super.onAdFailedToLoad(errorCode);
    }
}

