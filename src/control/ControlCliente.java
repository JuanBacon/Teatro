/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Cliente;

/**
 *
 * @author Alejo
 */
public class ControlCliente {

    public LinkedList<Cliente> consultarClientes() {
        String sql="Select * from clientes;";
        Cliente objc=new Cliente();
        LinkedList<Cliente> listc=objc.buscarclientes(sql);
        
        return listc;
    }
    
}
