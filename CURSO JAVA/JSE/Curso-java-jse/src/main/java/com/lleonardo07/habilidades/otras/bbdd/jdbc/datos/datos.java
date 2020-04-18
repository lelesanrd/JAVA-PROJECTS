package com.lleonardo07.habilidades.otras.bbdd.jdbc.datos;

import com.lleonardo07.habilidades.otras.bbdd.jdbc.sql.IConstantesSQL;
import java.sql.*;

/**
 *
 * @author Leand
 */
public class datos {

    public static void main(String[] args) {
        
        // 1) Nuestra cadena de conexión a la base de datos
        String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        String JDBC_USER = "root";
        String JDBC_PASS = "admin";

        try {
            // 2) Creamos el objeto de conexion a base de datos
            Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
            
            // 3) Intrucciones para la base de datos. Creamos el Staement (exiten 3 tipos, Statement, PreparedStatemend y CallableStatement.
            Statement stmt = con.createStatement();
            
            // 4) Query o consulta a realizar.
              //Forma 1:
//            String SQL = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

              //Forma 2:
//              StringBuilder SQL = new StringBuilder(200);
//              SQL.append(IConstantesSQL.SELECT).append(" ")
//                 .append("id_persona, ")
//                 .append("nombre, ").append("apellido, ").append(" email, ").append("telefono").append(" ")
//                 .append(IConstantesSQL.FROM).append(" ")
//                 .append("persona");

              //Forma 3:
            String SQL = IConstantesSQL.SELECT.concat(" ")
                        .concat("id_persona,").concat(" ")
                        .concat("nombre,").concat(" ")
                        .concat("apellido,").concat(" ")
                        .concat("email,").concat(" ")
                        .concat("telefono").concat(" ")
                        .concat(IConstantesSQL.FROM).concat(" ").concat("persona");
            
            // 5) Ejecución del query o consulta.
            ResultSet resultado = stmt.executeQuery(SQL.toString());
            
            //Iteramos la consulta.
            while ( resultado.next() ) {
                System.out.println("==========================================");
                System.out.println( "ID: " + resultado.getInt("id_persona") );
                System.out.println( "Nombre: " + resultado.getString("nombre") );
                System.out.println( "Apellido: " + resultado.getString("apellido") );
                System.out.println( "E-mail: " + resultado.getString("email") );
                System.out.println( "Telefóno: " + resultado.getString("telefono") );
                System.out.println("==========================================");
            }
            //Cerramos cada objeto utilizado, apra evitar dejar esto abierto y crear errores...
            resultado.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
