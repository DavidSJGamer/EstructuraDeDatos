/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Controlador;
import java.util.Scanner;

/**
 *
 * @author DavidSJ
 */
public class Vista {
    private Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarBienvenida() {
        System.out.println("Bienvenido a Simon Dice!");
    }

    public void mostrarSecuencia() {
        controlador.generarSiguienteColor(); 
        System.out.print("La secuencia es: ");
        for (int i = 0; i < controlador.obtenerLongitud(); i++) {
            System.out.print(controlador.obtenerColor(i) + " ");
        }
        System.out.println();
    }

    public String[] leerSecuencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la secuencia (por ejemplo, rojo verde azul amarillo):");
        return scanner.nextLine().trim().toLowerCase().split(" ");
    }

    public void mostrarFinJuego() {
        System.out.println("Secuencia incorrecta! Fin del juego!");
    }
}
