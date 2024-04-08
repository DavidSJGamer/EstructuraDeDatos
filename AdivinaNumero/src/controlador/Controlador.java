/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelos.Nodo;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private final Nodo nodo;
    private final Vista vista;

    public Controlador(Nodo nodo, Vista vista) {
        this.nodo = nodo;
        this.vista = vista;
    }

    public void jugar(Scanner scanner) {
        while (true) {
            int intento = scanner.nextInt();

            if (intento < nodo.numero) {
                vista.mostrarMensajeNumeroMayor();
            } else if (intento > nodo.numero) {
                vista.mostrarMensajeNumeroMenor();
            } else {
                vista.mostrarMensajeAdivinado();
                break;
            }
        }
    }
}
