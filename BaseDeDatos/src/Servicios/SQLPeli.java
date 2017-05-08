
package Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Constructores.Pelicula;

public class SQLPeli {
    
    private final String tabla = "peliculas";
    
    public void guardar(Connection conn, Pelicula peli) throws SQLException{
        try{
            PreparedStatement consulta;
            if(peli.getId() == null){
                consulta = conn.prepareStatement("INSERT INTO "+this.tabla+" (Titulo, Descripcion, Duracion) VALUES (?,?,?)");
                consulta.setString(1, peli.getTitulo());
                consulta.setString(2, peli.getDescripcion());
                consulta.setString(3, peli.getDuracion());  
          }else{
                consulta = conn.prepareStatement("UPDATE " + this.tabla + " SET titulo = ?, descripcion = ?, duracion = ? WHERE id = ?");
                consulta.setString(1, peli.getTitulo());
                consulta.setString(2, peli.getDescripcion());
                consulta.setString(3, peli.getDuracion());  
                consulta.setInt(4, peli.getId());
            }
            consulta.executeUpdate();
        }catch(SQLException ex){
            System.out.println("OJO Falla al subir");
            throw new SQLException(ex);
        }
    }
    
    public Pelicula recPorId(Connection conn, int id) throws SQLException{
        Pelicula peli = null;
        try{
            PreparedStatement consulta = conn.prepareStatement("SELECT titulo, descripcion, duracion FROM " + this.tabla + " WHERE id = ?" );
            consulta.setInt(1, id);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                peli = new Pelicula(id, resultado.getString("titulo"), resultado.getString("descripcion"), resultado.getString("duracion"));
            }
        }catch(SQLException ex){
               throw new SQLException(ex);
        }
        return peli;
    }
    
    public void eliminar(Connection conn, Pelicula pelis) throws SQLException{
        try{
            PreparedStatement consulta = conn.prepareStatement("DELETE FROM " + this.tabla + " WHERE id = ?");
            consulta.setInt(1, pelis.getId());
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<Pelicula> recuperarTodas(Connection conn) throws SQLException{
        List<Pelicula> pelicula = new ArrayList<>();
        try{
            PreparedStatement consulta = conn.prepareStatement("SELECT id, titulo, descripcion, duracion FROM " + this.tabla + " ORDER BY duracion");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                pelicula.add(new Pelicula(resultado.getInt("id"), resultado.getString("titulo"), resultado.getString("descripcion"), resultado.getString("duracion")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return pelicula;
    }
}
