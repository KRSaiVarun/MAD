package com.example.myapplication2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button por = findViewById(R.id.por);
        Button lan = findViewById(R.id.lan);

        lan.setOnClickListener(v -> {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            Toast.makeText(this, "Hey! We are in Landscape orientation", Toast.LENGTH_SHORT).show();
        });

        por.setOnClickListener(v -> {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            Toast.makeText(this, "Hey! We are in Portrait orientation", Toast.LENGTH_SHORT).show();
        });
    }
}
