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
public class ListaSimple {
    private final int numeroAdivinar;

    public ListaSimple(Random random) {
        final int min = 1;
        final int max = 100;
        this.numeroAdivinar = random.nextInt(max - min + 1) + min;
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }
}
