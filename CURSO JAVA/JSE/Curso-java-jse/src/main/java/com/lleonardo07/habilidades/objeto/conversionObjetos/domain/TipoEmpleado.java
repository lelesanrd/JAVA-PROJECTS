package com.lleonardo07.habilidades.objeto.conversionObjetos.domain;

/**
 *
 * @author Leand
 */
public enum TipoEmpleado {
    PASANTE("Modalidad Pasante"),
    FIJO("Modalidad Fijo");
    
    private final String descripcion;

    private TipoEmpleado(String descripcion ) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
