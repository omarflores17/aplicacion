package com.example.prueba3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class respuesta extends AppCompatActivity {
    TextView txtres;
    Button cont,salir;
    int i;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);
        cont=(Button)findViewById(R.id.btncont);
        salir=(Button)findViewById(R.id.btnsalir);
           Bundle extras = getIntent().getExtras();
           Integer d1 =extras.getInt("res");
           txtres=(TextView) findViewById(R.id.txtres);
           txtres.setText(""+d1);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continuar = new Intent(respuesta.this, flashcard.class);
                continuar.putExtra("i", i);
                startActivity(continuar);
            }
        });
    }

    public void recibirDatos(){

    }
}
