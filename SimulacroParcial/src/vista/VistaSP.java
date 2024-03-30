/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author DavidSJ  
 */
public class VistaSP {
    private Scanner Leer;

    public VistaSP() {
        this.Leer = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarLaberinto(String descripcionNodo) {
        System.out.println("Te encuentras en: " + descripcionNodo);
    }

    public String obtenerNombre() {
        System.out.print("Ingrese su nombre: ");
        return Leer.nextLine().trim();
    }

    public int menuInicial() {
        System.out.println("-------- BIENVENIDO AL LABERINTO DE TU VIDA -------");
        System.out.println("Toma las mejores decisiones y resuelvelo");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Ingresar su nombre");
        System.out.println("2. Iniciar laberinto");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
    
    public String obtenerRespuesta() {
        System.out.print("Tu respuesta: ");
        return Leer.nextLine().trim();
    }
}
