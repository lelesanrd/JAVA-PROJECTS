package com.lleonardo07.habilidades.Encapsulamiento.privado;

import lombok.Data;

/**
 *
 * @author Leand
 */
@Data
public class operaciones {
    
    private int a;
    private int b;

    private operaciones() {
    }
    
    private operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
