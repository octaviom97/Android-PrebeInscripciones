package com.example.octav.prebeinscripcion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegistroRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://sushimilco.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegistroRequest(String nombre, String carrera, int semestre, String contrasenia, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("nombre", nombre);
        params.put("carrera", carrera);
        params.put("semestre", semestre + "");
        params.put("contrasenia", contrasenia);
    }
     @Override
    public Map<String, String> getParams() {
        return params;
     }



}
