/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author DavidSJ
 */
public class Vista {
    public void mostrarBienvenida() {
        System.out.println("Bienvenido al verificador de balance de parentesis.");
        System.out.println("Por favor ingrese las cadenas que desea verificar:");
    }

    public void mostrarResultado(String cadena, boolean balanceado) {
        if (balanceado) {
            System.out.println("La cadena \"" + cadena + "\" esta correctamente balanceada.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" no esta balanceada.");
        }
    }
}
