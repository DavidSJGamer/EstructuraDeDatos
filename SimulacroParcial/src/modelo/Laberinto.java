/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DavidSJ
 */
public class Laberinto {
    private Nodo inicio;

    public Laberinto() {
        Acertijos acertijo1 = new Acertijos("Cuanto es 2 + 2", "4");
        Nodo nodo1 = new Nodo(acertijo1);

        Acertijos acertijo2 = new Acertijos("La capital de Colombia", "Bogota");
        Nodo nodo2 = new Nodo(acertijo2);

        nodo1.setSiguiente(nodo2);

        inicio = nodo1;
    }

    public Nodo getInicio() {
        return inicio;
    }
}
