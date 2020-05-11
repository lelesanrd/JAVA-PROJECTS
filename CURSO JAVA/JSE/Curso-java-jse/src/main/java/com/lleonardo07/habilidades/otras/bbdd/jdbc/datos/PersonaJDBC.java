package com.lleonardo07.habilidades.otras.bbdd.jdbc.datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leand
 */
//Esta clase se encargará de realizar las operaciones sobre la tabla de BDBD "persona".
//el CRUD
public class PersonaJDBC {
    
    //1: Creamos nuestras constantes SQL
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona" ;
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)" ;
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona = ?" ;
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?" ;
    
    //2: Creamos el método para modificar un (1) registro
    public List<Persona> select(){
        
        //3: Definimos las variables y la declaramos como Null
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs            = null;
        Persona persona         = null;
        
        //4: Creamos una lista de objetos de tipo persona, para poder pasar los valores a esta lista
        List<Persona> personas = new ArrayList<>();
        
        //6: Lo envolvemos aqui como dara una excepcion SQL
        try {
            //5: Obtenemos la conexion a la base de datos con la conexion que creamos anteriormente
            conn = Conexion.getConnection();
            //7: Inicializamos nuestro objeto tipo statement y 
            //   especificamos la sentencia a utlizar, en este caso, select
            stmt = conn.prepareStatement(SQL_SELECT);
            //8: Ejecutamos nuestro query y lo asignamos a nuestro resultset(rs)
            rs = stmt.executeQuery();
            
            //9: Con el método next recorremos todos los registros que nos devuelve esta sentencia
            while( rs.next() ){
                //10: Creamos una variable temporal y le asignamos los valores de la sentencia 
                int id_persona  = rs.getInt("id_persona");
                String nombre   = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email    = rs.getString("email");
                String telefono = rs.getString("telefono");
                
                //11: Construimos un Objeto tipo persona y le asignamos el valor.
                persona = new Persona();
                persona.setId_persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);
                
                //12: Con esto podemos agregar c/u de los objetos que tengamos a una lista
                personas.add(persona);
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            //13: Cerramos las conexiones...
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        //14: Retornamos(devolvemos, regresar) la lista tipo Persona
        return personas;
    }
    //=================================================== FIN SELECT
    
    
    public int insert(Persona persona){
        Connection con          = null;
        PreparedStatement stmt  = null;
        //para saber la cant. de registros afectados.
        int rows = 0;
        
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            
            System.out.println("Ejecuntado query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return rows;
    }
    //=================================================== FIN INSERT
    
    public int update(Persona p){
        Connection con          = null;
        PreparedStatement stmt  = null;
        //Para saber la cant. de registros afectados
        int rows = 0;
        
        try {
            con = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getApellido());
            stmt.setString(3, p.getEmail());
            stmt.setString(4, p.getTelefono());
            stmt.setInt(5, p.getId_persona());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return rows;
    }
    //=================================================== FIN UPDATE
    
    public int delete(Persona p){
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecuntando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, p.getId_persona());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    //=================================================== FIN DELETE
}
