package com.example.dell.firebaseandroidpoc;

import com.firebase.client.Firebase;

/**
 * Created by Dell on 8/15/2016.
 */
public class ApplicationFBPOC extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
