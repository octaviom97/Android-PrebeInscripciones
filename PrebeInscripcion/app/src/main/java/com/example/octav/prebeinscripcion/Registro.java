package com.example.octav.prebeinscripcion;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        final EditText etNombre = (EditText) findViewById(R.id.etNombre);
        final EditText etCarrera = (EditText) findViewById(R.id.etCarrera);
        final EditText etSemestre = (EditText) findViewById(R.id.etSemestre);
        final EditText etContrasenia = (EditText) findViewById(R.id.etContrasenia);
        final Button bRegistrarse = (Button) findViewById(R.id.bRegistrarse);

        bRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nombre = etNombre.getText().toString();
                final String carrera = etCarrera.getText().toString();
                final int semestre = Integer.parseInt(etSemestre.getText().toString());
                final String contrasenia = etContrasenia.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response){
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if(success){
                                Intent intent = new Intent(Registro.this, MainActivity.class);
                                Registro.this.startActivity(intent);
                            } else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(Registro.this);
                                builder.setMessage("Registro Fallido")
                                        .setNegativeButton("Reintentar", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegistroRequest registroRequest = new RegistroRequest(nombre, carrera, semestre, contrasenia, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Registro.this);
                queue.add(registroRequest);
            }
        });



    }
}
