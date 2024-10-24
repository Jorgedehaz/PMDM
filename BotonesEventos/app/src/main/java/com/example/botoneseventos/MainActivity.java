package com.example.botoneseventos;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
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

    public void onClickBtn(View view) {
        switch(view.getId()) {
            case (R.id.btnsi):
                respuesta.setText("Has pulsado SI");
                break;
            case (R.id.btnno):
                respuesta.setText("Has pulsado NO");
                break;
            case (R.id.btnaveces):
                respuesta.setText("Has pulsado A VECES");
                break;
        }
    }




//    public void onClickBtn(View view) {
//        if (view.getId() == R.id.btnsi){
//            respuesta.setText("Has pulsado SI");
//        }
//        else if (view.getId() == R.id.btnno){
//            respuesta.setText("Has pulsado NO");
//        }else
//            respuesta.setText("Has pulsado A VECES");
//    }

//    public void onClickBtnSi(View view) {
//        respuesta.setText("Has pulsado SI");
//    }
//
//    public void onClickBtnNo(View view) {
//        respuesta.setText("Has pulsado NO");
//    }
//
//    public void onClickBtnAveces(View view) {
//        respuesta.setText("Has pulsado A VECES");
//    }
}