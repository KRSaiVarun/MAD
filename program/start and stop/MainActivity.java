package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView counterText;
    private Handler handler = new Handler();
    private int counter = 0;
    private boolean isCounting = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.counterText);
        findViewById(R.id.startButton).setOnClickListener(v -> startCounting());
        findViewById(R.id.stopButton).setOnClickListener(v -> isCounting = false);
    }

    private void startCounting() {
        isCounting = true;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isCounting) {
                    counterText.setText("Counter: " + ++counter);
                    handler.postDelayed(this, 1000);
                }
            }
        }, 1000);
    }
}
