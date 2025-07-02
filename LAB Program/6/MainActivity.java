package com.example.email;

import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.editTextEmail);
        Button send = findViewById(R.id.buttonSend);
        send.setOnClickListener(v -> {
            String e = email.getText().toString();
            if (e.isEmpty()) {
                Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();
                return;
            }
            startActivity(Intent.createChooser(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + e))
                    .putExtra(Intent.EXTRA_SUBJECT, ((EditText) findViewById(R.id.editTextSubject)).getText().toString())
                    .putExtra(Intent.EXTRA_TEXT, ((EditText) findViewById(R.id.editTextMessage)).getText().toString()), "Choose Email App"));
        });
    }
}
