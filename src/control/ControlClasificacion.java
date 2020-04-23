/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import modelo.Clasificacion;

/**
 *
 * @author Alejo
 */
public class ControlClasificacion {

    public LinkedList<Clasificacion> consultarClasificaciones(){
        LinkedList<Clasificacion> listac = new LinkedList<>();
        Clasificacion objclasi = new Clasificacion();
        String sql = "select * from clasificaciones;";
        listac = objclasi.consultarClasificaciones(sql);
        return listac;
    }

}
