/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simondice;

import controlador.Controlador;
import modelos.ListaDobleEnlazada;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class SimonDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        Vista vista = new Vista(new Controlador(lista, null));
        Controlador controlador = new Controlador(lista, vista);
        controlador.iniciarJuego();
    }
    
}
