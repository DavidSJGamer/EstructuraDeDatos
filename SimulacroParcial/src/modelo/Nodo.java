/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DavidSJ
 */

public class Nodo {
    private Acertijos acertijo;
    private Nodo siguiente;

    public Nodo(Acertijos acertijo) {
        this.acertijo = acertijo;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Acertijos getAcertijo() {
        return acertijo;
    }
}
