/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelos.Cliente;
import modelos.Cola;
import modelos.Nodo;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private Cola cola;
    private Vista vista;
    private int contadorTickets;

    public Controlador() {
        cola = new Cola();
        vista = new Vista();
        vista.setControlador(this);
        contadorTickets = 1;
    }

    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    String nombreCliente = vista.leerNombreCliente();
                    Cliente cliente = new Cliente(nombreCliente, generarTicket());
                    cola.agregarCliente(cliente);
                    System.out.println("Cliente agregado con exito. Numero de ticket: " + cliente.getNumeroTicket());
                    break;
                case 2:
                    atenderCliente();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);
    }

    private int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int generarTicket() {
        return contadorTickets++;
    }

    private void atenderCliente() {
        if (cola.hayClientes()) {
            Cliente clienteAtendido = cola.atenderCliente();
            if (clienteAtendido != null) {
                int numeroTicket = clienteAtendido.getNumeroTicket();
                System.out.println("Llamando a ticket " + numeroTicket + "...");
                try {
                    Thread.sleep(3000); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Cliente atendido: " + clienteAtendido.getNombre());
            }
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }
}
