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
    private String apellido;
    /*
    @Temporal(TemporalType.DATE)
    private Date nacimiento;

    @Lob
    private String acercade/presentacion;
    si no tima lob (lo vemos en la estructura de la base de datos)
    podemos hacer:
    @Size(min = 1m max = 40, message = "no cumple con la longitud")
    
    imagen es una string porq esta guardada como url
    */
     
//alt + insert para generar constructor vacio y luego otro (SIN ID)    
    public Persona(){
    }
    
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } 
}