package com.example.bm2025hafta5_001;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class myService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(), "SERVİCE KAPATILYOR", Toast.LENGTH_SHORT).show();
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "SERVİCE KAPATILDI", Toast.LENGTH_SHORT).show();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), "SERVİCE BAŞLATILDI", Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
