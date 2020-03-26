package com.lleonardo07.habilidades.otras.excepciones.excepcion;

/**
 *
 * @author Leand
 */
public class NoTanRapido extends Exception{

    public NoTanRapido() {
    }

    public NoTanRapido(String message) {
        super(message);
    }

    public NoTanRapido(String message, Throwable cause) {
        super(message, cause);
    }

    public NoTanRapido(Throwable cause) {
        super(cause);
    }

    public NoTanRapido(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
