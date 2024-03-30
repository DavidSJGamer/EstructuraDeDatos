/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelos.Cancion;
import modelos.ListaReproduccion;
import vista.Vista;
/**
 *
 * @author SANTIAGO JIMENEZ
 */
public class Controlador {
    private ListaReproduccion listaReproduccion;
    private Vista vista;

    public Controlador() {
        listaReproduccion = new ListaReproduccion();
        vista = new Vista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String titulo = vista.obtenerTituloCancion();
                    listaReproduccion.agregarCancion(new Cancion(titulo));
                    break;
                case 2:
                    listaReproduccion.eliminarCancionActual();
                    break;
                case 3:
                    listaReproduccion.avanzar();
                    break;
                case 4:
                    listaReproduccion.retroceder();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }

            Cancion cancionActual = listaReproduccion.getCancionActual();
            vista.mostrarCancionActual(cancionActual);
        } while (opcion != 5);
    }
}

