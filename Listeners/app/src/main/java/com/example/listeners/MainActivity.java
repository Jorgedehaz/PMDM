package com.example.listeners;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView respuesta;
    Button btnclaseinterna;
    Button btnclaseanonima;
    Button btn3en1;
    Button btnimplements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        respuesta = findViewById(R.id.respuesta);
        btnclaseinterna = findViewById(R.id.btnclaseinterna);
        btnclaseanonima = findViewById(R.id.btnclaseanonima);
        btn3en1=findViewById(R.id.btn3en1);
        btnimplements=findViewById(R.id.btnimplements);
        //crear objeto de la clase auxiliar
        Auxiliar escuchador1 = new Auxiliar();
        //METODO 1
        //asociar el listener a la vista correspondiente
        btnclaseinterna.setOnClickListener(escuchador1);
        //METODO 2
        //asociar listener 2 (clase anónima) a la vista correspondiente
        btnclaseanonima.setOnClickListener(escuchador2);
        //METODO 3
        //se crea el escuchador en la propia declaración del setOnClickListener
        btn3en1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText("Botón 3en1 pulsado");
            }
        });
        //METODO 4
        btnimplements.setOnClickListener(this::onClick);

    }//end create

    //METODO 1
    //crear clase interna auxiliar para implementar el listener
    private class Auxiliar implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            //gestionar la pulsación del boton1
            respuesta.setText("Botón clase interna pulsado");
        }
    }//end clase auxiliar

    //METODO 2
    //onjeto escuchador mediante una CLASE ANONIMA
    private View.OnClickListener escuchador2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            respuesta.setText("Botón clase anónima pulsado");
        }
    };

    //METODO 4
    @Override
    public void onClick(View view) {
        respuesta.setText("Botón implements pulsado");
    }

}//end main