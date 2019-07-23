package com.example.prueba3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nivel extends AppCompatActivity {
    Button basico,inter,avan;
    public static int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel);
        basico=(Button) findViewById(R.id.btnbasico);
        inter=(Button) findViewById(R.id.btninter);
        avan=(Button) findViewById(R.id.btnavan);

        basico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=1;
                Intent comenzar = new Intent(nivel.this, flashcard.class);
                startActivity(comenzar);
            }
        });

        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=2;
                Intent comenzar = new Intent(nivel.this, flashcard.class);
                startActivity(comenzar);
            }
        });

        avan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=3;
                Intent comenzar = new Intent(nivel.this, flashcard.class);
                startActivity(comenzar);
            }
        });
    }
}
