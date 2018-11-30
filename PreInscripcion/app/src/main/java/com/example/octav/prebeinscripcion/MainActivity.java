package com.example.octav.prebeinscripcion;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final EditText etNombre = (EditText) findViewById(R.id.etNombre);
        final EditText etContrasenia = (EditText) findViewById(R.id.etContrasenia);*/
        //final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView tvRegistroLink = (TextView) findViewById(R.id.tvRegistroLink);

        tvRegistroLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registroIntent = new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(registroIntent);
            }
        });

       /* bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nombre=(EditText) findViewById(R.id.etNombre);
                String s1= nombre.getText().toString();

                Intent i = new Intent(MainActivity.this, Usuario.class);
                i.putExtra("text1", s1);
                MainActivity.this.startActivity(i);
            }
        });*/

        /*bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nombre = etNombre.getText().toString();
                final String contrasenia = etContrasenia.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success){
                                String nombre = jsonResponse.getString("nombre");
                               // String carrera = jsonResponse.getString("carrera");
                               // int semestre = jsonResponse.getInt("semestre");

                                Intent intent = new Intent(MainActivity.this, Usuario.class);
                                intent.putExtra("nombre", nombre);
                                //intent.putExtra("carrera", carrera);
                               // intent.putExtra("semestre", semestre);

                                MainActivity.this.startActivity(intent);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setMessage("Inicio de sesión Fallido")
                                        .setNegativeButton("Reintentar", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(nombre, contrasenia, responseListener);
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                queue.add(loginRequest);
            }
        });*/
    }

  public void Login(View view){
      EditText nom=(EditText) findViewById(R.id.etNombre);
      EditText carr=(EditText) findViewById(R.id.etCarrera);
      EditText contrasenia=(EditText) findViewById(R.id.etContrasenia);

      String s1=nom.getText().toString();
      String s2=carr.getText().toString();

      Intent i=new Intent(this, Usuario.class);

      i.putExtra("texto1",s1);
      i.putExtra("carrera1",s2);

      startActivity(i);
  }
}
