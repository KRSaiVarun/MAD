package com.example.loginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*; 
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText usernameInput, passwordInput;
    private TextView loginStatus;
    private static final String USER = "user", PASS = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginStatus = findViewById(R.id.loginStatus);
        
        findViewById(R.id.loginButton).setOnClickListener(v -> validateLogin());
    }

    private void validateLogin() {
        if (usernameInput.getText().toString().equals(USER) && passwordInput.getText().toString().equals(PASS)) {
            loginStatus.setText("Login Successful");
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
