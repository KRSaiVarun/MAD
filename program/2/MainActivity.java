package com.example.myapplication2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button por = findViewById(R.id.por);
        Button lan = findViewById(R.id.lan);

        lan.setOnClickListener(v -> changeOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE, "Hey! We are in Landscape orientation"));
        por.setOnClickListener(v -> changeOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT, "Hey! We are in Portrait orientation"));
    }

    private void changeOrientation(int orientation, String message) {
        setRequestedOrientation(orientation);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
