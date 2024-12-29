package com.atex.it;

import java.util.Date;

public class ClienteBanco extends Cliente{
    
    public ClienteBanco(String nombre, int edad, String domicilio, Date fechaCreacion, String numeroDeCuenta,
            double saldo) {
        super(nombre, edad, domicilio, fechaCreacion);
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return " numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + ", getFechaCreacion()="
                + getFechaCreacion() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getDomicilio()="
                + getDomicilio();
    }
    private String numeroDeCuenta;
    private double saldo;
    @Override
    public void mostrarInformacion() {
        System.out.println("Hola soy un cliente bancario" + toString());
    }
}
