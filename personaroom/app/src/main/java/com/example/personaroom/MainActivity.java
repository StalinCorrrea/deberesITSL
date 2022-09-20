package com.example.personaroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.personaroom.adapter.ListAdapter;
import com.example.personaroom.database.Persona;
import com.example.personaroom.database.PersonaLab;
import android.os.Parcelable;



public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private ListAdapter listItemAdapter;
    private ArrayList<Persona> listaNombres=new ArrayList<>();
    private ListView listView;
    private PersonaLab mPersonaLab;
    private Persona mPersona;
    private TextView guardar,ciudad,telefono;
    private Button bguardar,blimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPersonaLab=new PersonaLab(this);

       listView=(ListView) findViewById(R.id.list);
        guardar=(TextView) findViewById(R.id.editTextTextPersonName);
        bguardar=(Button) findViewById(R.id.buttonGuardar);
        blimpiar=(Button) findViewById(R.id.buttonLimpiar);
        ciudad=(TextView) findViewById(R.id.editTextTextCiudad);
        telefono=(TextView) findViewById(R.id.editTextTextTelefono);
        bguardar.setOnClickListener(this);
        blimpiar.setOnClickListener(this);

        getAllPersonas();
        listItemAdapter=new ListAdapter(this,listaNombres);
        listView.setAdapter(listItemAdapter);


    }
    /**
     * GUARDA EN LA BASE DE DATOS
     */
    public void insertPersonas() {
        mPersona=new Persona();
        mPersona.setNombre(guardar.getText().toString());
        mPersona.setCiudad(guardar.getText().toString());
        mPersona.setTelefono(guardar.getText().toString());
        mPersonaLab.addPersona(mPersona);
        guardar.setText(" ");
        ciudad.setText(" ");
        telefono.setText(" ");


    }
// CONSULTA A LA BASE DE DATOS
    public void getAllPersonas(){
        listaNombres.clear();
        listaNombres.addAll(mPersonaLab.getPersonas());

    }

// ACCION DE LOS BOTONES
    @Override
    public void onClick(View v) {
        if (v==blimpiar){
            mPersonaLab.deleteAllPersona();
            listaNombres.clear();
            listItemAdapter.notifyDataSetChanged();
        }
        if (v==bguardar){
            insertPersonas();
            getAllPersonas();
            listItemAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent info  =  new Intent(MainActivity.this,ActivityContact.class);
        info.putExtra("id",listaNombres.get(i));
        startActivity(info);
    }
}