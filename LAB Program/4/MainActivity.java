package com.example.loginapp;

import android.os.*;
import android.widget.*;
import androidx.appcompat.app.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);
        Button login = findViewById(R.id.loginBtn);

        login.setOnClickListener(v -> {
            String u = user.getText().toString();
            String p = pass.getText().toString();
            Toast.makeText(this, ":User  " + u + ", Pass: " + p, Toast.LENGTH_SHORT).show();
        });
    }
}
