
package Servicios;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;
    import Constructores.Socio;

public class SQLSocio {
    
    private final String tabla = "socios";
    
    public void guardar(Connection conexion, Socio socio) throws SQLException{
        try{
            PreparedStatement consulta;
            if(socio.getId() == null){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre, ciudad, telefono) VALUES(?, ?, ?)");
                consulta.setString(1, socio.getNombre());
                consulta.setString(2, socio.getCiudad());
                consulta.setString(3, socio.getTelefono());
            }else{
                consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET nombre = ?, ciudad = ?, telefono = ? WHERE id = ?");
                consulta.setString(1, socio.getNombre());
                consulta.setString(2, socio.getCiudad());
                consulta.setString(3, socio.getTelefono());
                consulta.setInt(4, socio.getId());
            }
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public Socio recuperarPorId(Connection conexion, int id) throws SQLException {
        Socio socio = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT nombre, ciudad, telefono FROM " + this.tabla + " WHERE id = ?" );
            consulta.setInt(1, id);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                socio = new Socio(id, resultado.getString("nombre"), resultado.getString("ciudad"), resultado.getString("telefono"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return socio;
    }
    
    public void eliminar(Connection conexion, Socio socio) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE id = ?");
            consulta.setInt(1, socio.getId());
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<Socio> recuperarTodas(Connection conexion) throws SQLException{
        List<Socio> socios = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, ciudad, telefono FROM " + this.tabla + " ORDER BY telefono");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                socios.add(new Socio(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("ciudad"), resultado.getString("telefono")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return socios;
    }
    
}
