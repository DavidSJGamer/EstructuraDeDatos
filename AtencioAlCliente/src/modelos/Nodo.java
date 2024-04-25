/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class Nodo {
    private Cliente cliente;
    private Nodo siguiente;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
