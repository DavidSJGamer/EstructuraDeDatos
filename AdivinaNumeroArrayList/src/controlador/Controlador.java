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
    private final ListaSimple listaSimple;
    private final Vista vista;

    public Controlador(ListaSimple listaSimple, Vista vista) {
        this.listaSimple = listaSimple;
        this.vista = vista;
    }

    public void jugar(Scanner scanner) {
        while (true) {
            int intento = scanner.nextInt();

            if (intento < listaSimple.getNumeroAdivinar()) {
                vista.mostrarMensajeNumeroMayor();
            } else if (intento > listaSimple.getNumeroAdivinar()) {
                vista.mostrarMensajeNumeroMenor();
            } else {
                vista.mostrarMensajeAdivinado();
                break;
            }
        }
    }
}
