
package com.example.myapplication11;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView;
    private Button startButton, stopButton;
    private Handler handler = new Handler();
    private int count = 1;
    private boolean isCounting = false;

    private Runnable counterRunnable = new Runnable() {
        @Override
        public void run() {
            if (isCounting) {
                counterTextView.setText(String.valueOf(count));
                count++;
                handler.postDelayed(this, 1000); // Update every 1 second
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counterTextView);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isCounting) {
                    isCounting = true;
                    count = 1; // Reset counter
                    handler.post(counterRunnable);
                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCounting = false;
                handler.removeCallbacks(counterRunnable);
            }
        });
    }
}
