/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import Controlador.EstudianteControlador;
import Vista.EstudianteVista;

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
        EstudianteVista vista = new EstudianteVista();
        EstudianteControlador cont = new  EstudianteControlador(vista);
        cont.iniciar();
    }
    
}
