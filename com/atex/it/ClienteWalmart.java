package com.atex.it;

import java.util.Arrays;
import java.util.Date;

public class ClienteWalmart extends Cliente{
    
    public ClienteWalmart(String nombre, int edad, String domicilio, Date fechaCreacion, String promociones,
            String[] productos) {
        super(nombre, edad, domicilio, fechaCreacion);
        this.promociones = promociones;
        this.productos = productos;
    }
    private String promociones;
    private String [] productos;
    
    @Override
    public String toString() {
        return " promociones=" + promociones + ", productos=" + Arrays.toString(productos)
                + ", getFechaCreacion()=" + getFechaCreacion() + ", getNombre()=" + getNombre() + ", getEdad()="
                + getEdad() + ", getDomicilio()=" + getDomicilio();
    }

    @Override
    public void mostrarInformacion() {
  System.out.println("Hola soy un cliente de walmart "+ toString());
    }
}
