/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author David Velaz
 */
public class Conexión {
     private final String base = "sistinna";
    private final String user = "root";
    private final String password = "1234";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConection() {
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conecion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;*/
         
        try{
            Class.forName("java.sql.Connection");
            con = (Connection)DriverManager.getConnection(this.url,this.user,this.password);
            System.out.println("Se realizó con exito la conexión");
        }catch(Exception ex){
            System.err.println("Error"+ex);
        }
        return con;
    }
}

