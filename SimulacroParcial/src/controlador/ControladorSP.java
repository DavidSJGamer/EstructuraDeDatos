/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Acertijos;
import modelo.Habitante;
import modelo.Laberinto;
import modelo.Nodo;
import vista.VistaSP;

/**
 *
 * @author DavidSJ
 */

// Clase Controlador
public class ControladorSP {
    private Habitante habitante;
    private Laberinto laberinto;
    private VistaSP vista;

    public ControladorSP() {
        vista = new VistaSP();
    }

    public void iniciarJuego() {
        int opcion;
        do {
            opcion = vista.menuInicial();
            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerNombre();
                    habitante = new Habitante(nombre);
                    break;
                case 2:
                    if (habitante != null) {
                        laberinto = new Laberinto();
                        comenzarLaberinto();
                    } else {
                        vista.mostrarMensaje("Primero ingrese su nombre.");
                    }
                    break;
                case 3:
                    vista.mostrarMensaje("¡Gracias por jugar!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 3);
    }
    private void comenzarLaberinto() {
            vista.mostrarMensaje("Bienvenido al laberinto, " + habitante.getNombre() + "Comienza tu viaje.");
            Nodo nodoActual = laberinto.getInicio();
            while (nodoActual != null) {
                Acertijos acertijo = nodoActual.getAcertijo();
                vista.mostrarMensaje("Responde la siguiente pregunta:");
                vista.mostrarMensaje(acertijo.getPregunta());
                String respuestaUsuario = vista.obtenerRespuesta();

                if (acertijo.comprobarRespuesta(respuestaUsuario)) {
                    vista.mostrarMensaje("Respuesta correcta!");
                    nodoActual = nodoActual.getSiguiente();
                    if (nodoActual != null) {
                        vista.mostrarLaberinto("Nodo siguiente");
                    }
                } else {
                    vista.mostrarMensaje("Respuesta incorrecta. Inténtalo de nuevo.");
                }
            }
            vista.mostrarMensaje("Felicidades, has llegado al final del laberinto!");
        }
}
