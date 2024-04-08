/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author DavidSJ
 */
public class ListaSimple {
    private final ArrayList<Integer> numeros;

    public ListaSimple() {
        numeros = new ArrayList<>();
    }

    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    public int getNumeroAdivinar() {
        return numeros.get(0);
    }
}