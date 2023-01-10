package com.example.tabledemultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number ;
    Button btn_reinitialiser , btn_quitter , btn_afficher;
    TextView table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiliser);
        btn_quitter = findViewById(R.id.btn_quitter);
        btn_afficher = findViewById(R.id.btn_afficher);
        table = findViewById(R.id.table);
        
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
        
        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nbr;
                int res;
                if (!number.getText().toString().isEmpty()){
                    nbr = Integer.parseInt(number.getText().toString());
                    table.setText("");
                    for (int i = 0; i < table.getMaxLines(); i++) {
                        res = nbr * i;
                        table.append(String.format("%d * %d = %d%n",nbr,i,res));
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Veuiller saisir un entier !!!", Toast.LENGTH_LONG).show();
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            }
        });
    }
}