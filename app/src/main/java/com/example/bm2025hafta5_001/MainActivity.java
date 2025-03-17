package com.example.bm2025hafta5_001;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiver br= new MyBroadcastReceiver();
    CustomBroadcastReceiver cbr= new CustomBroadcastReceiver();

    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");

        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("com.example.bm2025hafta5_001.CUSTOM_BROADCAST");

        registerReceiver(br, intentFilter);
        registerReceiver(cbr, intentFilter1);
    }


    public void Gonder(View view) {
        Intent intent = new Intent("com.example.bm2025hafta5_001.CUSTOM_BROADCAST");
        intent.putExtra("TS", "Bize Her yer Trabzon");

        sendBroadcast(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}