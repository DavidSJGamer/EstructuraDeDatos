/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.ListaSimple;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private final ListaSimple modelo;
    private final Vista vista;

    public Controlador(ListaSimple modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void jugar(Scanner scanner) {
        int numeroAdivinar = modelo.getNumeroAdivinar();

        while (true) {
            int intento = scanner.nextInt();

            if (intento < numeroAdivinar) {
                vista.mostrarMensajeNumeroMayor();
            } else if (intento > numeroAdivinar) {
                vista.mostrarMensajeNumeroMenor();
            } else {
                vista.mostrarMensajeAdivinado();
                break;
            }
        }
    }
}