package ec.edu.tecnologicoloja.listapplication.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity (tableName = "persona")

public class Persona {

    public Persona(String nombre, String correo, String ciudad, String telefono, String descripcion) {
        this.nombre=nombre;
        this.correo=correo;
        this.ciudad=ciudad;
        this.telefono=telefono;
        this.descripcion=descripcion;


    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;



    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @ColumnInfo(name = "nombre")
    private String nombre;


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @ColumnInfo(name = "correo")
    private String correo;


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @ColumnInfo(name = "ciudad")
    private String ciudad;


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @ColumnInfo(name = "telefono")
    private String telefono;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @ColumnInfo(name = "descripcion")
    private String descripcion;




}
