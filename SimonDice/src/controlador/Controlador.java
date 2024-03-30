/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Random;
import java.util.Scanner;
import modelos.ListaDobleEnlazada;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private ListaDobleEnlazada lista;
    private Vista vista;

    public Controlador(ListaDobleEnlazada lista, Vista vista) {
        this.lista = lista;
        this.vista = vista;
    }

    public void iniciarJuego() {
        vista.mostrarBienvenida();
        while (true) {
            vista.mostrarSecuencia();
            String[] secuenciaJugador = vista.leerSecuencia();
            if (!verificarSecuencia(secuenciaJugador)) {
                vista.mostrarFinJuego();
                break;
            }
        }
    }

    private boolean verificarSecuencia(String[] secuenciaJugador) {
        if (secuenciaJugador.length != lista.obtenerLongitud()) {
            return false;
        }
        for (int i = 0; i < secuenciaJugador.length; i++) {
            if (!secuenciaJugador[i].equals(lista.obtenerColor(i))) {
                return false;
            }
        }
        return true;
    }

    public int obtenerLongitud() {
        return lista.obtenerLongitud();
    }

    public String obtenerColor(int posicion) {
        return lista.obtenerColor(posicion);
    }

    public void generarSiguienteColor() {
        lista.generarSiguienteColor();
    }
}
