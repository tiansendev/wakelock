package com.esimtek.weaklock;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2017/7/14 0014.
 */

public class MainActivity extends AppCompatActivity {
//    @Override
//    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        setContentView(R.layout.main);
//        Log.e("TIANSEN", "on activity created!");
//        startService(new Intent(this, WeakUpService.class));
//    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.e("TIANSEN", "on activity created!");
        startService(new Intent(this, WeakUpService.class));
    }
}
