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

        String aa3=datos.getString("clave3");
        String ab3=datos.getString("credito3");
        String ac3=datos.getString("asignatura3");
        String ad3=datos.getString("hora3");

        TextView tva3 =(TextView) findViewById(R.id.tvCl3);
        tva3.setText(aa3);
        TextView tvb3 =(TextView) findViewById(R.id.tvCr3);
        tvb3.setText(ab3);
        TextView tvc3 =(TextView) findViewById(R.id.tvAsignatura3);
        tvc3.setText(ac3);
        TextView tvd3 =(TextView) findViewById(R.id.tvDisp3);
        tvd3.setText(ad3);



        String aa4=datos.getString("clave4");
        String ab4=datos.getString("credito4");
        String ac4=datos.getString("asignatura4");
        String ad4=datos.getString("hora4");

        TextView tva4 =(TextView) findViewById(R.id.tvCl4);
        tva4.setText(aa4);
        TextView tvb4 =(TextView) findViewById(R.id.tvCr4);
        tvb4.setText(ab4);
        TextView tvc4 =(TextView) findViewById(R.id.tvAsignatura4);
        tvc4.setText(ac4);
        TextView tvd4 =(TextView) findViewById(R.id.tvDisp4);
        tvd4.setText(ad4);



        String aa5=datos.getString("clave5");
        String ab5=datos.getString("credito5");
        String ac5=datos.getString("asignatura5");
        String ad5=datos.getString("hora5");

        TextView tva5 =(TextView) findViewById(R.id.tvCl5);
        tva5.setText(aa5);
        TextView tvb5 =(TextView) findViewById(R.id.tvCr5);
        tvb5.setText(ab5);
        TextView tvc5 =(TextView) findViewById(R.id.tvAsignatura5);
        tvc5.setText(ac5);
        TextView tvd5 =(TextView) findViewById(R.id.tvDisp5);
        tvd5.setText(ad5);



        String aa6=datos.getString("clave6");
        String ab6=datos.getString("credito6");
        String ac6=datos.getString("asignatura6");
        String ad6=datos.getString("hora6");

        TextView tva6 =(TextView) findViewById(R.id.tvCl6);
        tva6.setText(aa6);
        TextView tvb6 =(TextView) findViewById(R.id.tvCr6);
        tvb6.setText(ab6);
        TextView tvc6 =(TextView) findViewById(R.id.tvAsignatura6);
        tvc6.setText(ac6);
        TextView tvd6 =(TextView) findViewById(R.id.tvDisp6);
        tvd6.setText(ad6);


    }
}
