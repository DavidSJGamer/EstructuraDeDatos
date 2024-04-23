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
public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public String Mostrarbienvenida() {
        System.out.println("Menu:");
        System.out.println("1. Encriptar Contrasena");
        System.out.println("2. Desencriptar Contrasena");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextLine();
    }

    public String solicitarContraseña() {
        System.out.print("Ingrese la contrasena: ");
        return scanner.nextLine();
    }

    public String solicitarContraseñaEncriptada() {
        System.out.print("Ingrese la contrasena encriptada: ");
        return scanner.nextLine();
    }

    public void mostrarContraseñaEncriptada(String contraseñaEncriptada) {
        System.out.println("Contrasena encriptada: " + contraseñaEncriptada);
    }

    public void mostrarContraseñaDesencriptada(String contraseñaDesencriptada) {
        System.out.println("Contrasena desencriptada: " + contraseñaDesencriptada);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.err.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
