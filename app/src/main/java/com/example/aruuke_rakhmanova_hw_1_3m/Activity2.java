package com.example.aruuke_rakhmanova_hw_1_3m;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView passwordTV = findViewById(R.id.tv_password);
        String password = getIntent().getStringExtra("password");
        passwordTV.setText(password);
        Toast.makeText(this, "Вы успешно создали пароль", Toast.LENGTH_LONG).show();
        }
    }