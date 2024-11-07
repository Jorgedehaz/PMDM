package com.example.ejercicioseventos4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    RadioGroup rbgroup;
    Button btnaceptar;
    RadioButton rbTexto,rbImagen;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        inicializar_vistas();

        respuesta= findViewById(R.id.respuesta);
        respuesta.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        if (rbTexto.isChecked()) {
            //giramos texto
            respuesta.setVisibility(View.GONE);
            btnaceptar.setVisibility(View.GONE);
            rbgroup.setVisibility(View.GONE);

        }else if (rbImagen.isChecked()){
            //giramos imagen
            respuesta.setVisibility(View.GONE);
            btnaceptar.setVisibility(View.GONE);
            rbgroup.setVisibility(View.GONE);
        }
    }//end listener

    public void girarTexto(View view){

    }

    public void girarImagen(View view){

    }



    private void girar (){
        if(rotacion>=360)
            rotacion=0;
        else
            rotacion+=45;
    }

    private void inicializar_vistas(){
        respuesta=findViewById(R.id.respuesta);
        btnaceptar=findViewById(R.id.btnaceptar);
        rbgroup=findViewById(R.id.rbgroup);
        rbTexto=findViewById(R.id.rbTexto);
        rbImagen=findViewById(R.id.rbImagen);
    }
}