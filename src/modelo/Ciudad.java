/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alejo
 */
public class Ciudad {
    
    private int idc;
    private String nombreC;

    public Ciudad() {
    }

    public Ciudad(int idc, String nombreC) {
        this.idc = idc;
        this.nombreC = nombreC;
    }

    public Ciudad(String nombreC) {
        this.nombreC = nombreC;
    }

    
    
    /**
     * Get the value of nombreC
     *
     * @return the value of nombreC
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Set the value of nombreC
     *
     * @param nombreC new value of nombreC
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }


    /**
     * Get the value of idc
     *
     * @return the value of idc
     */
    public int getIdc() {
        return idc;
    }

    /**
     * Set the value of idc
     *
     * @param idc new value of idc
     */
    public void setIdc(int idc) {
        this.idc = idc;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "idc=" + idc + ", nombreC=" + nombreC + '}';
    }

    public boolean insertCiudad(String sql) {
        boolean t=false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t= false;
            }
        }
        
        return t;
    }

    
}
