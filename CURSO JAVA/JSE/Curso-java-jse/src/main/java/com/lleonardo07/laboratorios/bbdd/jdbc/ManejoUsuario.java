package com.lleonardo07.laboratorios.bbdd.jdbc;

import com.lleonardo07.laboratorios.bbdd.jdbc.datos.Usuario;
import com.lleonardo07.laboratorios.bbdd.jdbc.datos.UsuarioJDBC;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Leand
 */
public class ManejoUsuario {
    
    public static void main(String[] args) throws SQLException {
        
        //1: Creamos nuestro objeto PersonaJDBC que contiene nuestras sentencias
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        
        //2: Creamos una lista, dado que este será la forma en como nos devolvera la sentencia y/o el objeto
        List<Usuario> usuarios = usuarioJDBC.select();
        
        //========================= SELECT =========================
        //3: Iteramos este resultado
        //Ejemplo 1: con expresiones Lambda, java 8
        usuarios.forEach( (klk)-> {
            System.out.println("========== JAVA 8: LAMBDA ===========");
            System.out.println( "Usuario: " + usuarios );
            System.out.println("");
            System.out.println("");
        });
        
        //Ejemplo 2: 
        usuarios.stream().map((usuario) -> {
            System.out.println("========== JAVA 8: stream ===========");
            return usuario;
        }).forEachOrdered((usuario) -> {
            System.out.println( "Usuario: " + usuario );
            System.out.println("");
        });

        //Ejemplo 3: Tradicional
        for(Usuario usuario : usuarios){
            System.out.println("========== TRADICIONAL ===========");
            System.out.println( "Usuario: " + usuario );
            System.out.println("");
        }
        
        //========================= INSERT =========================
//        //Creamos un nuevo objeto tipo usuario
//        Usuario u = new Usuario("otto", "123");
//        //Ejecutamos el método insert
//        usuarioJDBC.insert(u);

        //========================= UPDATE =========================
         //Creamos un nuevo objeto tipo usuario
        Usuario u = new Usuario(2, "lele", "113");
        //Ejecutamos el método update
        usuarioJDBC.update(u);
        
        //========================= DELETE =========================
         //Creamos un nuevo objeto tipo usuario
        usuarioJDBC.delete(new Usuario(2));
    }
}
