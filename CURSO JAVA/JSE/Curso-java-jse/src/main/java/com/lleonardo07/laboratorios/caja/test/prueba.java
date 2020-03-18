package com.lleonardo07.laboratorios.caja.test;

import com.lleonardo07.laboratorios.caja.Caja;
/**
 * Ejemplo de caja
 * @author Leand
 */
public class prueba {

    public static void main(String[] args) {

        int ANCHO = 3;
        int ALTO = 2;
        int PROFUNDO = 6;

        Caja c1 = new Caja();
        int resultado = c1.calcularVolumen(ANCHO, ALTO, PROFUNDO);
        System.out.println("resultado de c: " + resultado);

        Caja c2 = c1;
        System.out.println("Resultado c2: " + c2.calcularVolumen(2,4,6));
        
         Caja c3 = new Caja(2,4,6);
        System.out.println("Resultado c2: " + c3.calcularVolumen());
        
        //---------------------------------------------------
        Caja c4 = null;
        System.out.println("resultado de c: " + c4);

        /*  Error porque se quito su referencia.. memoria stack
        Caja c2 = c4;
        System.out.println("Resultado c2: " + c2.calcularVolumen(2,4,6));
        */
}
}
