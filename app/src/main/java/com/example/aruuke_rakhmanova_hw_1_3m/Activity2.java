package com.example.aruuke_rakhmanova_hw_1_3m;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView passwordTV = findViewById(R.id.passwordTV);
        String password = getIntent().getStringExtra("password");
        passwordTV.setText(password);
        Toast.makeText(this, "Вы успешно создали пароль", Toast.LENGTH_LONG).show();
        }
    }