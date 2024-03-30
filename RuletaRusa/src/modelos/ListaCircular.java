/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class ListaCircular {

    private Nodo inicio;
    private Nodo fin;
    private Nodo actual;
    private int cantidadJugadoresVivos;

    public ListaCircular() {
        this.actual = null;
        this.cantidadJugadoresVivos = 0;
    }

    public void agregarJugador(Jugador jugador) {
        Nodo nuevoNodo = new Nodo(jugador);
        if (inicio == null)
        {
            inicio = nuevoNodo;
            fin = nuevoNodo;
            fin.siguiente = inicio;
            actual = inicio;
        } else
        {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
            fin.siguiente = inicio;
        }
        cantidadJugadoresVivos++;
    }

    public Jugador getJugadorActual() {
        if (actual != null)
        {
            return actual.jugador;
        } else
        {
            return null;
        }
    }

    public void siguienteJugador() {
        actual = actual.siguiente;
    }

    public int cantidadJugadoresVivos() {
        return cantidadJugadoresVivos;
    }

    public void eliminarJugadorActual() {
        if (actual == inicio)
        {
            inicio = actual.siguiente;
        }

        Nodo nodoAnterior = null;
        Nodo nodoActual = inicio;

        while (nodoActual != actual)
        {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        }

        if (nodoAnterior != null)
        {
            nodoAnterior.siguiente = actual.siguiente;
        }

        if (actual == fin)
        {
            fin = nodoAnterior;
        }

        Nodo siguienteJugador = actual.siguiente;
        actual.siguiente = null;
        actual = siguienteJugador;
        cantidadJugadoresVivos--;

        if (actual == null)
        {
            actual = inicio;
        }
    }
}
