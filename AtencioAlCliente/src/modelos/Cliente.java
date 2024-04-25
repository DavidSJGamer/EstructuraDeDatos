/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class Cliente {
    private final String nombre;
    private final int numeroTicket;

    public Cliente(String nombre, int numeroTicket) {
        this.nombre = nombre;
        this.numeroTicket = numeroTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }
}
