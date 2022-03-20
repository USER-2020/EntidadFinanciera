/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Fernando
 *         Zuluaga Aguirre
 */
public class Cliente extends Usuario {
    private CuentaAhorros cuentaAho;
    private CuentaCorriente cuentaCorr;

    public Cliente(String nombre, String apellido, String direccion, int telefono, String correo, int cedula) {
        super(nombre, apellido, direccion, telefono, correo, cedula);
    }

    public Cliente() {
    }

   
    
    
    
}
