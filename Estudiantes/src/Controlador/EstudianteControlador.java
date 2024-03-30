/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.EstudiantesModelo;
import Vista.EstudianteVista;
import java.util.ArrayList;

/**
 *
 * @author DavidSJ
 */
public class EstudianteControlador {
    private ArrayList<EstudiantesModelo> estudiantes;
    private EstudianteVista vista;

    public EstudianteControlador(EstudianteVista vista) {
        this.vista = vista;
        estudiantes = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    EstudiantesModelo nuevoEstudiante = vista.agregarEstudiante();
                    estudiantes.add(nuevoEstudiante);
                    vista.mostrarMensaje("Estudiante agregado exitosamente.");
                    break;
                case 2:
                    EstudiantesModelo estudianteModificado = vista.modificarEstudiante();
                    boolean encontrado = false;
                    for (EstudiantesModelo est : estudiantes) {
                        if (est.getNombre().equalsIgnoreCase(estudianteModificado.getNombre())) {
                            est.setNombre(estudianteModificado.getNombre());
                            est.setId(estudianteModificado.getId());
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        vista.mostrarMensaje("Estudiante modificado exitosamente.");
                    } else {
                        vista.mostrarMensaje("No se encontro ningun estudiante con el nombre proporcionado.");
                    }
                    break;
                case 3:
                    String idEliminar = vista.eliminarEstudiante();
                    boolean eliminado = estudiantes.removeIf(est -> est.getId().equals(idEliminar));
                    if (eliminado) {
                        vista.mostrarMensaje("Estudiante eliminado exitosamente.");
                    } else {
                        vista.mostrarMensaje("No se encontro ningun estudiante con el ID proporcionado.");
                    }
                    break;
                case 4:
                    vista.mostrarEstudiantes(estudiantes);
                    break;
                case 5:
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