package com.t3h.myprojectnoteupdate.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class RingtoneActivity extends AppCompatActivity {
    private final String TAG = "RingtoneActivity";
//    @Override
//    protected void initAct() {
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        Intent intent = getIntent();
//        String actionbartitle = intent.getStringExtra("actionBarTitle");
//        String contentx = intent.getStringExtra("contentitem");
//        actionBar.setTitle(actionbartitle);
//        biding.textView.setText(contentx);
//    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }
//
//    @Override
//    protected int getLayoutId() {
//        return R.layout.activity_test;
//    }
}
