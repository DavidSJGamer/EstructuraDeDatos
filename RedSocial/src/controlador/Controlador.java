/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDateTime;
import modelos.Evento;
import modelos.Persona;
import modelos.ListaEnlazada;
import vista.Vista;

/**
 *
 * @author Admin
 */
public class Controlador {
    private Evento evento;
    private Persona persona;
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
                    int id = vista.obtenerId();
                    persona = new Persona(nombre, id);
                    break;
                case 2:
                    String Publicacion = vista.obtenerPublicacion();
                    String Reaccion = vista.obtenerReaccion();
                    String Comentario = vista.obtenerComentario();
                    int ID = vista.obtenerId();
                    evento = new Evento(Publicacion, Reaccion, Comentario, ID, LocalDateTime.now());
                    break;
                case 3:
                    if (persona != null) {
                        lista.agregarAlInicio(evento);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 4:
                    if (persona != null) {
                        lista.agregarAlFinal(evento);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 5:
                    lista.imprimirLista();
                    break;
                case 6:
                    if (persona != null) {
                    int idBuscar = vista.obtenerId();
                    lista.eliminarPorId(idBuscar);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 7:
                    int idBuscar = vista.obtenerId(); 
                    Evento eventoEncontrado = lista.buscarPorId(idBuscar);
                    if (eventoEncontrado != null) {
                        System.out.println("Evento encontrado:");
                        System.out.println("Publicacion: " + eventoEncontrado.getPublicacion());
                        System.out.println("Reaccion: " + eventoEncontrado.getReaccion());
                        System.out.println("Comentario: " + eventoEncontrado.getComentario());
                        System.out.println("ID del Evento: " + eventoEncontrado.getIdEvento());
                        System.out.println("Fecha del Evento: " + eventoEncontrado.getFecha());
                    } else {
                        System.out.println("No se encontro ningun evento con el ID especificado.");
                    }
                    break;
                case 8:
                    vista.mostrarMensaje("Que te vaya bien " + persona.getNombre() + "!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 8);
    }
}
