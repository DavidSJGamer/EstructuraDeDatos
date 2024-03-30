/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import modelos.Estudiante;
/**
 *
 * @author Admin
 */
public class ListaEnlazada {
    private Nodo cabeza;
    private Nodo cola;
    
    public ListaEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }
    public boolean estaVacia(){
        return cabeza == null;
    }

    public void agregarAlFinal(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;           
        }
    }
    public void agregarAlInicio(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;           
        }
    }

    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia.");
        }
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
    
    public void removerListaAlInicio() {
        if (!estaVacia()) {
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
            } else {
                cola = null;
            }
        }
    }
    
    public void removerListaAlFinal() {
        if (!estaVacia()) {
            cola = cola.getAnterior();
            if (cola != null) {
                cola.setSiguiente(null);
            } else {
                cabeza = null;
            }
        }
    }
}
