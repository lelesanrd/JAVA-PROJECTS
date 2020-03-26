package com.lleonardo07.habilidades.otras.genericos;

/**
 *
 * @author Leand
 * @param <T>
 */
public class CreacionGenerico<T> {
    
    T objeto;

    public CreacionGenerico(T objeto) {
        this.objeto = objeto;
    }
    
    public void imprimirTipoObjeto(T objeto){
        System.out.println("Esté objeto es de tipo: " + objeto.getClass().getSimpleName());
    }
}
