/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.EstudiantesModelo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DavidSJ
 */
public class EstudianteVista {
    private Scanner scanner;

    public EstudianteVista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Actualizar estudiante");
        System.out.println("3. Eliminar estudiante");
        System.out.println("4. Ver estudiantes");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opcion: ");
        return scanner.nextInt();
    }

    public EstudiantesModelo agregarEstudiante() {
        scanner.nextLine(); 
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese ID del estudiante: ");
        String id = scanner.next();
        return new EstudiantesModelo(nombre, id);
    }

    public EstudiantesModelo modificarEstudiante() {
        scanner.nextLine(); 
        System.out.print("Ingrese nombre del estudiante que desea modificar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese nuevo nombre del estudiante: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese nuevo ID del estudiante: ");
        String nuevoId = scanner.next();
        return new EstudiantesModelo(nuevoNombre, nuevoId);
    }

    public String eliminarEstudiante() {
        System.out.print("Ingrese ID del estudiante que desea eliminar: ");
        return scanner.next();
    }

    public void mostrarEstudiantes(ArrayList<EstudiantesModelo> estudiantes) {
        System.out.println("Lista de estudiantes:");
        for (EstudiantesModelo estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", ID: " + estudiante.getId());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}