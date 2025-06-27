package com.example.myapplicationkrsend;

import android.content.Intent; import android.net.Uri; import android.os.Bundle;
import android.widget.Button; import android.widget.EditText; import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText email, subject, message; Button send;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        email = findViewById(R.id.editTextEmail); subject = findViewById(R.id.editTextSubject);
        message = findViewById(R.id.editTextMessage); send = findViewById(R.id.buttonSend);

        send.setOnClickListener(v -> {
            String e = email.getText().toString(); String s = subject.getText().toString();
            String m = message.getText().toString();
            if (e.isEmpty()) { Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show(); return; }
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + e));
            intent.putExtra(Intent.EXTRA_SUBJECT, s); intent.putExtra(Intent.EXTRA_TEXT, m);
            startActivity(Intent.createChooser(intent, "Choose Email App"));
        });
    }
}
