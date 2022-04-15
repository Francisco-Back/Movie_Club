/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import ApiPeliculas.ApiCartelera;

/**
 *
 * @author Francisco Back
 */
public class Pelicula {

   public String NOriginal;
   public String NPelicula;
   public String Resena;
   public String Sinopsis;
   public String Imagen;

   
   
   public Pelicula(){
       
   }

    public Pelicula(String NOriginal, String NPelicula, String Resena, String Sinopsis, String Imagen) {
        this.NOriginal = NOriginal;
        this.NPelicula = NPelicula;
        this.Resena = Resena;
        this.Sinopsis = Sinopsis;
        this.Imagen = Imagen;
    }


    public String getNOriginal() {
        return NOriginal;
    }

    public void setNOriginal(String NOriginal) {
        this.NOriginal = NOriginal;
    }

    public String getNPelicula() {
        return NPelicula;
    }

    public void setNPelicula(String NPelicula) {
        this.NPelicula = NPelicula;
    }

    public String getResena() {
        return Resena;
    }

    public void setResena(String Resena) {
        this.Resena = Resena;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "NOriginal=" + NOriginal + ", NPelicula=" + NPelicula + ", Resena=" + Resena + ", Sinopsis=" + Sinopsis + ", Imagen=" + Imagen + '}';
    }

   
   
  
    
    
    
}
