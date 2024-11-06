package com.example.aruuke_rakhmanova_hw_1_3m;

import static com.example.aruuke_rakhmanova_hw_1_3m.R.id.btn_send;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText passwordEditText = findViewById(R.id.et_enterPassword);
        Button button = findViewById(btn_send);

        button.setOnClickListener(v -> {
            String password = passwordEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("password", password);
            startActivity(intent);
        });
    }
}