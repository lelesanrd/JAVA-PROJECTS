package com.lleonardo07.habilidades.Encapsulamiento.protegido;

import lombok.Data;

/**
 *
 * @author Leand
 */
@Data
public class operaciones {
    
    protected int a;
    protected int b;

    protected operaciones() {
    }
    
    protected operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
