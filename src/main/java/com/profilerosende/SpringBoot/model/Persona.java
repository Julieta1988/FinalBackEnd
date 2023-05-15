package com.profilerosende.SpringBoot.model;
// ctrl + shift + i       
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity        
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String imagen;
    private String presentacion;
     
//alt + insert para generar constructor vacio y luego otro (SIN ID)    
    public Persona(){
    }
    
    public Persona (String nombre, String imagen, String presentacion){
        this.nombre = nombre;
        this.imagen = imagen;
        this.presentacion = presentacion;
    }    
//click derecho generar getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    } 
    
    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    } 
}