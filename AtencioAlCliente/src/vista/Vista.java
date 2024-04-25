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

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        System.out.println("1. Agregar nuevo cliente");
        System.out.println("2. Atender siguiente cliente");
        System.out.println("3. Salir");
        System.out.print("Ingrese su opcion: ");
    }

    public String leerNombreCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        return scanner.nextLine();
    }
}
