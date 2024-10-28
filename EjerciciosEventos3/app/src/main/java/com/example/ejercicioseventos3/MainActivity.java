package com.example.ejercicioseventos3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int rotacion=0;
    TextView respuesta;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        respuesta= findViewById(R.id.respuesta);
        respuesta.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        rotacion+=45;
        respuesta.setRotation(rotacion);
        respuesta.setText("HOOOOOLAAAAAAA!!!!");

    }
}