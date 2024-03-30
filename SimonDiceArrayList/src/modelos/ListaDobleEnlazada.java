/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DavidSJ
 */
public class ListaDobleEnlazada {
    private ArrayList<String> secuencia;

    public ListaDobleEnlazada() {
        secuencia = new ArrayList<>();
    }

    public void agregarColor(String color) {
        secuencia.add(color);
    }

    public ArrayList<String> obtenerSecuencia() {
        return secuencia;
    }

    public void reiniciarSecuencia() {
        secuencia.clear();
    }

    public void generarSiguienteColor() {
        String[] colores = {"rojo", "verde", "azul", "amarillo"};
        Random rand = new Random();
        agregarColor(colores[rand.nextInt(colores.length)]);
    }
}
