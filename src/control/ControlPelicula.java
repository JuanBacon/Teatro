/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Pelicula;

/**
 *
 * @author Alejo
 */
public class ControlPelicula {

    public boolean insertarPelicula(Pelicula objp) {
        boolean t=false;
        Pelicula objp2=new Pelicula();
        String sql="";
        sql="INSERT INTO peliculas (nombrePelicula,duracionp,fechaEstrenop,fotopelicula,idPaisf,idClasificacionf) VALUES(?,?,?,?,?,?)";
        t=objp2.insertarPelicula(objp, sql);
        return t;
    }
    
}
