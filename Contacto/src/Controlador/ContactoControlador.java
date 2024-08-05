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
    private ArrayList<ContactoModelo> contacto;
    private ContactoVista vista;

    public ContactoControlador(ContactoVista vista) {
        this.vista = vista;
        contacto = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    ContactoModelo nuevoContacto = vista.agregarContacto();
                    contacto.add(nuevoContacto);
                    vista.mostrarMensaje("Contacto agregado exitosamente.");
                    break;
                case 2:

                    break;
                case 3:
                    ContactoModelo contactoModificado = vista.modificarContacto();
                    boolean encontrado = false;
                    for (ContactoModelo est : contacto) {
                        if (est.getNombre().equalsIgnoreCase(contactoModificado.getNombre())) {
                            est.setNombre(contactoModificado.getNombre());
                            est.setId(contactoModificado.getId());
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        vista.mostrarMensaje("Contacto modificado exitosamente.");
                    } else {
                        vista.mostrarMensaje("No se encontro ningun Contacto con el nombre proporcionado.");
                    }
                    break;
                case 4:
                    String idEliminar = vista.eliminarContacto();
                    boolean eliminado = contacto.removeIf(est -> est.getId().equals(idEliminar));
                    if (eliminado) {
                        vista.mostrarMensaje("Contacto eliminado exitosamente.");
                    } else {
                        vista.mostrarMensaje("No se encontro ningun Contacto con el numero proporcionado.");
                    }
                    break;
                case 5:
                    vista.mostrarContacto(contacto);
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