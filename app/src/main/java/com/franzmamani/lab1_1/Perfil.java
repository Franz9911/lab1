package com.franzmamani.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perfil extends AppCompatActivity {
Button TxtVoz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        TxtVoz=(Button) findViewById(R.id.btnTextoVoz);
        TxtVoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ITxtVoz=new Intent(Perfil.this, TextoVoz.class);
                startActivity(ITxtVoz);
            }
        });
    }
}