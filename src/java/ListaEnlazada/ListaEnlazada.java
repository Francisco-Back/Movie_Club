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
    private Nodo Primero, Ultimo,Actual;
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
     } else{
         Primero=Ultimo=new Nodo(Dato);
     }
    }
        
        //Mostrar la lista
        public Nodo Obtener_Lista_D(Nodo NLista){
           
                Actual=NLista;
                if(Actual==null){
                Actual=Primero;
                }else{
                  Actual=Actual.siguiente;
                    
                }
               
            return Actual;
        }
        
        
        public Pelicula Recorrer_Lista_D(){
            Actual=Obtener_Lista_D(Actual);
            return Actual.Dato;
        }
        //Mostrar la lista
        public Nodo Obtener_Lista_I(Nodo NLista){
           
                Actual=NLista;
                if(Actual==null){
                Actual=Ultimo;
                }else{
                  Actual=Actual.anterior;
                    
                }
               
            return Actual;
        }
        
        
        public Pelicula Recorrer_Lista_I(){
            Actual=Obtener_Lista_I(Actual);
            return Actual.Dato;
        }
        
        public void Recorrer(){
            if(!Vacia()){
                String s="<=>";
                Actual=Primero;
                while (Actual!=null) {                    
                    s=s+"["+ Actual.Dato+"]<=>\n";
                     System.out.println(s);
                    Actual=Actual.siguiente;
                   
                }
            }
        }
        
        
    
}
