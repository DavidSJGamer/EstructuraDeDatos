/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero;

import controlador.Controlador;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import modelos.ListaSimple;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ListaSimple modelo = new ListaSimple();
        modelo.agregarNumero(random.nextInt(100) + 1);

        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        vista.mostrarMensajeBienvenida();
        controlador.jugar(scanner);

        scanner.close();
    }
    
}
