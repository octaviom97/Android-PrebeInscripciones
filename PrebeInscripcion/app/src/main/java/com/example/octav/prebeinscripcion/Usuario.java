package com.example.octav.prebeinscripcion;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import com.android.volley.toolbox.StringRequest;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Usuario extends Activity {

    ArrayList<AsignaturasVo> listaAsignaturas;
    RecyclerView recyclerAsignaturas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        listaAsignaturas=new ArrayList<>();
        recyclerAsignaturas=(RecyclerView) findViewById(R.id.RecyclerId);
        recyclerAsignaturas.setLayoutManager(new LinearLayoutManager(this));

        llenarLista();

        AdaptadorLista adapter=new AdaptadorLista(listaAsignaturas);
        recyclerAsignaturas.setAdapter(adapter);

        Bundle datos=getIntent().getExtras();

        String str1=datos.getString("texto1");
        String str2=datos.getString("carrera1");

        TextView valor1=(TextView) findViewById(R.id.etNombre);
        valor1.setText("¡Bienvenido "+str1+"!");

        TextView valor2=(TextView) findViewById(R.id.tvFac);
        valor2.setText("Facultad de "+str2);

        /*TextView disp1=(TextView) findViewById(R.id.tvDisp1);
        disp1.setText("60");*/


    }

    /*public void restarDisp(View view){
        TextView dispo1=(TextView) findViewById(R.id.tvDisp1);
        int n1=Integer.parseInt(dispo1.getText().toString());
        int resultado= n1-1;
        dispo1.setText(resultado);
    }*/

    public void rButton1(View v){
        TextView cl1=(TextView) findViewById(R.id.tvCl1);
        TextView cr1=(TextView) findViewById(R.id.tvCr1);
        TextView asig1=(TextView) findViewById(R.id.tvAsignatura1);
        TextView hora1=(TextView) findViewById(R.id.tvDisp1);

        String a1=cl1.getText().toString();
        String b1=cr1.getText().toString();
        String c1=asig1.getText().toString();
        String d1=hora1.getText().toString();

        Intent i=new Intent(this, UsuarioR.class);

        i.putExtra("clave1",a1);
        i.putExtra("credito1",b1);
        i.putExtra("asignatura1",c1);
        i.putExtra("hora1",d1);

        startActivity(i);

        Toast.makeText(this,"Asignatura Registrada con éxito :D",Toast.LENGTH_SHORT).show();
    }

    public void rButton2(View v){
        TextView cl2=(TextView) findViewById(R.id.tvCl2);
        TextView cr2=(TextView) findViewById(R.id.tvCr2);
        TextView asig2=(TextView) findViewById(R.id.tvAsignatura2);
        TextView hora2=(TextView) findViewById(R.id.tvDisp2);

        String a2=cl2.getText().toString();
        String b2=cr2.getText().toString();
        String c2=asig2.getText().toString();
        String d2=hora2.getText().toString();

        Intent i=new Intent(this, UsuarioR.class);

        i.putExtra("clave2",a2);
        i.putExtra("credito2",b2);
        i.putExtra("asignatura2",c2);
        i.putExtra("hora2",d2);

        startActivity(i);

        Toast.makeText(this,"Asignatura Registrada con éxito :D",Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view){
        /*Intent i= new Intent(Usuario.this,UsuarioR.class);
        startActivity(i);*/

        Toast.makeText(this,"Ponme 10 :(",Toast.LENGTH_SHORT).show();
    }

    private void llenarLista(){
        listaAsignaturas.add(new AsignaturasVo("1122","10","Fundamentos de Programación","9:00/11:00"));
        listaAsignaturas.add(new AsignaturasVo("1124","06","Redacción y exposición de temas de ingeniería","13:00/15:00"));
        listaAsignaturas.add(new AsignaturasVo("1121","12","Cálculo y geometría analítica","7:00/9:00"));
        listaAsignaturas.add(new AsignaturasVo("1227","10","Estructura de datos y algoritmos I","13:00/15:00"));
        listaAsignaturas.add(new AsignaturasVo("1323","10","Programación Orientada a objetos","11:00/13:00"));
        listaAsignaturas.add(new AsignaturasVo("1503","08","Estructura y programación de computadoras","15:00/17:00"));
    }

}
