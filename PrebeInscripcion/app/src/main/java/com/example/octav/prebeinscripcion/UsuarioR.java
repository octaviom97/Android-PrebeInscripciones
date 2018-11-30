package com.example.octav.prebeinscripcion;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UsuarioR extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_r);

        Bundle datos=getIntent().getExtras();

        TextView tv0 =(TextView) findViewById(R.id.etNombre);
        tv0.setText("Lista de materias registradas");

        String aa1=datos.getString("clave1");
        String ab1=datos.getString("credito1");
        String ac1=datos.getString("asignatura1");
        String ad1=datos.getString("hora1");

        TextView tva1 =(TextView) findViewById(R.id.tvCl1);
        tva1.setText(aa1);
        TextView tvb1 =(TextView) findViewById(R.id.tvCr1);
        tvb1.setText(ab1);
        TextView tvc1 =(TextView) findViewById(R.id.tvAsignatura1);
        tvc1.setText(ac1);
        TextView tvd1 =(TextView) findViewById(R.id.tvDisp1);
        tvd1.setText(ad1);


        String aa2=datos.getString("clave2");
        String ab2=datos.getString("credito2");
        String ac2=datos.getString("asignatura2");
        String ad2=datos.getString("hora2");

        TextView tva2 =(TextView) findViewById(R.id.tvCl2);
        tva2.setText(aa2);
        TextView tvb2 =(TextView) findViewById(R.id.tvCr2);
        tvb2.setText(ab2);
        TextView tvc2 =(TextView) findViewById(R.id.tvAsignatura2);
        tvc2.setText(ac2);
        TextView tvd2 =(TextView) findViewById(R.id.tvDisp2);
        tvd2.setText(ad2);
    }
}
