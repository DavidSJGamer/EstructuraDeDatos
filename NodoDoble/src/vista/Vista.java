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
    public int obtenerEdad() {
        System.out.print("Ingrese su edad: ");
        return Leer.nextInt();
    }

    public int menuInicial() {
        System.out.println("------------------Agregar----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Ingresar su nombre y edad");
        System.out.println("2. Agregar al inicio");
        System.out.println("3. Agregar al final");
        System.out.println("4. Ver ");
        System.out.println("5. Eliminar al inicio");
        System.out.println("6. Eliminar al final");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
    
    public String obtenerRespuesta() {
        System.out.print("Escriba su lista: ");
        return Leer.nextLine().trim();
    }
}
