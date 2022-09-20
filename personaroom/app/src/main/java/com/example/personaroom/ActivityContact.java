package com.example.personaroom;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.personaroom.database.Persona;

public class ActivityContact extends AppCompatActivity {
 private TextView txtnombre, txtciudad, txttelefono;
 private Persona ps;
 private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ps = (Persona) getIntent().getSerializableExtra("id");

        txtnombre = findViewById(R.id.textnombre);
        txtciudad = findViewById(R.id.textciudad);
        txttelefono= findViewById(R.id.textelefono);
        img = findViewById(R.id.imageView);

        txtnombre.setText(ps.getNombre());
        txtciudad.setText(ps.getCiudad());
        txttelefono.setText(ps.getTelefono());


    }
}
