/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class ListaPila {
    PilaNodo top;
    int tamano;
    public ListaPila(){
        top = null;
        tamano = 0;   
    }
    
    public boolean estaVacia(){
        return top == null;
    }
    
    public int obtenerTamano(){
        return tamano;
    }
    
    public void push (int dato){
        PilaNodo nuevoNodo = new PilaNodo(dato);
        if(top == null){
            top = nuevoNodo;
        }else{
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
    }
    
    public int pop()throws Exception{
        if(estaVacia()){
            throw new Exception("La pila esta vacia");
        }
        int dato = top.dato;
        top = top.siguiente;
        tamano--;
        return dato;
    }
    
    public int peek()throws Exception{
        if(estaVacia()){
          throw new Exception("La pila esta vacia");  
        }
        return top.dato;
    }
}
