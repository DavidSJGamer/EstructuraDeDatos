/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class PilaNodo {
    public int dato;
    public PilaNodo siguiente;

    public PilaNodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }    
}
