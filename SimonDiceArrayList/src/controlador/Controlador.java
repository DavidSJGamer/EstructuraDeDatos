/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
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
        ArrayList<String> secuencia = lista.obtenerSecuencia();
        if (secuenciaJugador.length != secuencia.size()) {
            return false;
        }
        for (int i = 0; i < secuenciaJugador.length; i++) {
            if (!secuenciaJugador[i].equals(secuencia.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void generarSiguienteColor() {
        lista.generarSiguienteColor();
    }

    public ArrayList<String> obtenerSecuencia() {
        return lista.obtenerSecuencia();
    }
}