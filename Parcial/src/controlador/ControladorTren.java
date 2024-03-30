/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.Conductor;
import modelos.ListaEnlazada;
import vista.VistaTren;

/**
 *
 * @author Admin
 */
public class ControladorTren {
    private Conductor conductor;
    private ListaEnlazada lista;
    private VistaTren vista;

    public ControladorTren() {
        vista = new VistaTren();
        lista = new ListaEnlazada(); 
    }

    public void iniciarJuego() {
        int opcion;
        do {
            opcion = vista.menuInicial();
            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerNombre();
                    conductor = new Conductor(nombre);
                    break;
                case 2:
                    if (conductor != null) {
                        lista.agregarAlFinal(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("Primero ingrese su nombre.");
                    }
                    break;
                case 3:
                    lista.imprimirLista();
                    break;
                case 4:
                    String estacionAEliminar = vista.obtenerRespuesta();
                    lista.eliminarEstacion(estacionAEliminar);
                    break;
                case 5:
                    vista.mostrarMensaje("Lindo Viaje!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 5);
    }
}
