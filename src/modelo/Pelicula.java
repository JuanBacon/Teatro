/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejo
 */
public class Pelicula {

    private int idPelicula;
    private String nombrePelicula;
    private String duracionp;
    private String fechaEstrenop;
    private String fotopelicula;
    private int idPaisf;
    private int idClasificacionf;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String nombrePelicula, String duracionp, String fechaEstrenop, String fotopelicula, int idPaisf, int idClasificacionf) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.duracionp = duracionp;
        this.fechaEstrenop = fechaEstrenop;
        this.fotopelicula = fotopelicula;
        this.idPaisf = idPaisf;
        this.idClasificacionf = idClasificacionf;
    }

    public Pelicula(String nombrePelicula, String duracionp, String fechaEstrenop, String fotopelicula, int idPaisf, int idClasificacionf) {
        this.nombrePelicula = nombrePelicula;
        this.duracionp = duracionp;
        this.fechaEstrenop = fechaEstrenop;
        this.fotopelicula = fotopelicula;
        this.idPaisf = idPaisf;
        this.idClasificacionf = idClasificacionf;
    }

    /**
     * Get the value of idClasificacionf
     *
     * @return the value of idClasificacionf
     */
    public int getIdClasificacionf() {
        return idClasificacionf;
    }

    /**
     * Set the value of idClasificacionf
     *
     * @param idClasificacionf new value of idClasificacionf
     */
    public void setIdClasificacionf(int idClasificacionf) {
        this.idClasificacionf = idClasificacionf;
    }

    /**
     * Get the value of idPaisf
     *
     * @return the value of idPaisf
     */
    public int getIdPaisf() {
        return idPaisf;
    }

    /**
     * Set the value of idPaisf
     *
     * @param idPaisf new value of idPaisf
     */
    public void setIdPaisf(int idPaisf) {
        this.idPaisf = idPaisf;
    }

    /**
     * Get the value of fotopelicula
     *
     * @return the value of fotopelicula
     */
    public String getFotopelicula() {
        return fotopelicula;
    }

    /**
     * Set the value of fotopelicula
     *
     * @param fotopelicula new value of fotopelicula
     */
    public void setFotopelicula(String fotopelicula) {
        this.fotopelicula = fotopelicula;
    }

    /**
     * Get the value of fechaEstrenop
     *
     * @return the value of fechaEstrenop
     */
    public String getFechaEstrenop() {
        return fechaEstrenop;
    }

    /**
     * Set the value of fechaEstrenop
     *
     * @param fechaEstrenop new value of fechaEstrenop
     */
    public void setFechaEstrenop(String fechaEstrenop) {
        this.fechaEstrenop = fechaEstrenop;
    }

    /**
     * Get the value of duracionp
     *
     * @return the value of duracionp
     */
    public String getDuracionp() {
        return duracionp;
    }

    /**
     * Set the value of duracionp
     *
     * @param duracionp new value of duracionp
     */
    public void setDuracionp(String duracionp) {
        this.duracionp = duracionp;
    }

    /**
     * Get the value of nombrePelicula
     *
     * @return the value of nombrePelicula
     */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    /**
     * Set the value of nombrePelicula
     *
     * @param nombrePelicula new value of nombrePelicula
     */
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    /**
     * Get the value of idPelicula
     *
     * @return the value of idPelicula
     */
    public int getIdPelicula() {
        return idPelicula;
    }

    /**
     * Set the value of idPelicula
     *
     * @param idPelicula new value of idPelicula
     */
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombrePelicula=" + nombrePelicula + ", duracionp=" + duracionp + ", fechaEstrenop=" + fechaEstrenop + ", fotopelicula=" + fotopelicula + ", idPaisf=" + idPaisf + ", idClasificacionf=" + idClasificacionf + '}';
    }

    public boolean insertarPelicula(Pelicula objp, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                File file = new File(objp.getFotopelicula());
                fis = new FileInputStream(file);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objp.getNombrePelicula());
                ps.setString(2, objp.getDuracionp());
                ps.setString(3, objp.getFechaEstrenop());
                ps.setBinaryStream(4, fis, (int) file.length());
                ps.setInt(5, objp.getIdPaisf());
                ps.setInt(6, objp.getIdClasificacionf());

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
    }

}
