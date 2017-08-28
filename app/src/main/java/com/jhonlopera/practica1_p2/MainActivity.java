package com.jhonlopera.practica1_p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton banda1,banda2,banda3;
    private TextView Resistencia,colores;

    //Botones para las banda
    private Button b1b1,b2b1,b3b1,b4b1,b5b1,b6b1,b7b1,b8b1,b9b1,b10b1;
    private Button b1bt,b2bt,b3bt,b4bt;
    private Button calcular;


    // "-1" significa que no se ha elegido ningun valor para esa banda
    private double b1=-1,b2=-1,b3=-1,cresistencia;
    private String b4="0";
    private String b1t,b2t,b3t,b4t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resistencia=(TextView) findViewById(R.id.Resistencia);
        colores=(TextView) findViewById(R.id.colores);
        banda1=(RadioButton) findViewById(R.id.rbanda1);
        banda2=(RadioButton) findViewById(R.id.rbanda2);
        banda3=(RadioButton) findViewById(R.id.rbanda3);

        b1b1=(Button) findViewById(R.id.b1b1);
        b2b1=(Button) findViewById(R.id.b2b1);
        b3b1=(Button) findViewById(R.id.b3b1);
        b4b1=(Button) findViewById(R.id.b4b1);
        b5b1=(Button) findViewById(R.id.b5b1);
        b6b1=(Button) findViewById(R.id.b6b1);
        b7b1=(Button) findViewById(R.id.b7b1);
        b8b1=(Button) findViewById(R.id.b8b1);
        b9b1=(Button) findViewById(R.id.b9b1);
        b10b1=(Button) findViewById(R.id.b10b1);

        b1bt=(Button) findViewById(R.id.b1bt);
        b2bt=(Button) findViewById(R.id.b2bt);
        b3bt=(Button) findViewById(R.id.b3bt);
        b4bt=(Button) findViewById(R.id.b4bt);

        calcular=(Button) findViewById(R.id.bcalcular);

        b1b1.setOnClickListener(this);
        b2b1.setOnClickListener(this);
        b3b1.setOnClickListener(this);
        b4b1.setOnClickListener(this);
        b5b1.setOnClickListener(this);
        b6b1.setOnClickListener(this);
        b7b1.setOnClickListener(this);
        b8b1.setOnClickListener(this);
        b9b1.setOnClickListener(this);
        b10b1.setOnClickListener(this);

        b1bt.setOnClickListener(this);
        b2bt.setOnClickListener(this);
        b3bt.setOnClickListener(this);
        b4bt.setOnClickListener(this);

        calcular.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v==b1b1){

            if (banda1.isChecked()){
                b1=-1;

            }
            if (banda2.isChecked()){
                b2=0;
                b2t="Negro";
            }
            if(banda3.isChecked()){
                b3=1;
                b3t="Negro";
            }
        }
        if(v==b2b1){

            if (banda1.isChecked()){
                b1=1;
                b1t="Marron";
            }
            if (banda2.isChecked()){
                b2=1;
                b2t="Marron";
            }
            if(banda3.isChecked()){
                b3=10;
                b3t="Marron";
            }
        }
        if(v==b3b1){

            if (banda1.isChecked()){
                b1=2;
                b1t="Rojo";
            }
            if (banda2.isChecked()){
                b2=2;
                b2t="Rojo";
            }
            if(banda3.isChecked()){
                b3=100;
                b3t="Rojo";
            }
        }

        if(v==b4b1){

            if (banda1.isChecked()){
                b1=3;
                b1t="Naranja";
            }
            if (banda2.isChecked()){
                b2=3;
                b2t="Naranja";
            }
            if(banda3.isChecked()){
                b3=1000;
                b3t="Naranja";
            }
        }
        if(v==b5b1){

            if (banda1.isChecked()){
                b1=4;
                b1t="Amarillo";
            }
            if (banda2.isChecked()){
                b2=4;
                b2t="Amarillo";
            }
            if(banda3.isChecked()){
                b3=10000;
                b3t="Amarillo";
            }
        }
        if(v==b6b1){

            if (banda1.isChecked()){
                b1=5;
                b1t="Verde";
            }
            if (banda2.isChecked()){
                b2=5;
                b2t="Verde";
            }
            if(banda3.isChecked()){
                b3=100000;
                b3t="Verde";
            }
        }
        if(v==b7b1){

            if (banda1.isChecked()){
                b1=6;
                b1t="Azul";
            }
            if (banda2.isChecked()){
                b2=6;
                b2t="Azul";
            }
            if(banda3.isChecked()){
                b3=1000000;
                b3t="Azul";
            }
        }


        if(v==b8b1){

            if (banda1.isChecked()){
                b1=7;
                b1t="Purpura";
            }
            if (banda2.isChecked()){
                b2=7;
                b2t="Purpura";
            }
            if(banda3.isChecked()){
                b3=0.1;
                b3t="Purpura";
            }
        }
        if(v==b9b1){

            if (banda1.isChecked()){
                b1=8;
                b1t="Gris";
            }
            if (banda2.isChecked()){
                b2=8;
                b2t="Gris";
            }
            if(banda3.isChecked()){
                b3=0.01;
                b3t="Gris";
            }
        }

        if(v==b9b1){

            if (banda1.isChecked()){
                b1=9;
                b1t="Blanco";
            }
            if (banda2.isChecked()){
                b2=9;
                b2t="Blanco";
            }
            if(banda3.isChecked()){
                b3=1;
                b3t="Gris";
            }
        }
        if(v==b1bt){
            b4="1%";
            b4t="Marron";
        }
        if(v==b2bt){
            b4="2%";
            b4t="Rojo";
        }
        if(v==b3bt){
            b4="5%";
            b4t="Dorado";
        }
        if(v==b4bt){
            b4t="Plateado";
            b4="10%";
        }
        if (v==calcular){

            if (b1==-1){
                Resistencia.setText("Elija un color para la primera banda (no puede ser negra)");
            }
            else if (b2==-1){
                Resistencia.setText("Elija un color para la segunda banda");
            }
            else if (b3==-1){
                Resistencia.setText("Elija un color para la tercera banda");
            }
            else if (b4.equals("0")){
                Resistencia.setText("Elija un color para la cuarta banda");
            }
                else {
                cresistencia = ((b1 * 10) + b2) * b3;
                colores.setText(b1t + "|" + b2t + "|" + b3t + "|" + b4t);
                Resistencia.setText(cresistencia + " ohms" + "\n Tolerancia: " + b4);
                }
        }
    }
}
