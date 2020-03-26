package com.lleonardo07.habilidades.otras.excepciones;

import com.lleonardo07.habilidades.otras.excepciones.excepcion.NoTanRapido;

/**
 *
 * @author Leand
 */
public class prueba {
    
    /*Método 1
        public static void main(String[] args) throws NoTanRapido{
        
            Dividir d = new Dividir(2, 0);
            d.Dividir();    
    }
    */
    
    public static void main(String[] args){
        
        try{
            Dividir d = new Dividir(2, 0);
            d.Dividir();    
        }
        catch(NoTanRapido no){
           System.out.println(no.getMessage());
            no.printStackTrace();
        }
        System.out.println("El problema continua...");
    }
}