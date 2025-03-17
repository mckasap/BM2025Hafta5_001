package com.example.bm2025hafta5_001;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

            String ts = intent.getStringExtra("TS");
            Toast.makeText(context, ts, Toast.LENGTH_SHORT).show();

    }
}
