/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Random;

/**
 *
 * @author DavidSJ
 */
public class ListaDobleEnlazada {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;

    public ListaDobleEnlazada() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    public void agregarColor(String color) {
        Nodo nuevo = new Nodo(color);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
        longitud++;
    }

    public String obtenerColor(int posicion) {
        if (posicion < 0 || posicion >= longitud) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }
        Nodo temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.siguiente;
        }
        return temp.color;
    }

    public void reiniciarSecuencia() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    public void generarSiguienteColor() {
        String[] colores = {"rojo", "verde", "azul", "amarillo"};
        Random rand = new Random();
        agregarColor(colores[rand.nextInt(colores.length)]);
    }

    public int obtenerLongitud() {
        return longitud;
    }
}
