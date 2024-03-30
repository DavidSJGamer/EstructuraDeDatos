/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.ListaCircular;
import java.util.Scanner;
import modelos.Jugador;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */


public class Controlador {
    private final ListaCircular lista;
    private final Vista vista;

    public Controlador(ListaCircular lista, Vista vista) {
        this.lista = lista;
        this.vista = vista;
    }

    public void agregarJugadores() {
        Scanner scanner = new Scanner(System.in);
        int cantidadJugadores = 0;
        String nombreJugador;
        do {
            System.out.print("Ingrese el nombre del jugador " + (cantidadJugadores + 1) + " (o 'fin' para terminar): ");
            nombreJugador = scanner.nextLine(); 
            if (!nombreJugador.equalsIgnoreCase("fin")) {
                lista.agregarJugador(new Jugador(nombreJugador));
                cantidadJugadores++;
            }
        } while (!nombreJugador.equalsIgnoreCase("fin") && cantidadJugadores < 5);
    }

    public void jugar() {
        while (lista.cantidadJugadoresVivos() > 1) {
            Jugador jugadorActual = lista.getJugadorActual();
            vista.mostrarTurno(jugadorActual);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Presiona 'enter' para disparar el arma:");
            scanner.nextLine();

            boolean disparoExitoso = Math.random() < 0.25; 
            if (disparoExitoso) {
                vista.mostrarDisparoExitoso(jugadorActual);
                vista.mostrarPerdedor(jugadorActual);
                lista.eliminarJugadorActual();
            } else {
                vista.mostrarDisparoFallido(jugadorActual);
                lista.siguienteJugador();
            }
        }
        Jugador ganador = lista.getJugadorActual();
        vista.mostrarGanador(ganador);
    }
}