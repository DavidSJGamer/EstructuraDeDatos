/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import modelos.Persona;
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

    public void agregarAlFinal(Evento evento) {
    Nodo nuevoNodo = new Nodo(evento);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;           
        }
    }
    public void agregarAlInicio(Evento evento) {
        Nodo nuevoNodo = new Nodo(evento);
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
        System.out.println("La lista está vacía.");
        return;
    }
    Nodo temp = cabeza;
    int contador = 1;
    while (temp != null) {
        System.out.println("Evento " + contador + ":");
        System.out.println("Publicacion: " + temp.getDato().getPublicacion());
        System.out.println("Reaccion: " + temp.getDato().getReaccion());
        System.out.println("Comentario: " + temp.getDato().getComentario());
        System.out.println("ID del Evento: " + temp.getDato().getIdEvento());
        System.out.println("Fecha del Evento: " + temp.getDato().getFecha());
        System.out.println("-------------------------");
        temp = temp.getSiguiente();
        contador++;
    }
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
    
    public void eliminarPorId(int id) {
    Nodo actual = cabeza;
    Nodo anterior = null;
    while (actual != null && actual.getDato().getIdEvento() != id) {
        anterior = actual;
        actual = actual.getSiguiente();
    }
    if (actual != null) {
        if (actual == cabeza) {
            cabeza = actual.getSiguiente();
        } else {
            anterior.setSiguiente(actual.getSiguiente());
            if (actual == cola) {
                cola = anterior;
            }
        }
    }
}
    
    public Evento buscarPorId(int id) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getDato().getIdEvento() == id) {
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
}
