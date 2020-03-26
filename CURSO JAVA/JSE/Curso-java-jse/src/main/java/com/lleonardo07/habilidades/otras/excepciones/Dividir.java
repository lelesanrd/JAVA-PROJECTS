package com.lleonardo07.habilidades.otras.excepciones;

import com.lleonardo07.habilidades.otras.excepciones.excepcion.NoTanRapido;
import lombok.Data;

/**
 *
 * @author Leand
 */
@Data
public class Dividir {
     
    private int a;
    private int b;
    
    public Dividir(int a, int b) throws NoTanRapido{
        
        if (b == 0) {
            System.out.println("================================================");
            System.out.println("No tan rápido sabio!!, recuerda que no puedes dividir " + b);
            System.out.println("================================================");
        }
        this.a = a;
        this.b = b;
    }
    
    public void Dividir(){
        System.out.println("El división es" + (a/b) );
    }
}
