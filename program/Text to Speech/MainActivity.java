package com.example.myapplication13;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText inputText; 
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.inputText);
        textToSpeech = new TextToSpeech(this, status -> {
            if (status != TextToSpeech.ERROR) textToSpeech.setLanguage(Locale.US);
        });

        findViewById(R.id.speakButton).setOnClickListener(v -> {
            String text = inputText.getText().toString();
            if (!text.isEmpty()) textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
            else Toast.makeText(this, "Please enter text to speak", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    protected void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }
}

