/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorClientes;
import static controlador.ControladorClientes.arregloClientes;
import java.util.Scanner;
import modelo.Cliente;

import modelo.Usuario;


/**
 *
 * @author Juan Fernando Zuluaga
 */

public class PrincipalClientes extends Usuario{
    ControladorClientes contrcli;   
    Scanner sc;
   
      
      // OJOOOO
      
   
    public PrincipalClientes() {
       contrcli = new ControladorClientes(); //instancia de clase Inicialiacion
       sc = new Scanner(System.in); //Intancia de clase Inicializacion
    }
    
    public void leerDatosCliente()
    {
        //Ejercicio deben insertar datos en el arreglo.
        Cliente cli = new Cliente();
        System.out.println("Ingrese el nombre del usuario: ");
        cli.setNombre(sc.next());
        System.out.println("Ingrese el apellido del usuario: ");
        cli.setApellido(sc.next());
        System.out.println("Ingrese la direccion del usuario: ");
        cli.setDireccion(sc.next());
        System.out.println("Ingrese el correo del usuario: ");
        cli.setCorreo(sc.next());
        System.out.println("Ingrese el telefono del usuario: ");
        cli.setTelefono(sc.nextInt());
        System.out.println("Ingrese la cedula del usuario: ");
        cli.setCedula(sc.nextInt());
       
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
          //Validacion
          if (!contrcli.insertar(cli)) {
              System.out.println("Error en la insertada de datos");
        }else{
              System.out.println("Cliente insertado satisfactoriamente");
          }
          
          
//          contrcli.insertar(nombre);
//          contrcli.insertar(apellido);
//          contrcli.insertar(cedula);
//          contrcli.insertar(direccion);
//          contrcli.insertar(telefono);
          
          
       
          
    }   
    
    public void consultar(){
        System.out.println("Digite la cedula que desea mostrar");
        Cliente cli = new Cliente(sc.nextInt());
        int pos = contrcli.consultarUno(cli);
        System.out.println(arregloClientes.get(pos).toString());
    }
    
    public void modificarcli(){
        System.out.println("Digite la cedula del cliente que quiere modificar> ");
        Cliente cli = new Cliente(sc.nextInt());
        
        while (1 > 0)
        {
            contrcli.modificar(cli);
            System.out.println("Desea modificar otro dato del cliente ?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opc = 2;
            opc = sc.nextInt();
            switch(opc)
            {
                case 1:
                    continue;
                default:
                    System.out.println("Error en la modificacion del cliente");
                    break;
                    
            }
            break;
        }
    }
    
    public void borrarcli(){
        System.out.println("Digite la cedula del cliente que desea eliminar del sistema");
        Cliente cli = new Cliente(sc.nextInt());
        contrcli.borrar(cli);
    }
    
    public void ordenar(){
        contrcli.ordenarDatos();
    }
    
    
    
    public void mostrarTodos(){
        contrcli.mostrar();
    }
    
    public void ordenarNom(){
        contrcli.quicksort(0,contrcli.arregloClientes.size()-1);
    }
    
    public void ordenarCed(){
        contrcli.quicksortcedula(cedula, cedula);
    }
    
    public void menu()
    {
        int opc=0;
        System.out.println("MENU PORTAL CLIENTES");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Consultar todos los clientes");
        System.out.println("6. Ordenar clientes por nombre");
        System.out.println("7. Ordenar clientes por cedula");
        System.out.println("Ingrese la opcion: ");
        opc = sc.nextInt();
        switch(opc)
        {
            case 1:
                leerDatosCliente();
            break;
            case 2:
                consultar();
            break;
            case 3:
                modificarcli();
            break;
            case 4:
                borrarcli();
            break;
            case 5:
                mostrarTodos();
            break;
            case 6:
                ordenarNom();
            break;
            case 7:
                ordenarCed();
            break;
            default:
                System.exit(0);
                System.out.println("Opcion no valida en este menu");
            break;
            
                
        }
        
        
       
     
    }
    
  
 
}

