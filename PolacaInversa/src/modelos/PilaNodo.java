/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class PilaNodo {
    private Nodo top;

    public void push(Nodo nodo) {
        if (top == null) {
            top = nodo;
        } else {
            nodo.setSiguiente(top);
            top = nodo;
        }
    }

    public Nodo pop() {
        if (top == null) {
            return null;
        }
        Nodo temp = top;
        top = top.getSiguiente();
        temp.setSiguiente(null);
        return temp;
    }

    public boolean estaVacia() {
        return top == null;
    }
}
