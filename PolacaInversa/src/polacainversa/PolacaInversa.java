/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polacainversa;

import controlador.Controlador;
import java.util.Scanner;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class PolacaInversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vista vista = new Vista();

        System.out.println("Ingrese la expresion en notacion polaca inversa:");
        String expresion = scanner.nextLine();
        int resultado = Controlador.evaluarExpresion(expresion);

        vista.mostrarResultado(expresion, resultado);
    }
    
}
