package com.example.ejercicioseventos2;

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

    int cont=0;
    TextView respuesta;
    Button btnpulsame;
    Button btnfinalizar;
    Button btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        respuesta= findViewById(R.id.respuesta);
        btnpulsame=findViewById(R.id.btnpulsame);
        btnfinalizar=findViewById(R.id.btnfinalizar);
        btnreset=findViewById(R.id.btnreset);
        btnpulsame.setOnClickListener(this::onClick);
        btnfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText("Botón pulsado " + cont + " veces");
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont=0;
                respuesta.setText("Contador reseteado");
            }
        });
    }

    @Override
    public void onClick(View view) {
        cont++;
    }
}