package com.example.android.sunshine.app;

import android.app.Application;

import com.oda.sdk.ODATracker;

/**
 * Created by Rajesh on 09/07/15.
 */
public class SunshineApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ODATracker.start(this, "SUNSHINE");
    }
}