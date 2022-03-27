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
   Pelicula Dato;
   Nodo siguiente;
   Nodo anterior;
    // por si la lista esta vacia 
      public Nodo(Pelicula Dato){
       this(Dato,null,null);
   }
//se crea el constructor de nodo
    public Nodo(Pelicula Envio, Nodo D, Nodo I) {
        Dato = Envio;
        siguiente = D;
        anterior = I;
    }




   
}
