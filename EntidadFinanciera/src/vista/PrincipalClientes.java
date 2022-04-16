/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorClientes;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Usuario;


/**
 *
 * @author unalman
 */
public class PrincipalClientes extends Usuario{
    ControladorClientes contrcli;         
            
    public PrincipalClientes() {
       contrcli = new ControladorClientes();
    }
    
    public void leerDatosCliente()
    {
        //Ejercicio deben insertar datos en el arreglo.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del usuario: ");
//        nombre = sc.nextLine();
//        System.out.println("Ingrese el apellido del usuario: ");
//        apellido = sc.nextLine();
//        System.out.println("Ingrese la direccion del usuario: ");
//        direccion = sc.nextLine();
//        System.out.println("Ingrese el telefono del usuario: ");
//        telefono = sc.nextInt();
//        System.out.println("Ingrese el correo del usuario: ");
//        correo = sc.nextLine();
//        System.out.println("Ingrese la cedula del usuario: ");
//        cedula = sc.nextInt();
//        ArrayList<String> lista1 = new ArrayList<String>();
//        lista1.add(nombre);
//        lista1.add(apellido);
//        lista1.add(direccion);
//        lista1.add(telefono, nombre);
//        lista1.add(correo);
//        lista1.add(cedula, nombre);
//          this.nombre = nombre;
//          this.apellido = apellido;
//          this.cedula = cedula;
//          this.correo = correo;
//          this.telefono = telefono;
          //contrcli.insertar(this.nombre, this.apellido, this.cedula, this.correo, this.direccion, this.telefono);//porque no sirve llenar el objeto asi?
          contrcli.insertar(nombre = "Juan");
          contrcli.insertar(apellido = "Zuluaga");
          contrcli.insertar(cedula = 1053863921);
          contrcli.insertar(direccion = "Cra 14");
          contrcli.insertar(telefono = 305714941);
    }
    
    public void menu()
    {
        int opc=1;
        System.out.println("Menu Insertar datos de Clientes");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        switch(opc)
        {
            case   1:
                leerDatosCliente();
            default :
                
            case 2:
                
        }
                
    }
    
}
