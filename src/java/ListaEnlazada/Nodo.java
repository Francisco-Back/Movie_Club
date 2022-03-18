/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazada;

import Modelo.Pelicula;

/**
 *
 * @author Francisco Back
 */
public class Nodo {
    // se crea los parametros para el nodo
   public Pelicula Dato;
   Nodo siguiente;
   Nodo anterior;
 
//se crea el constructor de nodo
    public Nodo(Pelicula Dato, Nodo siguiente, Nodo anterior) {
        this.Dato = Dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    // por si la lista esta vacia 
      public Nodo(Pelicula Dato){
       this(Dato,null,null);
   }



   
}
