/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Paises_Origen;

/**
 *
 * @author Alejo
 */
public class ControlPaises_Origen {

    public LinkedList<Paises_Origen> consultarPaises() {
        LinkedList<Paises_Origen> listapo = new LinkedList<>();
        Paises_Origen objclasi = new Paises_Origen();
        String sql = "select * from paises_origen;";
        listapo = objclasi.consultarPaisOrigen(sql);
        return listapo;
        
        
    }
    
}
