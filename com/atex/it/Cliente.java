package com.atex.it;

import java.util.Date;

public abstract class Cliente {
    
    public Cliente(String nombre, int edad, String domicilio, Date fechaCreacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.fechaCreacion = fechaCreacion;
    }

    private String nombre;
    private int edad;
    private String domicilio;
    private Date fechaCreacion;
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getNombre() {
        return nombre;
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
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public abstract void mostrarInformacion();
    public void servicioAlCliente(){
        System.out.println("Hola soy un cliente y tengo una duda");
    }
}
