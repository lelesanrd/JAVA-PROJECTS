package com.lleonardo07.habilidades.objeto.conversionObjetos.domain;

/**
 *
 * @author Leand
 */
public class Gerente extends Empleado{
    
    final TipoEmpleado tipoEmpleado;

    public Gerente(String nombre, double sueldo, TipoEmpleado tipoEmpleado) {
        super(nombre, sueldo);
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getObtenerDetallesGerente() {
        return super.getObtenerDetalles() + ", Tipo de empleado" + this.tipoEmpleado.getDescripcion();
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }
    
    public String getTipoEmpleadoDesc(){
        return tipoEmpleado.getDescripcion();
    }
}
