package com.lleonardo07.laboratorios.bbdd.jdbc.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leand
 */
public class Conexion {
    
    private final static String JDBC_URL = "jdbc:mysql://localhost:3307/test?useSSL=false&serverTimezone=UTC";
    private final static String JDBC_USER = "root";
    private final static String JDBC_PASS = "admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs) throws SQLException{
       rs.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
}
