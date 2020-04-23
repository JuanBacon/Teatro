/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alejo
 */
public class Genero {
    
    private int idGenero;
    private String nombreGenero;

    public Genero() {
    }

    public Genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public Genero(int idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
    }

    /**
     * Get the value of nombreGenero
     *
     * @return the value of nombreGenero
     */
    public String getNombreGenero() {
        return nombreGenero;
    }

    /**
     * Set the value of nombreGenero
     *
     * @param nombreGenero new value of nombreGenero
     */
    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }


    /**
     * Get the value of idGenero
     *
     * @return the value of idGenero
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * Set the value of idGenero
     *
     * @param idGenero new value of idGenero
     */
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "idGenero=" + idGenero + ", nombreGenero=" + nombreGenero + '}';
    }

}
