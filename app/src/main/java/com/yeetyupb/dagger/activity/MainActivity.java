package com.yeetyupb.dagger.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.yeetyupb.dagger.R;
import com.yeetyupb.dagger.dagger.Injector;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SharedPreferences mSharedPreferences;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Injector.getAppComponent().inject(this);
        String c = mSharedPreferences.getString("dddd", "default");
        Log.d(TAG, "" + c);


    }
}
