/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import Controlador.ContactoControlador;
import Vista.ContactoVista;

/**
 *
 * @author DavidSJ
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContactoVista vista = new ContactoVista();
        ContactoControlador cont = new  ContactoControlador(vista);
        cont.iniciar();
    }
    
}
