/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author unalman
 */
/*CRUD
  Create - Insertar o crear datos
  Read   - Leer o obtener datos
  Update - Modifcar o acturalizar datos
  Delete - borrar Datos
  Interfaz - Interfaz es una clase donde TODOS
  los métodos son abstractos - solo tienen la firma
  las clases que la implementes deben colocar el comportamiento
  o la funcionalidad del metodo
*/
public interface CRUD {
    public boolean insertar(Object obj);
    public Object  modificar(Object obj);
    public boolean borrar(Object obj);
    public Object consultarUno(Object obj);
    
}
