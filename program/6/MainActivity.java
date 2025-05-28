package com.example.all_views;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(v -> showMessage("User  Information", "Successfully completed"));

        String[] countries = {"India", "Pakistan", "China", "America", "England"};
        Spinner countrySpinner = findViewById(R.id.country);
        countrySpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countries));
    }

    private void showMessage(String title, String message) {
        new AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
            .show();
    }
}
