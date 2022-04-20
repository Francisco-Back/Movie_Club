/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazada;

import ApiPeliculas.ApiCartelera;
import Modelo.Pelicula;

/**
 *
 * @author Francisco Back
 */
public class Nodo {
    // se crea los parametros para el nodo
Pelicula Dato;
Nodo siguiente;


//se crea el constructor del nodo
public Nodo(Pelicula dato){
     Dato=dato;
     siguiente=this;
}
        
        




   
}
