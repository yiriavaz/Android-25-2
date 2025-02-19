package com.example.calculadora1902;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnReinicio;
    TextView txvMitexto;

    String cadena = "";

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Log.println(Log.INFO, null, )

        txvMitexto = findViewById(R.id.txv_main);

        //dos lineas copio y pego en
        cadena += "\n | onCreate(savedInstanceState)";
        txvMitexto.setText(cadena);
        btnReinicio = findViewById(R.id.btn_reinicio);



        btnReinicio.setOnClickListener(this);
    }
/*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        cadena += "\n | onCreate(savedInstanceState, persistentState)";
        txvMitexto.setText(cadena);


    }

    @Override
    protected void onStart() {
        super.onStart();
        cadena += "\n | onStart()";
        txvMitexto.setText(cadena);
    }

    @Override
    protected void onResume() {
        super.onResume();
        cadena += "\n | onResume()";
        txvMitexto.setText(cadena);
    }

    @Override
    protected void onPause() {
        super.onPause();
        cadena += "\n | onPause()";
        txvMitexto.setText(cadena);
    }

    @Override
    protected void onStop() {
        super.onStop();
        cadena += "\n | onStop()";
        txvMitexto.setText(cadena);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cadena += "\n | onDestry()";
        txvMitexto.setText(cadena);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        cadena += "\n | onRestart()";
        txvMitexto.setText(cadena);
    } */
    /*
    @Override
    public void onClick(View v) {
        cadena = "Reinicio";
        txvMitexto.setText(cadena);
    }

     */

    @Override
    public void onClick(View v) {

    }
}