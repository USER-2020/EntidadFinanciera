/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import modelo.Cliente;


/**
 *
 * @author Juan Fernando Zuluaga
 */
public class ControladorClientes implements CRUD{
    
    public static ArrayList<Cliente> arregloClientes;
    Scanner sc; //leer datos desde el teclado
  

    public ControladorClientes() {
        arregloClientes = new ArrayList<Cliente>();
        
    }
    
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto=true;
        
        Cliente cli = new Cliente(); //Instancia de cliente 
        cli = (Cliente)obj; //Creacion de objeto Cliente
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
    public void modificar(Object obj) {

        sc = new Scanner(System.in);//leer datos
        Cliente cli = new Cliente();//Inicializacion instancia de cliente
        cli=(Cliente)obj;//Creacion objeto Cliente
        Collections.sort(arregloClientes);
        int pos = (Collections.binarySearch(arregloClientes, cli,null));
        if(pos < 0)
            pos = (pos * -1)-1;
            System.out.println("Este es el cliente que desea modificar ");
            System.out.println(arregloClientes.get(pos).toString());
            System.out.println("Que dato desea modificar:");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Direccion");
            System.out.println("4. Telefono");
            System.out.println("5. Correo");
            System.out.println("RECUERDE QUE SU NUMERO DE IDENTIFICACION ES UNICO, INSTRANSFERIBLE Y NO ES MODIFICABLE");
            int opc = 0;
            opc = sc.nextInt();
            switch(opc)
            {
                case 1:
                    System.out.println("Introduzca el nuevo nombre");
                    arregloClientes.get(pos).setNombre(sc.next());
                    break;
                
                case 2:
                    System.out.println("Introduzca el nuevo apellido");
                    arregloClientes.get(pos).setApellido(sc.next());
                    break;
                
                case 3:
                    System.out.println("Introduzca la nueva direccion");
                    arregloClientes.get(pos).setDireccion(sc.next());
                    break;
                 
                case 4:
                    System.out.println("Introduzca el nuevo telefono");
                    arregloClientes.get(pos).setTelefono(sc.nextInt());
                    break;
                    
                case 5:
                    System.out.println("Introduzca el nuevo correo");
                    arregloClientes.get(pos).setCorreo(sc.next());
                    break;
                
                default:
                    System.out.println("Fallas en el sistema");
                    break;
            }
            System.out.println("CLIENTE MODIFICADO: ");
            System.out.println(arregloClientes.get(pos).toString());//muestra el usuario ya modificado en un ToStirng()
    }

    @Override
    public void borrar(Object obj) {
        sc = new Scanner(System.in);
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        Collections.sort(arregloClientes);
        //Arreglar primero en colecciones mostrando todo en orden y en un arreglo <arregloClientes>
        int pos = (Collections.binarySearch(arregloClientes, cli,null));
        if (pos < 0)
            pos = (pos *-1)-1;
        System.out.println("Este es el cliente que desea borrar ");
        System.out.println(arregloClientes.get(pos).toString());
        System.out.println("Esta seguro de borrar el cliente ?");
        System.out.println("1. Si");
        System.out.println("2. No");
        
            int opc = 0;
           opc = sc.nextInt();
           switch(opc)
           {
               case 1:
                   arregloClientes.remove(pos);
                   System.out.println("Cliente borrado");
                   break;
                   
               case 2:
                   break;
               default:
                   System.out.println("Error en el sistema");
                   break;
           }
        
    }

    @Override
    public int consultarUno(Object obj) {
        //busqueda binaria, posicion donde estaba el dato ya que el sistema
        //lo pide desde el principio como parametro o precondicion
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        Collections.sort(arregloClientes);
        int pos = (Collections.binarySearch(arregloClientes, cli, null));
        if (pos < 0)
            pos = (pos*-1)-1;
        System.out.println(arregloClientes.get(pos).toString()); //Cuidado con esto preguntar si se puede mostrar despues de el return o antes
        return pos;
        
    }
    
