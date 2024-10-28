package com.example.ejercicioseventos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int cont=0;
    TextView respuesta;
    Button btnsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        respuesta = findViewById(R.id.respuesta);
        btnsuma = findViewById(R.id.btnsuma);
        btnsuma.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        cont++;
        respuesta.setText("Botón pulsado " + cont + " veces");
    }
}