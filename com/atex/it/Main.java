package com.atex.it;

import java.util.Date;

public class Main{
    public static void main(String[] args) {
double saldo = 2000.00;
ClienteBanco clienteBanco = new ClienteBanco("Pepe", 19, "Oaxaca", new Date(), "APO1234567", saldo);
clienteBanco.servicioAlCliente();
clienteBanco.mostrarInformacion();

String [] productos={"Desodorante","Comida","lavatrastes"};
Date date1 = new Date();
ClienteWalmart clienteWalmart = new ClienteWalmart("Juan", 16, "CDMX", date1, "50%",productos );
clienteWalmart.servicioAlCliente();
clienteWalmart.mostrarInformacion();
}


    
}
