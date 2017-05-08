
package Servicios;

import java.sql.*;

public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        String port="3306";
        String dbname="videoclub";
        String user="root";
        String pass="sistemas";
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
               cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub", "root", "sistemas");
                System.out.println("Conectado");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
