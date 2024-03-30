/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author DavidSJ
 */
public class ListaCircular {

    private ArrayList<Jugador> jugadores;
    private int indiceJugadorActual;

    public ListaCircular() {
        this.jugadores = new ArrayList<>();
        this.indiceJugadorActual = 0;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Jugador getJugadorActual() {
        return jugadores.get(indiceJugadorActual);
    }

    public void siguienteJugador() {
        indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size();
    }

    public int cantidadJugadoresVivos() {
        return jugadores.size();
    }

    public void eliminarJugadorActual() {
        jugadores.remove(indiceJugadorActual);
        if (indiceJugadorActual >= jugadores.size()) {
            indiceJugadorActual = 0;
        }
    }
}