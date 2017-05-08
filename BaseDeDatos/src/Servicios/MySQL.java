/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.*;

public class MySQL {
        
    static String login = "root";
    static String password = "sistemas";
    public static String bd="videoclub";
    static String url = "jdbc:mysql://localhost:3306/"+ bd;
    private static Connection conn = null;
    
    public static boolean conectar(String log, String pass){
        boolean comp = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, log,pass);
            if(conn != null){
                System.out.println("Conexión a la base de datos "+url+": OK");
                conn.close();
                comp = true;
            }
            return comp;
        }catch(SQLException ex){
            System.err.println("No se ha podido conectar a la base de datos");
            return false;
        }catch(ClassNotFoundException ex){
            System.err.println("Error de ejecución");
            return false;
        }
    }
    
    public void cierraConexion(){
        try{
            conn.close();
            conn = null;
        }catch(Exception e){
            System.err.println("Problema para cerrar la conexión de la base de datos");
        }
    }
    
    public void desconectar(){
        conn=null;
    }
}
