/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ListaDobleEnlazada;
import modelo.PilaNodo;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private final Vista vista;
    private final PilaNodo pila;
    private final ListaDobleEnlazada lista;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.pila = new PilaNodo();
        this.lista = new ListaDobleEnlazada();
        vista.setControlador(this);
    }

    public void ingresarVariable(String nombreVariable, int tamaño) {
        String mensaje = " Variable Ingresada: " + nombreVariable + " (Con tamaño " + tamaño + ")\n";
        pila.push(mensaje); 
        lista.insertarAlFinal(mensaje);
        vista.mostrarMensajeVariable(mensaje);
    }
    
    public void entrarAlAmbito() {
        String mensaje = "Entrando al ambito\n";
        pila.push(mensaje); 
        lista.insertarAlFinal(mensaje);
        vista.mostrarMensajeVariable(mensaje);
    }
    
    public void limpiarMemoria() {
        String mensaje = "Limpiando memoria\n";
        pila.push(mensaje); 
        lista.insertarAlFinal(mensaje);
        vista.mostrarMensajeVariable(mensaje);
    }

}
