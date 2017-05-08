/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class MySQL {
    
    private static Connection Conexion;
    public void MySQLConnection(String user, String pass, String dbnom) throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbnom, user, pass);
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            System.err.println("El error está en ClassNotfoundException");
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        MySQL db = new MySQL();
        db.MySQLConnection("root", "sistemas", "videoclub");
    }
    
}
