package com.example.myapplicationkrsend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        Button b = findViewById(R.id.hello);
        b.setOnClickListener(v ->
                Toast.makeText(this, "Hey! We are using Android Application", Toast.LENGTH_SHORT).show());
    }
}
