package paquete1;

import paquete2.Hijo2;

public class Main {
    public static void main(String[] args) {
        Padre hijo1 = new Hijo1();
        System.out.println("HIJO 1:");
        System.out.println(hijo1.estatura);
        System.out.println(hijo1.pelo);
        System.out.println(hijo1.tipoCuerpo);
        hijo1.caracter();
        hijo1.habilidades();

        System.out.println("HIJO 2:");
        Padre hijo2 = new Hijo2();
        System.out.println(hijo2.estatura);
        System.out.println(hijo2.pelo);
        System.out.println(hijo2.tipoCuerpo);
        hijo2.caracter();
        hijo2.habilidades();
    }
}
