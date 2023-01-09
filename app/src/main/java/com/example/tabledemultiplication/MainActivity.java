package com.example.tabledemultiplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button btn_reinitialiser, btn_quitter, btn_white, btn_pink, btn_lavender;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiliser);
        btn_quitter = findViewById(R.id.btn_quitter);
        btn_white = findViewById(R.id.btn_white);
        btn_pink = findViewById(R.id.btn_pink);
        btn_lavender = findViewById(R.id.btn_lavender);
        constraintLayout = findViewById(R.id.constraintLayout);


        btn_reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout.setBackgroundResource(R.color.white);
            }
        });

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout.setBackgroundResource(R.color.Pink);
            }
        });

        btn_lavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout.setBackgroundResource(R.color.Lavender);
            }
        });
    }
}