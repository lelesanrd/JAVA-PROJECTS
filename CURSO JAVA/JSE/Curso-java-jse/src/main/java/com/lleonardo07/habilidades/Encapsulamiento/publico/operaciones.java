package com.lleonardo07.habilidades.Encapsulamiento.publico;

import lombok.Data;

/**
 *
 * @author Leand
 */
@Data
public class operaciones {
    
    public int a;
    public int b;

    public operaciones() {
    }
    
    public operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
