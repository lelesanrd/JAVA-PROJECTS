package com.lleonardo07.laboratorios.bbdd.jdbc.datos;

import lombok.Data;

/**
 *
 * @author Leand
 */
public @Data class Usuario {
    
    private int idUsuario;
    private String usuario;
    private String password;
}
