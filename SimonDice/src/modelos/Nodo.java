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
    String color;
    Nodo siguiente;
    Nodo anterior;

    Nodo(String color) {
        this.color = color;
        siguiente = null;
        anterior = null;
    }
}
