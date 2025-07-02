package com.example.login;

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
        usernameInput = findViewById(R.id.username);
        passwordInput = findViewById(R.id.password);
        loginStatus = findViewById(R.id.loginBtn);

        findViewById(R.id.loginBtn).setOnClickListener(v -> validateLogin());
    }

    private void validateLogin() {
        if (usernameInput.getText().toString().equals(USER) && passwordInput.getText().toString().equals(PASS)) {
            loginStatus.setText("Login Successful");
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show(); // Added Toast for successful login
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
