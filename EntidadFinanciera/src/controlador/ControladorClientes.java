/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author Juan Fernando 
 *         Zuluaga Aguirre
 */
public class ControladorClientes implements CRUD{
    public static ArrayList<Cliente> arregloClientes;

    public ControladorClientes() {
        arregloClientes = new ArrayList<Cliente>();
    }
    
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto=true;
        
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        for(Cliente c: arregloClientes)
            if(c.equals(cli))
            {
               return inserto=false;
            }
            
        if(inserto)    
         arregloClientes.add(cli);
        
        return inserto;
        
    }

    @Override
    public Object modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultarUno(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
