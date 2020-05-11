package com.lleonardo07.laboratorios.bbdd.jdbc.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leand
 */
public class UsuarioJDBC {
    
    private static final String SQL_SELECT = " SELECT id_usuarios, usuario, password FROM usuarios ";
    private static final String SQL_INSERT = " INSERT INTO usuarios (usuario, password) VALUES (?, ?) ";
    private static final String SQL_UPDATE = " UPDATE usuarios SET usuario = ?, password = ? WHERE id_usuarios = ? ";
    private static final String SQL_DELETE = " DELETE FROM  usuarios WHERE id_usuarios = ? ";
    
    public List<Usuario> select() throws SQLException{
        
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs            = null;
        Usuario usuario         = null ;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_SELECT);
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while( rs.next() ){
                int idPersona   = rs.getInt("id_persona");
                String user     = rs.getString("usuario");
                String password = rs.getString("password");
                
                usuario = new Usuario();
                usuario.setIdUsuario(idPersona);
                usuario.setUsuario(user);
                usuario.setPassword(password);
                
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuarios;
    }
    
    public int insert(Usuario usuario) throws SQLException{
        
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int filas = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecuando query: " + SQL_INSERT);
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            
            filas = stmt.executeUpdate();
            
            System.out.println("==================");
            System.out.println("Registros afectados: " + filas);
            System.out.println("==================");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return filas;
    }

    public int update(Usuario u) throws SQLException{
        
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int filas               = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, u.getUsuario());
            stmt.setString(2, u.getPassword());
            stmt.setInt(3, u.getIdUsuario());
            
            filas = stmt.executeUpdate();
            
            System.out.println("==================");
            System.out.println("Registros afectados: " + filas);
            System.out.println("==================");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return filas;
    }
    
    public int delete(Usuario u) throws SQLException{
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int filas               = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, u.getIdUsuario());
            
            filas = stmt.executeUpdate();
            
            System.out.println("==================");
            System.out.println("Registros afectados: " + filas);
            System.out.println("==================");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return filas;
    }
    
}
