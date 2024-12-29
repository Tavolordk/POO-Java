package com.atex.it;

public class Usuario {
    private String nombre;
    private int edad;
    public String getNombre() {
        return nombre;
    }
    public Usuario(int edad) {
        this.edad = edad;
    }
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Usuario(){};
    
}
