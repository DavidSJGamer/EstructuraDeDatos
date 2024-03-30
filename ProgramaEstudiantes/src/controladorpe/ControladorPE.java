/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorpe;

import modelodeusuarios.ModeloDeUsuarios;
import vistape.VistaPE;

/**
 *
 * @author DavidSJ
 */
public class ControladorPE {
    private ModeloDeUsuarios modelo;
    private VistaPE vista;

    public ControladorPE(VistaPE vista) {
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;
        while(!salir){
            int opcion = vista.MostrarMenu();
            switch (opcion) {
                case 1:
                    vista.CrearEstudiante();
                    vista.MostrarMensaje("Estudiante Agregado Con Exito");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;

                case 5:
                    salir = true;
                    vista.MostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.MostrarMensaje("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }
}

