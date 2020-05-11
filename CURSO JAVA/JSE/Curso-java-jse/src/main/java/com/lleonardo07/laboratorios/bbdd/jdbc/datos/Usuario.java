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

    public Usuario() {
    }
    
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
}
