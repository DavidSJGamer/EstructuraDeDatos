/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class ListaDobleEnlazada {

    private Nodo cabeza;
    private Nodo cola;

    public ListaDobleEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarAlFinal(char dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null)
        {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else
        {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}
