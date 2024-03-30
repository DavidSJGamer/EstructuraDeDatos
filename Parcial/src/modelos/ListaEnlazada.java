/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Admin
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregarAlFinal(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    public void imprimirLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }

    public void eliminarEstacion(String estacion) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.getDato().equals(estacion)) {
            cabeza = cabeza.getSiguiente();
            return;
        }
        Nodo anterior = cabeza;
        while (anterior.getSiguiente() != null && !anterior.getSiguiente().getDato().equals(estacion)) {
            anterior = anterior.getSiguiente();
        }
        if (anterior.getSiguiente() != null) {
            anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
        }
    }
}
