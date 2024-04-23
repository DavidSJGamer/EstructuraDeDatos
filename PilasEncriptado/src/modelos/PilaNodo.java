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
        private Nodo tope;

        public PilaNodo() {
            this.tope = null;
        }

        public void push(char dato) {
            Nodo nuevoNodo = new Nodo(dato);
            if (isEmpty()) {
                tope = nuevoNodo;
            } else {
                nuevoNodo.setSiguiente(tope);
                tope.setAnterior(nuevoNodo);
                tope = nuevoNodo;
            }
        }

        public char pop() {
            if (isEmpty()) {
                return '\0';
            } else {
                char dato = tope.getDato();
                tope = tope.getSiguiente();
                if (tope != null) {
                    tope.setAnterior(null);
                }
                return dato;
            }
        }

        public boolean isEmpty() {
            return tope == null;
        }
    }
