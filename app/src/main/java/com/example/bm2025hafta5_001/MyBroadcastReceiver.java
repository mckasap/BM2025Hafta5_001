package com.example.bm2025hafta5_001;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
        if (isAirplaneModeOn) {
            Toast.makeText(context, "Airplane Mode is On", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane Mode is Off", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(context, "Broadcast Received", Toast.LENGTH_SHORT).show();
    }


}
