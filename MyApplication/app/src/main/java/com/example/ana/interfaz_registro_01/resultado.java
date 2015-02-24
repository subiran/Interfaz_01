package com.example.ana.interfaz_registro_01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class resultado extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();

        String Name = i.getStringExtra(Interfaz_registro_01.NOMBRE1);
        String Surname = i.getStringExtra(Interfaz_registro_01.APELLIDO1);
        String Sex = i.getStringExtra(Interfaz_registro_01.SEXO1);
        String Job = i.getStringExtra(Interfaz_registro_01.TRAB1);
        String Study = i.getStringExtra(Interfaz_registro_01.EST1);
        String Uni = i.getStringExtra(Interfaz_registro_01.UNI1);
        int Weight = i.getIntExtra(Interfaz_registro_01.PESO1, 50);
        String Born = i.getStringExtra(Interfaz_registro_01.FECHA1);

        setContentView(R.layout.activity_resultado);

        TextView datos= (TextView) findViewById(R.id.resultadillo);

        datos.setTextSize(40.0f);
        datos.setText(Name + "\n" + Surname + "\n" + Sex + "\n" + Job + "\n" + Study + "\n" + Uni + "\n" + Weight + "\n" + Born);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resultado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
