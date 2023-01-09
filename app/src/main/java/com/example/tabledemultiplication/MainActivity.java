package com.example.tabledemultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number ;
    Button btn_reinitialiser , btn_quitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiliser);
        btn_quitter = findViewById(R.id.btn_quitter);

        btn_reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                number.setText("");
                number.getText().clear();
            }
        });

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}