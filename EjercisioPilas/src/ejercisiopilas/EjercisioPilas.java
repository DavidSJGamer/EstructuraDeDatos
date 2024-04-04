/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisiopilas;

import Controlador.Controlador;
import Modelo.HistorialDeNavegacion;
import Vista.VistaHistorial;

public class EjercisioPilas {

    public static void main(String[] args) {
        HistorialDeNavegacion historial = new HistorialDeNavegacion();
        VistaHistorial vista = new VistaHistorial(null);
        Controlador controlador = new Controlador(historial, vista);
        vista.setControlador(controlador);
        vista.mostrar();
    }
}
