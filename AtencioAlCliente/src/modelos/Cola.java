/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public void agregarCliente(Cliente cliente) {
        Nodo nuevoNodo = new Nodo(cliente);
        if (frente == null) {
            frente = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
        }
        fin = nuevoNodo;
    }

    public Cliente atenderCliente() {
        if (frente == null) {
            System.out.println("No hay clientes en espera.");
            return null;
        }
        Cliente clienteAtendido = frente.getCliente();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        return clienteAtendido;
    }

    public boolean hayClientes() {
        return frente != null;
    }
    
}
