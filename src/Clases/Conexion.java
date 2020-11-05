/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Ventanas.*;

public class Conexion {
    //coneccion 
    public static Connection conectar(){
        try {
            String url = "jdbc:mysql://bnl9mlsjhl1vr1tzi3pk-mysql.services.clever-cloud.com:3306/bnl9mlsjhl1vr1tzi3pk";
            String usuario = "uahtajkulnbnsgvu";
            String pass = "rwAr2oLaNXYdpVJI3UKS";

            Connection cn = DriverManager.getConnection(url, usuario, pass);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexion al servidor:" + e);
        }
        return (null);
    }


}
