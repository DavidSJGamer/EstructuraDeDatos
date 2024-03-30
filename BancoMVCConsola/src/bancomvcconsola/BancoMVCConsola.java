/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancomvcconsola;

import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class BancoMVCConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador cont = new Controlador(vista);
        cont.iniciar();
    }
    
}
