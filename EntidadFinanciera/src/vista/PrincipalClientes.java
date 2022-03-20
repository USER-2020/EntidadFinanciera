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
        String datosUsuarios[] = {"Juan", "Zulauaga", "Cra.14 # 47 F 35", "3057149417","juanfernandozuluaga2014310@gmail.com","1053863921"};
        System.out.println("Los datos son"+datosUsuarios);
        
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
