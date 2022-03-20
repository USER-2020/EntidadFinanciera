/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorClientes;
import java.util.Scanner;


/**
 *
 * @author unalman
 */
public class PrincipalClientes {
    ControladorClientes contrcli;         
            
    public PrincipalClientes() {
       contrcli = new ControladorClientes();
    }
    
    public void leerDatosCliente()
    {
        //Ejercicio deben insertar datos en el arreglo.
        Scanner capturadatos = new Scanner (System.in);
        System.out.println("Nombre usuario: - ");
        String nombre = capturadatos.next();
        System.out.println("Apellido usuario: - ");
        String apellido = capturadatos.next();
        System.out.println("Direccion: - ");
        String direccion = capturadatos.next();
        
    }
    
    public void menu()
    {
        int opc=0;
        System.out.println("Menu Insertar datos de Clientes");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        switch(opc)
        {
            case   0:
                leerDatosCliente();
            default :
        }
                
    }
    
}
