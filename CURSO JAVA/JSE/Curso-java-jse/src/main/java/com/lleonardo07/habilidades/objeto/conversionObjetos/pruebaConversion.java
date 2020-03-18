package com.lleonardo07.habilidades.objeto.conversionObjetos;

import com.lleonardo07.habilidades.objeto.conversionObjetos.domain.Empleado;
import com.lleonardo07.habilidades.objeto.conversionObjetos.domain.Gerente;
import com.lleonardo07.habilidades.objeto.conversionObjetos.domain.TipoEmpleado;

/**
 *
 * @author Leand
 */
public class pruebaConversion {
    public static void main(String[] args) {
        
        //Upcasting, su conversion se hace de forma automatica.
        Empleado emp = new Gerente("lleonardo07", 123.456, TipoEmpleado.PASANTE);
        System.out.println("UpCasting" + emp.getObtenerDetalles());
        //pero si intentas el método "getObtenerDetalloesGerente", no puedes. 
        //porque el tipo emp es de Empleado y no de gerente...
        //Solución, hacer un DownCasting.
        
        //DownCasting
        System.out.println( "DownCasting 1: " + ((Gerente) emp).getObtenerDetallesGerente());
        
        //Segunda forma de DownCasting, convertir el tipo emp a tipo Gerente
        Gerente gerente = (Gerente) emp;
        System.out.println("DownCasting 2: " + gerente.getObtenerDetallesGerente());
    }
}
