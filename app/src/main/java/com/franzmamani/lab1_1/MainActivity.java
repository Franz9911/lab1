package com.franzmamani.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button CrearCuenta, Acceder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrearCuenta = (Button) findViewById(R.id.btnCrearCuenta);
        Acceder=(Button) findViewById(R.id.btnAcceder);
        CrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ICrearCuenta=new Intent(MainActivity.this,CrearCuenta.class);
                startActivity(ICrearCuenta);
            }
        });
        Acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IAcceder=new Intent(MainActivity.this,Perfil.class);
                startActivity(IAcceder);
            }
        });
    }
}