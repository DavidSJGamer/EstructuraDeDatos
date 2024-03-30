/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainlistatarea;

/**
 *
 * @author DavidSJ
 */
public class Nodo {

    private String Tarea;
    private Nodo siguiente;

    public Nodo(String Tarea) {
        this.Tarea = Tarea;
        this.siguiente = null; 
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
