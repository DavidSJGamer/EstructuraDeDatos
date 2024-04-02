/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.ListaPila;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private final ListaPila pila;

    public Controlador() {
        pila = new ListaPila();
    }

    public boolean verificarBalance(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(') {
                pila.push(1);
            } else if (caracter == ')') {
                if (pila.estaVacia()) {
                    return false; 
                }
                try {
                    pila.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }
    return pila.estaVacia();
    }
}


