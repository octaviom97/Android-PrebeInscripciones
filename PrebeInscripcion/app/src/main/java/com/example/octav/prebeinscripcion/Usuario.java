package com.example.octav.prebeinscripcion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        final EditText etNombre = (EditText) findViewById(R.id.etNombre);
        final TextView tvBienvenido = (TextView) findViewById(R.id.tvBienvenido);

        Intent intent = getIntent();
        String nombre = ((Intent) intent).getStringExtra("nombre");

        String message = nombre + "Bienvenido a tu perfil";
        tvBienvenido.setText(message);
        etNombre.setText(nombre);

    }
}
