/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import ApiPeliculas.ApiCartelera;
import ArbolBinBus.ArbolBinBus;

/**
 *
 * @author Francisco Back
 */
public class Pelicula {

 ApiCartelera Pelicula;
 ArbolBinBus ArbolB;

    public Pelicula() {
    }

    public Pelicula(ApiCartelera Pelicula, ArbolBinBus ArbolB) {
        this.Pelicula = Pelicula;
        this.ArbolB = ArbolB;
    }

    public ApiCartelera getPelicula() {
        return Pelicula;
    }

    public void setPelicula(ApiCartelera Pelicula) {
        this.Pelicula = Pelicula;
    }

    public ArbolBinBus getArbolB() {
        return ArbolB;
    }

    public void setArbolB(ArbolBinBus ArbolB) {
        this.ArbolB = ArbolB;
    }

   
   
  
  
    
    
    
}
