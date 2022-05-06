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
public class CuentaCorriente implements Comparable<CuentaCorriente>{
    
    private String idCuentaCorriente;
    private float  saldoCuentaCorriente;
    private int cedulaUsuario;

    public String getIdCuentaCorriente() {
        return idCuentaCorriente;
    }

    public void setIdCuentaCorriente(String idCuentaCorriente) {
        this.idCuentaCorriente = idCuentaCorriente;
    }

    public float getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public void setSaldoCuentaCorriente(float saldoCuentaCorriente) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    @Override
    public int compareTo(CuentaCorriente o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//   public void setSaldoCuentaCorriente(float parseFloat){
//       throw new
//   }
    
    
}
