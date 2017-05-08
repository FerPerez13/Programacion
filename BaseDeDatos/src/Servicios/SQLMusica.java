/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author mati
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Constructores.Musica;

public class SQLMusica {
    
    private final String tabla = "musicas";
    
    public void guardar(Connection conn, Musica musica) throws SQLException{
        try{
            PreparedStatement consulta;
            if(musica.getId() == null){
                consulta = conn.prepareStatement("INSERT INTO "+this.tabla+" (titulo, descripcion, duracion) VALUES (?,?,?)");
                consulta.setString(1, musica.getTitulo());
                consulta.setString(2, musica.getDescripcion());
                consulta.setString(3, musica.getDuracion());
            }else{
                consulta = conn.prepareStatement("UPDATE "+this.tabla+" SET titulo=?, descripcion=?, duracion=? WHERE id=?");
                consulta.setString(1,musica.getTitulo());
                consulta.setString(2, musica.getDescripcion());
                consulta.setString(3, musica.getDuracion());
                consulta.setInt(4, musica.getId());
            }
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public Musica recPorId(Connection conn, int id) throws SQLException{
        Musica peli = null;
        try{
            PreparedStatement consulta = conn.prepareStatement("SELECT titulo, descripcion, duracion FROM " + this.tabla + " WHERE id = ?" );
            consulta.setInt(1, id);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                peli = new Musica(id, resultado.getString("titulo"), resultado.getString("descripcion"), resultado.getString("duracion"));
            }
        }catch(SQLException ex){
               throw new SQLException(ex);
        }
        return peli;
    }
    
    public void eliminar(Connection conn, Musica musica) throws SQLException{
        try{
            PreparedStatement consulta = conn.prepareStatement("DELETE FROM " + this.tabla + " WHERE id = ?");
            consulta.setInt(1, musica.getId());
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<Musica> recuperarTodas(Connection conn) throws SQLException{
        List<Musica> pelicula = new ArrayList<>();
        try{
            PreparedStatement consulta = conn.prepareStatement("SELECT id, titulo, descripcion, duracion FROM " + this.tabla + " ORDER BY duracion");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                pelicula.add(new Musica(resultado.getInt("id"), resultado.getString("titulo"), resultado.getString("descripcion"), resultado.getString("duracion")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return pelicula;
    }
}
