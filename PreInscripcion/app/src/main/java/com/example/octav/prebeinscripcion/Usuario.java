package com.example.octav.prebeinscripcion;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import com.android.volley.toolbox.StringRequest;

import java.text.BreakIterator;

public class Usuario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

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

    public void rButton3(View v){
        TextView cl3=(TextView) findViewById(R.id.tvCl3);
        TextView cr3=(TextView) findViewById(R.id.tvCr3);
        TextView asig3=(TextView) findViewById(R.id.tvAsignatura3);
        TextView hora3=(TextView) findViewById(R.id.tvDisp3);

        String a3=cl3.getText().toString();
        String b3=cr3.getText().toString();
        String c3=asig3.getText().toString();
        String d3=hora3.getText().toString();

        Intent i=new Intent(this, UsuarioR.class);

        i.putExtra("clave3",a3);
        i.putExtra("credito3",b3);
        i.putExtra("asignatura3",c3);
        i.putExtra("hora3",d3);

        startActivity(i);

        Toast.makeText(this,"Asignatura Registrada con éxito :D",Toast.LENGTH_SHORT).show();
    }

    public void rButton4(View v){
        TextView cl4=(TextView) findViewById(R.id.tvCl4);
        TextView cr4=(TextView) findViewById(R.id.tvCr4);
        TextView asig4=(TextView) findViewById(R.id.tvAsignatura4);
        TextView hora4=(TextView) findViewById(R.id.tvDisp4);

        String a4=cl4.getText().toString();
        String b4=cr4.getText().toString();
        String c4=asig4.getText().toString();
        String d4=hora4.getText().toString();

        Intent i=new Intent(this, UsuarioR.class);

        i.putExtra("clave4",a4);
        i.putExtra("credito4",b4);
        i.putExtra("asignatura4",c4);
        i.putExtra("hora4",d4);

        startActivity(i);

        Toast.makeText(this,"Asignatura Registrada con éxito :D",Toast.LENGTH_SHORT).show();
    }


    public void rButton5(View v){
        TextView cl5=(TextView) findViewById(R.id.tvCl5);
        TextView cr5=(TextView) findViewById(R.id.tvCr5);
        TextView asig5=(TextView) findViewById(R.id.tvAsignatura5);
        TextView hora5=(TextView) findViewById(R.id.tvDisp5);

        String a5=cl5.getText().toString();
        String b5=cr5.getText().toString();
        String c5=asig5.getText().toString();
        String d5=hora5.getText().toString();

        Intent i=new Intent(this, UsuarioR.class);

        i.putExtra("clave5",a5);
        i.putExtra("credito5",b5);
        i.putExtra("asignatura5",c5);
        i.putExtra("hora5",d5);

        startActivity(i);

        Toast.makeText(this,"Asignatura Registrada con éxito :D",Toast.LENGTH_SHORT).show();
    }



    public void rButton6(View v){
        TextView cl6=(TextView) findViewById(R.id.tvCl6);
        TextView cr6=(TextView) findViewById(R.id.tvCr6);
        TextView asig6=(TextView) findViewById(R.id.tvAsignatura6);
        TextView hora6=(TextView) findViewById(R.id.tvDisp6);

        String a6=cl6.getText().toString();
        String b6=cr6.getText().toString();
        String c6=asig6.getText().toString();
        String d6=hora6.getText().toString();

        Intent i=new Intent(this, UsuarioR.class);

        i.putExtra("clave6",a6);
        i.putExtra("credito6",b6);
        i.putExtra("asignatura6",c6);
        i.putExtra("hora6",d6);

        startActivity(i);

        Toast.makeText(this,"Asignatura Registrada con éxito :D",Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view){
        /*Intent i= new Intent(Usuario.this,UsuarioR.class);
        startActivity(i);*/

        Toast.makeText(this,"Ponme 10 ándale :(",Toast.LENGTH_SHORT).show();
    }

}
