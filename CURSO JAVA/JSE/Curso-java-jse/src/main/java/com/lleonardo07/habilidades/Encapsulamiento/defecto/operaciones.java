package com.lleonardo07.habilidades.Encapsulamiento.defecto;

import lombok.Data;

/**
 *
 * @author Leand
 */
@Data
public class operaciones {
    
    int a;
    int b;

    operaciones() {
    }
    
    operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
