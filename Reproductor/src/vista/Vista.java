/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelos.Cancion;

/**
 *
 * @author SANTIAGO JIMENEZ
 */
public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("-------------Simulador Reproductor De Musica-----------");
        System.out.println("1. Agregar cancion");
        System.out.println("2. Eliminar cancion actual");
        System.out.println("3. Avanzar");
        System.out.println("4. Retroceder");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion: ");
        return scanner.nextInt();
    }

    public String obtenerTituloCancion() {
        System.out.print("Ingrese el titulo de la cancion: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public void mostrarCancionActual(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Cancion actual: " + cancion.getTitulo());
        } else {
            System.out.println("No hay canciones en la lista de reproduccion.");
        }
    }
}
