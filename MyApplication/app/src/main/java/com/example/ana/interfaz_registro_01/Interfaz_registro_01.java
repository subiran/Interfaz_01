package com.example.ana.interfaz_registro_01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;


public class Interfaz_registro_01 extends ActionBarActivity {

    final public static String NOMBRE1 = "com.example.ana.interfaz_registro_01.nombre";
    final public static String APELLIDO1 = "com.example.ana.interfaz_registro_01.ape";
    final public static String SEXO1 = "com.example.ana.interfaz_registro_01.sexo";
    final public static String TRAB1 = "com.example.ana.interfaz_registro_01.trab";
    final public static String EST1 = "com.example.ana.interfaz_registro_01.est";
    final public static String UNI1 = "com.example.ana.interfaz_registro_01.uni";
    final public static String PESO1 = "com.example.ana.interfaz_registro_01.peso";
    final public static String FECHA1 = "com.example.ana.interfaz_registro_01.fecha";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_registro_01);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interfaz_registro_01, menu);
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
 public void enviar(View variable){

     EditText namecontent = (EditText) findViewById(R.id.Name); //(EditText) -> Hacer un cast
     String name = namecontent.getText().toString();

     EditText surnamecontent = (EditText) findViewById(R.id.Surname);
     String surname = surnamecontent.getText().toString();

     RadioGroup sexcontent = (RadioGroup) findViewById(R.id.radioSex);
     int selected_radio = sexcontent.getCheckedRadioButtonId();
     RadioButton radio_sex_button = (RadioButton) findViewById(selected_radio);
     String sex = radio_sex_button.getText().toString();

     CheckBox jobcontent = (CheckBox) findViewById(R.id.trab);
        String job = "No treballa";
     CheckBox studycontent = (CheckBox) findViewById(R.id.est);
        String study = "No estudia";

     if (jobcontent.isChecked()) {
         job = "Treballa";
     }

     if (studycontent.isChecked()) {
         study = "Estudia";
     }

     ToggleButton togleboton = (ToggleButton) findViewById(R.id.togglebutton);
     String uni = "No té estudis universitaris";

     if (togleboton.isChecked()){
         uni = "Té estudis universitaris";
     }

     SeekBar kg = (SeekBar) findViewById(R.id.Peso);

        int weight = kg.getProgress();

     EditText borncontent = (EditText) findViewById(R.id.data);
        String born = borncontent.getText().toString();


     Intent in= new Intent(this,resultado.class);
        in.putExtra(NOMBRE1, name);
        in.putExtra(APELLIDO1, surname);
        in.putExtra(SEXO1, sex);
        in.putExtra(TRAB1, job);
        in.putExtra(EST1, study);
        in.putExtra(UNI1, uni);
        in.putExtra(PESO1, weight);
        in.putExtra(FECHA1, born);
     startActivity(in);

    }
    }
