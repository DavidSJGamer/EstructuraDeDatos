/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.Estudiante;
import modelos.ListaEnlazada;
import vista.Vista;

/**
 *
 * @author Admin
 */
public class Controlador {
    private Estudiante estudiante;
    private ListaEnlazada lista;
    private Vista vista;

    public Controlador() {
        vista = new Vista();
        lista = new ListaEnlazada(); 
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuInicial();
            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerNombre();
                    int edad = vista.obtenerEdad();
                    estudiante = new Estudiante(nombre, edad);
                    break;
                case 2:
                    if (estudiante != null) {
                        lista.agregarAlInicio(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 3:
                    if (estudiante != null) {
                        lista.agregarAlFinal(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    if (estudiante != null) {
                    lista.removerListaAlInicio();
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 6:
                    if (estudiante != null) {
                    lista.removerListaAlFinal();
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 7:
                    vista.mostrarMensaje("Bien hecho " + estudiante.getNombre() + "!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 7);
    }
}
