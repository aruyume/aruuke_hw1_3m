package com.example.aruuke_rakhmanova_hw_1_3m;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText passwordEditText = findViewById(R.id.password);
        Button button = findViewById(R.id.btn);


        button.setOnClickListener(v -> {
            String password = passwordEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("password", password);
            startActivity(intent);
        });
    }
}