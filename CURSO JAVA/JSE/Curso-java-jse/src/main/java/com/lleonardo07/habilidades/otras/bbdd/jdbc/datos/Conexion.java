package com.lleonardo07.habilidades.otras.bbdd.jdbc.datos;

import java.sql.*;

/**
 *
 * @author Leand
 */
//Estructuramos los objetos de conexion a la BBDD.
public class Conexion {
    
    private final static String JDBC_URL = "jdbc:mysql://localhost:3307/test?useSSL=false&serverTimezone=UTC";
    private final static String JDBC_USER = "root";
    private final static String JDBC_PASS = "admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
