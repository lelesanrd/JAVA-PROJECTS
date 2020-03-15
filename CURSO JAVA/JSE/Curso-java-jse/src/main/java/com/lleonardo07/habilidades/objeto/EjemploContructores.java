package com.lleonardo07.habilidades.objeto;

import com.lleonardo07.habilidades.objeto.assets.Aritmetica;

/**
 *
 * @author Leand
 * Objetivo de está clase es explicar los tipos de contructores y la ventajas
 * de utilizar los mismos
 */
public class EjemploContructores {
    
    public static void main(String[] args) {
        
        Aritmetica ejemplo1 = new Aritmetica();
        ejemplo1.getA();
        ejemplo1.getB();
        System.out.println(ejemplo1.toString());
        
        Aritmetica ejemplo2 = new Aritmetica(3,3);
        ejemplo2.sumar();
        
    }
}
