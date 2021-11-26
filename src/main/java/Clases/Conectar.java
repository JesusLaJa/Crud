/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class Conectar {

    Connection con;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "");

            System.out.println("Conectado a la base de datos!");

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }

        return con;
    }

}
