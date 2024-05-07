/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author David Jimenez - Andres Gonzalez
 */
public class RutaOptimizada extends Ruta {
    private int tiempoViaje;
    
    public RutaOptimizada(Nodo origen, Nodo destino, double distancia, int tiempoViaje) {
        super(origen, destino, distancia);
        this.tiempoViaje = tiempoViaje;
    }
    
    public int getTiempoViaje() {
        return tiempoViaje;
    }
}
