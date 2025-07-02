package com.example.myapplication4;

import android.content.*;
import android.net.*;
import android.os.*;
import androidx.appcompat.app.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onImplicitButtonClicked(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
    }

    public void onExplicitButtonClicked(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
