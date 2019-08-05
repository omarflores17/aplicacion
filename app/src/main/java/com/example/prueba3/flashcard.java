package com.example.prueba3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class flashcard extends AppCompatActivity {
    Button  respuesta;
    TextView txt1, txt2,txt4;
    Random r;
    int outpot1, outpot2, res,i=MainActivity.cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);
        respuesta=(Button)findViewById(R.id.btn2);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt4=(TextView)findViewById(R.id.txt4);
        r= new Random();
        txt4.setText("Ronda "+ i);

            if(nivel.n==1)
                {
                    outpot1=r.nextInt((99-1)+1)+1;
                    outpot2=r.nextInt((99-1)+1)+1;
                    do {
                        if (outpot2 > outpot1) {
                            outpot2 = r.nextInt((99 - 1) + 1) + 1;
                        }
                    }while(outpot2>outpot1);
                }

                else if(nivel.n==2)
                {
                    outpot1=r.nextInt((999-100)+100)+100;
                    outpot2=r.nextInt((999-100)+100)+100;
                    do {
                        if (outpot2 > outpot1) {
                            outpot2 = r.nextInt((999 - 100) + 100) + 100;
                        }
                    }while(outpot2>outpot1);
                }

                else if(nivel.n==3)
                {
                    outpot1=r.nextInt((9999-1000)+1000)+1000;
                    outpot2=r.nextInt((9999-1000)+1000)+1000;
                    do {
                        if (outpot2 > outpot1) {
                            outpot2 = r.nextInt((9999 - 1000) + 1000) + 1000;
                        }
                    }while(outpot2>outpot1);
                }

                txt1.setText(""+ outpot1);
                txt2.setText(""+ outpot2);

        respuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2;
                n1=Integer.parseInt(txt1.getText().toString());
                n2=Integer.parseInt(txt2.getText().toString());
                if(respuesta.isClickable()==true) {
                    MainActivity.cont++;
                }
                res=n1-n2;


                Intent verRespuesta = new Intent(flashcard.this, respuesta.class);
                verRespuesta.putExtra("res", res);
                startActivity(verRespuesta);

            }
        });



    }
}
