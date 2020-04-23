/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejo
 */
public class Clasificacion {

    private int idClasificacion;
    private String publico;
    private String clasificacion;

    public Clasificacion() {
    }

    public Clasificacion(int idClasificacion, String publico, String clasificacion) {
        this.idClasificacion = idClasificacion;
        this.publico = publico;
        this.clasificacion = clasificacion;
    }

    /**
     * Get the value of clasificacion
     *
     * @return the value of clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * Set the value of clasificacion
     *
     * @param clasificacion new value of clasificacion
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Get the value of publico
     *
     * @return the value of publico
     */
    public String getPublico() {
        return publico;
    }

    /**
     * Set the value of publico
     *
     * @param publico new value of publico
     */
    public void setPublico(String publico) {
        this.publico = publico;
    }

    /**
     * Get the value of idClasificacion
     *
     * @return the value of idClasificacion
     */
    public int getIdClasificacion() {
        return idClasificacion;
    }

    /**
     * Set the value of idClasificacion
     *
     * @param idClasificacion new value of idClasificacion
     */
    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "idClasificacion=" + idClasificacion + ", publico=" + publico + ", clasificacion=" + clasificacion + '}';
    }

    public LinkedList<Clasificacion> consultarClasificaciones(String sql) {
        LinkedList<Clasificacion> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idClasificacion1 = 0;
        String clasificacion1 = "";
        String publico1 = "";
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idClasificacion1 = rs.getInt("idClasificacion");
                    publico1 = rs.getString("publico");
                    clasificacion1 = rs.getString("clasificacion");
                    lc.add(new Clasificacion(idClasificacion1, publico1, clasificacion1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Clasificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;

    }

}
