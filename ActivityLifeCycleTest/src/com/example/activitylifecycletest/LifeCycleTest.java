package com.example.activitylifecycletest;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class LifeCycleTest extends Activity {
    private static final String TAG="hoge";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_life_cycle_test, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.e(TAG,"onPause()");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG,"onRestart()");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG,"onResume()");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.w(TAG,"onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.e(TAG,"onStop()");
        super.onStop();
    }
}
