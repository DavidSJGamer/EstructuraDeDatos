/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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

    public void insertarAlFinal(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    public String mostrar() {
        StringBuilder resultado = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            resultado.append(actual.getDato()).append("\n");
            actual = actual.siguiente;
        }
        return resultado.toString();
    }
}
