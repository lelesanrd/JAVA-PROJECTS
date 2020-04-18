package com.lleonardo07.habilidades.otras.bbdd.jdbc;

import java.sql.*;

/**
 *
 * @author Leand
 */
public class IntroduccionJDBC {
    public static void main(String[] args) {
        
        //Paso 1: Creamos nuestra cadena de conexion a MySQL
        String JDBC_URL = "jdbc:mysql://localhost:3306/pruebas?useSSL=false&serverTimezone=UTC";
        String JDBC_USER = "root";
        String JDBC_PASS = "admin";
        
        try {
            //Paso 2: Creamos el objeto de conexion a la base de datos
            Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
            
            //Paso 3: Creamos un objeto de tipo Statement.
            Statement instruccion = con.createStatement();
            
            //Paso 4: Creamos la sentencia (query) de nstra BBDD
            String SQL = "select id_persona, nombre, apellido, email, telefono from persona";
            
            //Paso 5: Ejecutamos el Query
            ResultSet resultado = instruccion.executeQuery(SQL);
            
            //Paso 6: Procesamos el resultado
            while(resultado.next()){
                System.out.println("==========================================");
                System.out.print("ID_PERSONA = " + resultado.getInt("id_persona"));
                System.out.print("Nombre = " + resultado.getString("nombre"));
                System.out.print("Apellido = " + resultado.getString("apellido"));
                System.out.print("Email = " + resultado.getString("email"));
                System.out.println("Telefono = " + resultado.getString("telefono"));
                System.out.println("==========================================");
            }
            //Paso 7: Cerramos los objetos utilizados ( esto para no tener ningun problema respecto a los objetos que se estan creando.
            // No podemos crear conexion a las BBDD
            resultado.close();
            instruccion.close();
            con.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
