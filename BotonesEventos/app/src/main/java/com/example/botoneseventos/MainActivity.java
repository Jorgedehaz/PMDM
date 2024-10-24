package com.example.botoneseventos;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView respuesta;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        respuesta=findViewById(R.id.respuesta);
    }

    public void onClickBtnSi(View view) {
        respuesta.setText("Has pulsado SI");
    }

    public void onClickBtnNo(View view) {
        respuesta.setText("Has pulsado NO");
    }

    public void onClickBtnAveces(View view) {
        respuesta.setText("Has pulsado A VECES");
    }
}