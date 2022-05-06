/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Juan Fernando Zuluaga
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
    public void  modificar(Object obj);
    public void borrar(Object obj);
    public int consultarUno(Object obj);
    public void mostrar();
    public void ordenarDatos();
    
    public void quicksort(int izq, int der);
    public void quicksortcedula(int izq, int der);
    
}
