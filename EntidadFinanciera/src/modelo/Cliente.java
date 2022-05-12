/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Fernando Zuluaga
 */
public class Cliente extends Usuario implements Comparable<Cliente>{
    
    int idCuenta;
    private CuentaAhorros cuentaAho;
    private CuentaCorriente cuentaCorr;

     public Cliente(String nombre, String apellido, String direccion, int telefono, String correo, int cedula) {
        super(nombre, apellido, direccion, telefono, correo, cedula);
    }

  
    public Cliente(int idCuenta, CuentaAhorros cuentAho, CuentaCorriente cuentaCorr, int cedula, String contrasena) {
      super (cedula, contrasena);
      this.idCuenta = idCuenta;
      this.cuentaAho = cuentaAho;
      this.cuentaCorr = cuentaCorr;
          
      
      
    }

    public Cliente(int idCuenta, CuentaAhorros cuentaAho, CuentaCorriente cuentaCorr, String nombre, String apellido, String direccion, int telefono, String correo, int cedula) {
        super(nombre, apellido, direccion, telefono, correo, cedula);
        this.idCuenta = idCuenta;
        this.cuentaAho = cuentaAho;
        this.cuentaCorr = cuentaCorr;
    }

    public Cliente(int idCuenta, CuentaAhorros cuentaAho, CuentaCorriente cuentaCorr) {
        this.idCuenta = idCuenta;
        this.cuentaAho = cuentaAho;
        this.cuentaCorr = cuentaCorr;
    }

   public Cliente (int cedula){
       this.cedula = cedula;
       
   }
   
   public Cliente(){
       //Contructor vacio sirve para inicializar la variable
   }
   
   public Cliente (String text, String text0, String text1, int parseInt, String text3, String text4, String text5){
       
   }

    public Cliente(String text, String text0, String text1, int parseInt, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
   @Override
   public int compareTo(Cliente c){
       return (this.getCedula() < c.getCedula()? -1:
               (this.getCedula() == c.getCedula()? 0 : 1));
       //Nos sirve para organizar cuando vayamos a utilizar el metodo Collections.sort(arreglo) en ControladorClientes
   }

    

   
 
   

   
    
    
    
}
