/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazada;

import Modelo.Pelicula;
import sun.net.www.content.text.plain;



/**
 *
 * @author Francisco Back
 */
public class ListaEnlazadaC {
    //Creamos la varriables de tipo Nodo
  Nodo ultimo,actual;
  public  ListaEnlazadaC(){
      ultimo=null;
      actual=null;
  }
  //metodo lista vacia
  public boolean Vacio(){
      return ultimo==null;
  }
  //metodo insertar
  public ListaEnlazadaC Ingresar(Pelicula Dato){
      Nodo Nuevo=new Nodo(Dato);
       if(ultimo!=null){
           Nuevo.siguiente=ultimo.siguiente;
           ultimo.siguiente=Nuevo;
       }
       ultimo=Nuevo;
       return this;
  }
  
  //metodo recorrer
  public void Recorrer(){
      actual=ultimo.siguiente;
      String D="";
     while(actual!=ultimo.siguiente){
         D=D+"["+ actual.Dato+"]";
     }
     
  }
    public Nodo Recorrer_T(){
      actual=ultimo.siguiente;
      String D="";
     while(actual!=ultimo.siguiente){
         D=D+"["+ actual.Dato+"]";
     }
     return actual;
     
  }
    
}