    @Override
    public void mostrar()
    {
        for(Cliente c:arregloClientes)
           System.out.println(c.toString());//Aparece todo en un array ToString
    }

    @Override
    public void ordenarDatos() {
        
        Collections.sort(arregloClientes);
    }

    @Override
    public void quicksort(int izq, int der) {
        Cliente pivote = arregloClientes.get(izq);
        //Se tiena en cuenta la posicion de este cliente como pivote para moverlo e ir utilizando laposcion izq y moverse
        //hacia esa direccion en el arreglo <arregloClientes>
        
        //Tomamos primer elemento como pivote
        
       int i=izq;   //i realiza la busqueda de izquierda a derecha 
       int j=der;   //j realiza la busqueda de derecha a izquierda
       Cliente aux; //Se utiliza para ubicar una posicion mientras se organiza los datos
                    //se tuliza como comodin en los movimientos del arreglo
                    
       while(i < j)
       {
           //Mientras no se crucen las busquedas va a buscar el elemnto mayor que el cliente pivote
           //while(<[pos[i]> <= pivote && i < j) i++
           while(arregloClientes.get(i).getNombre().compareToIgnoreCase(pivote.getNombre())<=0 && i < j) i++;
           //while(<[pos[j]]> > pivote) j--
           while(arregloClientes.get(j).getNombre().compareToIgnoreCase(pivote.getNombre())>0)j--;
         
       //Busca elemnto menor que el pivote
       if(i < j)
       {
           //Mientrass no se crucen las busquedas los intercambia de lugar en el arreglo
           aux = arregloClientes.get(i);
           arregloClientes.set(i, arregloClientes.get(j));
           arregloClientes.set(i, aux);
       }     
       }
       
       arregloClientes.set(izq, arregloClientes.get(j));
       //Se coloca el pivote en su lugar de fomra que tendremos los menores y los mayores a su izquierda y a su derecha respectivamente
       //<?>[j] = pivote;
       arregloClientes.set(j, pivote);
       if(izq < j-1)
           quicksort(izq, j-1);     // Ordenamos subarray izquierdo
       if(j+1 < der)
           quicksort(j+1, der);     // Ordenamos subarray derecho 
       
    }

    @Override
    public void quicksortcedula(int izq, int der) {
        Cliente pivote = arregloClientes.get(izq);
        
        
       int i=izq;   //i realiza la busqueda de izquierda a derecha 
       int j=der;   //j realiza la busqueda de derecha a izquierda
       Cliente aux; //Se utiliza para ubicar una posicion mientras se organiza los datos
                    //se tuliza como comodin en los movimientos del arreglo
                    
       while(i < j)
       {
           //Mientras no se crucen las busquedas va a buscar el elemnto mayor que el cliente pivote
           //while(<[pos[i]> <= pivote && i < j) i++
           while(arregloClientes.get(i).getCedula() < (pivote.getCedula())) i++;
           //while(<[pos[j]]> > pivote) j--
           while(arregloClientes.get(j).getCedula() > (pivote.getCedula())) j--;
         
       //Busca elemnto menor que el pivote
       if(i < j)
       {
           //Mientrass no se crucen las busquedas los intercambia de lugar en el arreglo
           aux = arregloClientes.get(i);
           arregloClientes.set(i, arregloClientes.get(j));
           arregloClientes.set(i, aux);
       }     
       }
       
       arregloClientes.set(izq, arregloClientes.get(j));
       //Se coloca el pivote en su lugar de fomra que tendremos los menores y los mayores a su izquierda y a su derecha respectivamente
       //<?>[j] = pivote;
       arregloClientes.set(j, pivote);
       if(izq < j-1)
           quicksort(izq, j-1);     // Ordenamos subarray izquierdo
       if(j+1 < der)
           quicksort(j+1, der);     // Ordenamos subarray derecho  
    }
    }
 

