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
    Jugador jugador;
    Nodo siguiente;

    public Nodo(Jugador jugador) {
        this.jugador = jugador;
        this.siguiente = this;
    }
}
