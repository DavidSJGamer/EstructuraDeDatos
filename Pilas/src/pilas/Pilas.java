/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import controlador.Controlador;
import java.util.Scanner;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Vista vista = new Vista();
        Scanner scanner = new Scanner(System.in);

        vista.mostrarBienvenida();

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        boolean balanceado1 = controlador.verificarBalance(cadena1);
        boolean balanceado2 = controlador.verificarBalance(cadena2);

        vista.mostrarResultado(cadena1, balanceado1);
        vista.mostrarResultado(cadena2, balanceado2);

        scanner.close();
    }
    
}
