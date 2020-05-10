package com.lleonardo07.habilidades.otras.bbdd.jdbc.datos;

import lombok.Data;

/**
 *
 * @author Leand
 */
//Este será nuestro POJO
//Se esta utilizando el framework Limbok "@Data" para la creacion de get, set, etc...
public @Data class Persona {
    
    private int id_persona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
