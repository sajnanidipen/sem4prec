package com.example.hp.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by HP on 3/7/2018.
 */

public class MainActivity2 extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent i, int id) {
        Toast.makeText(MainActivity2.this, "Starting services....", Toast.LENGTH_LONG).show();
    }

    public void onDestroy(){
        Toast.makeText(MainActivity2.this, "THE SERVICE HAS BEEN STOPPED", Toast.LENGTH_LONG).show();
    }
}

