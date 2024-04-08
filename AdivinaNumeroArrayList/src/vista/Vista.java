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

    public void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al juego de adivinar el numero!");
        System.out.println("Estoy pensando en un numero entre 1 y 100. Adivina cual:");
    }

    public void mostrarMensajeNumeroMayor() {
        System.out.println("El numero que estoy pensando es mayor. Intenta de nuevo.");
    }

    public void mostrarMensajeNumeroMenor() {
        System.out.println("El numero que estoy pensando es menor. Intenta de nuevo.");
    }

    public void mostrarMensajeAdivinado() {
        System.out.println("Felicidades! Has adivinado el numero correctamente!");
    }
}