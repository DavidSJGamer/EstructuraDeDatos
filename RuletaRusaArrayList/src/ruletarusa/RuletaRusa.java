/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletarusa;

import controlador.Controlador;
import modelos.ListaCircular;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class RuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(lista, vista);

        vista.mostrarBienvenida();
        controlador.agregarJugadores();
        controlador.jugar();
    }
    
}
