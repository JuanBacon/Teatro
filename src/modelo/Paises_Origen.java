/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejo
 */
public class Paises_Origen {
    
    private int idPais;
    private String Pais_Origen;

    public Paises_Origen() {
    }

    public Paises_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public Paises_Origen(int idPais, String Pais_Origen) {
        this.idPais = idPais;
        this.Pais_Origen = Pais_Origen;
    }

    /**
     * Get the value of Pais_Origen
     *
     * @return the value of Pais_Origen
     */
    public String getPais_Origen() {
        return Pais_Origen;
    }

    /**
     * Set the value of Pais_Origen
     *
     * @param Pais_Origen new value of Pais_Origen
     */
    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }


    /**
     * Get the value of idPais
     *
     * @return the value of idPais
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Set the value of idPais
     *
     * @param idPais new value of idPais
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "Paises_Origen{" + "idPais=" + idPais + ", Pais_Origen=" + Pais_Origen + '}';
    }

    public LinkedList<Paises_Origen> consultarPaisOrigen(String sql) {
         LinkedList<Paises_Origen> lpais = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idPais1 = 0;
        String Pais_Origen1 = "";
        
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idPais1 = rs.getInt("idPais");
                    Pais_Origen1 = rs.getString("Pais_Origen");
                    
                    lpais.add(new Paises_Origen(idPais1, Pais_Origen1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Clasificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lpais;
    }

}
