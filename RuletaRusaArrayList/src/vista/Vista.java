/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelos.Jugador;
/**
 *
 * @author DavidSJ
 */

public class Vista {

    public void mostrarBienvenida() {
        System.out.println("Bienvenido al juego de la ruleta rusa!");
        System.out.println("Se ha cargado una bala en el tambor de la pistola. Buena suerte! La necesitaras...");
    }

    public void mostrarTurno(Jugador jugador) {
        System.out.println("\nEs el turno de " + jugador.getNombre() + ".");
    }

    public void mostrarDisparoExitoso(Jugador jugador) {
        System.out.println(jugador.getNombre() + " ha disparado el arma. La bala ha sido disparada!");
    }

    public void mostrarDisparoFallido(Jugador jugador) {
        System.out.println(jugador.getNombre() + " ha disparado el arma. La bala no fue disparada!");
    }

    public void mostrarGanador(Jugador jugador) {
        System.out.println("\n" + jugador.getNombre() + " ha sobrevivido y ha ganado el juego!");
    }

    public void mostrarPerdedor(Jugador jugador) {
        System.out.println("\n" + jugador.getNombre() + " ha muerto!");
    }
}
