package com.example.myapplicationkrsend;

import androidx.appcompat.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.hello).setOnClickListener(v ->
                Toast.makeText(this, "Hey! We are using Android Application", Toast.LENGTH_SHORT).show());
    }
}
