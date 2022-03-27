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
public class ListaEnlazada {
    //Creamos la varriables de tipo Nodo
    public Nodo Primero, Ultimo,Actual;
    int cont=0;
    //iniciamos los metodos
    
    
    public ListaEnlazada(){
        Primero=Ultimo=null;
    }
    public boolean Vacia(){
        return Primero==null;
    }
    public void AgregarUltimo(Pelicula Dato){
     if(!Vacia())  {
         Ultimo=new Nodo(Dato,null,Ultimo);
         Ultimo.anterior.siguiente=Ultimo;
     } else{
         Primero=Ultimo=new Nodo(Dato);
         
     }
    }

        public void AgregarPrimero(Pelicula Dato){
     if(!Vacia())  {
         Primero=new Nodo(Dato, Primero,null);
         Primero.siguiente.anterior=Primero;
             cont++;
     } else{
         Primero=Ultimo=new Nodo(Dato);
             cont++;
     }
    }
        
        //Mostrar la lista
        
        public void Recorrer(){
            if(!Vacia()){
                String s="<=>";
                Actual=Primero;
                System.out.println("Metodo lista Recorrer");
                while (Actual!=null) {                    
                    s=s+"["+ Actual.Dato+"]<=>\n";
                    
                    Actual=Actual.siguiente;
                   
                }
                 System.out.println(s);
            }else{
                System.out.println("Lista Vacia");
            }
        }
        
           public Pelicula Recorrer_T(){
            if(!Vacia()){
                Actual=Primero;
                return Actual.Dato;
                
            }
            if(Actual!=null){
                   Actual=Actual.siguiente;
                
            return Actual.Dato;
                
                }else{
                return null;
            }
        }

   
        
        
    
}
