/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Admin;
/**
 *
 * @author Juan Fernando Zuluaga
 */
public class ControladorUsuariosSistema {
    Admin admin = new Admin(1053863921, "1234");
    
    public boolean autenticar(int idusuario, String contrasena){
        System.out.println(idusuario);
        System.out.println(contrasena);
        System.out.println(admin.getCedula());
        System.out.println(admin.getContrasena());
        
        if(admin.getCedula() == idusuario && admin.getContrasena().equals(contrasena))
            return true;
        else
            return false;
    }
}
