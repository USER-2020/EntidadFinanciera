/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.CuentaCorriente;

/**
 *
 * @author Juan Fernando Zuluaga
 */
public class ControladorCuentasCorrientes implements CRUD{
    
    ArrayList<CuentaCorriente>arregloCuentasCorr = new ArrayList<CuentaCorriente>();

    @Override
    public boolean insertar(Object obj) {
       boolean inserto = true;
       
       CuentaCorriente cuCor = new CuentaCorriente();
       cuCor = (CuentaCorriente)obj;
       for (CuentaCorriente c: arregloCuentasCorr)
           if(c.equals(cuCor))
           {
               return inserto = false;
           }
       
       if (inserto)
           arregloCuentasCorr.add(cuCor);
       return inserto;
    }

    @Override
    public void modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int consultarUno(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quicksort(int izq, int der) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quicksortcedula(int izq, int der) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
