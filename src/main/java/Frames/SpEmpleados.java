/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frames;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class SpEmpleados {

    Connection con;

    public int agregar(Empleados empleados) throws SQLException {
        

        
        CallableStatement myCall = con.prepareCall("{call A_AGREGAR_EMPLEADOS(?,?,?,?)}");
        myCall.setString("PNOMBRE", empleados.getNombre());
        myCall.setString("PAPPELLIDO", empleados.getApellido());
        myCall.setString("PDIRECCION", empleados.getDireccion());
        myCall.setString("PTELEFONO", empleados.getTelefono());
        myCall.registerOutParameter("PID", java.sql.Types.INTEGER);
        myCall.execute();
        empleados.setId(myCall.getInt("PID"));
        return empleados.getId();

    }

    /*public List<Empleados> obtener() throws SQLException {
        List<Empleados> listaEmpleados = new ArrayList<>();
        CallableStatement myCall = con.prepareCall("{USP_SELECCIONAR_EMPLEADOS()}");
        ResultSet rs = myCall.executeQuery();
        Empleados empleados;

    }*/
}
