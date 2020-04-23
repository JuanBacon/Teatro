/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Alejo
 */
public class Cliente {

    private String identificacionc;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String telefonoc;
    private String direccionc;

    public Cliente() {
    }

    public Cliente(String identificacionc, String nombre1, String apellido1) {
        this.identificacionc = identificacionc;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
    }

    public Cliente(String identificacionc, String nombre1, String nombre2, String apellido1, String apellido2, String telefonoc, String direccionc) {
        this.identificacionc = identificacionc;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefonoc = telefonoc;
        this.direccionc = direccionc;
    }

    /**
     * Get the value of direccionc
     *
     * @return the value of direccionc
     */
    public String getDireccionc() {
        return direccionc;
    }

    /**
     * Set the value of direccionc
     *
     * @param direccionc new value of direccionc
     */
    public void setDireccionc(String direccionc) {
        this.direccionc = direccionc;
    }

    /**
     * Get the value of telefonoc
     *
     * @return the value of telefonoc
     */
    public String getTelefonoc() {
        return telefonoc;
    }

    /**
     * Set the value of telefonoc
     *
     * @param telefonoc new value of telefonoc
     */
    public void setTelefonoc(String telefonoc) {
        this.telefonoc = telefonoc;
    }

    /**
     * Get the value of apellido2
     *
     * @return the value of apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Set the value of apellido2
     *
     * @param apellido2 new value of apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Get the value of apellido1
     *
     * @return the value of apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Set the value of apellido1
     *
     * @param apellido1 new value of apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Get the value of nombre2
     *
     * @return the value of nombre2
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * Set the value of nombre2
     *
     * @param nombre2 new value of nombre2
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    /**
     * Get the value of nombre1
     *
     * @return the value of nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * Set the value of nombre1
     *
     * @param nombre1 new value of nombre1
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * Get the value of identificacionc
     *
     * @return the value of identificacionc
     */
    public String getIdentificacionc() {
        return identificacionc;
    }

    /**
     * Set the value of identificacionc
     *
     * @param identificacionc new value of identificacionc
     */
    public void setIdentificacionc(String identificacionc) {
        this.identificacionc = identificacionc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identificacionc=" + identificacionc + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", telefonoc=" + telefonoc + ", direccionc=" + direccionc + '}';
    }

    public LinkedList<Cliente> buscarclientes(String sql) {
        ResultSet rs = null;
        LinkedList<Cliente> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        String idc;
        String nombre1c;
        String nombre2c="";
        String apellido1c;
        String apellido2c="";
        String telefonoc1="";
        String direccionc1="";
        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getNString("identificacionc");
                    nombre1c = rs.getNString("nombre1");
                    try {
                        nombre2c = rs.getString("nombre2");
                    } catch (NullPointerException n) { }
                    if(nombre2c==null){
                        nombre2c = "";
                    }
                    
                    apellido1c = rs.getString("apellido1");
                     try {
                        apellido2c = rs.getString("apellido2");
                    } catch (NullPointerException n) { }
                    if(apellido2c==null){
                        apellido2c = "";
                    }
                    try {
                        telefonoc1 = rs.getString("telefonoc");
                    } catch (NullPointerException n) { }
                    if(telefonoc1==null){
                        telefonoc1 = "";
                    }
                    try {
                        direccionc1 = rs.getString("direccionc");
                    } catch (NullPointerException n) { }
                    if(direccionc1==null){
                        direccionc1 = "";
                    }
                 
                    lc.add(new Cliente(idc, nombre1c, nombre2c, apellido1c, apellido2c, telefonoc1, direccionc1));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }

}
