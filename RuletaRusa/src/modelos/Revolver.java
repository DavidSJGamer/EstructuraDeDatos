/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class Revolver {
    private final int tamano;
    private int posicionBala;

    public Revolver(int tamano) {
        this.tamano = tamano;
        this.posicionBala = (int) (Math.random() * tamano); 
    }

    public boolean disparar() {
        if (posicionBala == 0) {
            return true; 
        } else {
            posicionBala = (posicionBala + 1) % tamano;
            return false; 
        }
    }
}
