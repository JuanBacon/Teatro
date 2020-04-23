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
public class Silla {
    
    private String numerosilla;
    private int estadoSilla;
    private int idSalasf;

    public Silla() {
    }

    public Silla(String numerosilla, int estadoSilla, int idSalasf) {
        this.numerosilla = numerosilla;
        this.estadoSilla = estadoSilla;
        this.idSalasf = idSalasf;
    }

    /**
     * Get the value of idSalasf
     *
     * @return the value of idSalasf
     */
    public int getIdSalasf() {
        return idSalasf;
    }

    /**
     * Set the value of idSalasf
     *
     * @param idSalasf new value of idSalasf
     */
    public void setIdSalasf(int idSalasf) {
        this.idSalasf = idSalasf;
    }


    /**
     * Get the value of estadoSilla
     *
     * @return the value of estadoSilla
     */
    public int getEstadoSilla() {
        return estadoSilla;
    }

    /**
     * Set the value of estadoSilla
     *
     * @param estadoSilla new value of estadoSilla
     */
    public void setEstadoSilla(int estadoSilla) {
        this.estadoSilla = estadoSilla;
    }

    

    /**
     * Get the value of numerosilla
     *
     * @return the value of numerosilla
     */
    public String getNumerosilla() {
        return numerosilla;
    }

    /**
     * Set the value of numerosilla
     *
     * @param numerosilla new value of numerosilla
     */
    public void setNumerosilla(String numerosilla) {
        this.numerosilla = numerosilla;
    }

}
