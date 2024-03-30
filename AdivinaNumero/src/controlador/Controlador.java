/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Random;
import java.util.Scanner;
import modelos.ListaSimple;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private final ListaSimple list;
    private final Vista vista;

    public Controlador(ListaSimple list, Vista vista) {
        this.list = list;
        this.vista = vista;
    }

    public void jugar(Scanner scanner) {
        while (true) {
            int intento = scanner.nextInt();

            if (intento < list.getNumeroAdivinar()) {
                vista.mostrarMensajeNumeroMayor();
            } else if (intento > list.getNumeroAdivinar()) {
                vista.mostrarMensajeNumeroMenor();
            } else {
                vista.mostrarMensajeAdivinado();
                break;
            }
        }
    }
}
