/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainlistatarea;

/**
 *
 * @author DavidSJ
 */
public class ListaTareas {
    private Nodo cabeza; 

    public ListaTareas() {
        this.cabeza = null;
    }

    public void agregarTarea(String Tarea) {
        Nodo nuevoNodo = new Nodo(Tarea);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        }else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }
        
    public void CompletarTarea(String Tarea){

    }
    public void ListarTareas(){
    
    }
    public void EliminarTarea(String Tarea){

    }
    public void ContarTarea(String Tarea){
    
    }
}
