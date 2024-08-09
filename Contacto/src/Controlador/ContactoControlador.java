/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ContactoModelo;
import Vista.ContactoVista;
import java.util.ArrayList;

/**
 *
 * @author DavidSJ
 */
public class ContactoControlador {
    private ArrayList<ContactoModelo> contactos;
    private ContactoVista vista;

    public ContactoControlador(ContactoVista vista) {
        this.vista = vista;
        contactos = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    ContactoModelo nuevoContacto = vista.agregarContacto();
                    contactos.add(nuevoContacto);
                    vista.mostrarMensaje("Contacto agregado exitosamente.");
                    break;
                case 2:
                    String nombreBuscar = vista.buscarContacto();
                    boolean encontrado = false;
                    for (ContactoModelo contacto : contactos) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            vista.mostrarMensaje("Contacto encontrado: Nombre: " + contacto.getNombre() + ", Numero: " + contacto.getId());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        vista.mostrarMensaje("No se encontro ningun contacto con el nombre proporcionado.");
                    }
                    break;
                case 3:
                    String nombreModificar = vista.buscarContacto();
                    boolean modificado = false;
                    for (ContactoModelo contacto : contactos) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            ContactoModelo contactoModificado = vista.modificarContacto(contacto.getId());
                            contacto.setNombre(contactoModificado.getNombre());
                            contacto.setId(contactoModificado.getId());
                            modificado = true;
                            break;
                        }
                    }
                    if (modificado) {
                        vista.mostrarMensaje("Contacto modificado exitosamente.");
                    } else {
                        vista.mostrarMensaje("No se encontro ningun contacto con el nombre proporcionado.");
                    }
                    break;
                case 4:
                    String idEliminar = vista.eliminarContacto();
                    boolean eliminado = contactos.removeIf(contacto -> contacto.getId().equals(idEliminar));
                    if (eliminado) {
                        vista.mostrarMensaje("Contacto eliminado exitosamente.");
                    } else {
                        vista.mostrarMensaje("No se encontro ningun contacto con el numero proporcionado.");
                    }
                    break;
                case 5:
                    vista.mostrarContacto(contactos);
                    break;
                case 6:
                    vista.mostrarMensaje("Hasta luego.");
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }
}