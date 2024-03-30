/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vista {
    private Scanner Leer;

    public Vista() {
        this.Leer = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerNombre() {
        System.out.print("Ingrese su nombre: ");
        return Leer.nextLine().trim();
    }
    public int obtenerId() {
        System.out.print("Ingrese su id: ");
        return Leer.nextInt();
    }
    public String obtenerPublicacion() {
        System.out.print("Ingrese su publicacion: ");
        return Leer.nextLine().trim();
    }
    public String obtenerComentario() {
        System.out.print("Ingrese su Comentario: ");
        return Leer.nextLine().trim();
    }
    public String obtenerReaccion() {
        System.out.print("Ingrese su Reaccion: ");
        return Leer.nextLine().trim();
    }

    public int menuInicial() {
        System.out.println("------------------RED SOCIAL DAVIDSJ----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Ingresar su nombre y el ID");
        System.out.println("2. Crear evento");
        System.out.println("3. Agregar evento al inicio");
        System.out.println("4. Agregar evento al final");
        System.out.println("5. Ver eventos");
        System.out.println("6. Eliminar evento por ID");
        System.out.println("7. Buscar eventos");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
    
}
