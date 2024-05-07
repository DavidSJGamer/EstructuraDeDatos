/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import modelo.Ruta;
import modelo.RutaOptimizada;

/**
 *
 * @author David Jimenez - Andres Gonzalez
 */
public class Vista {

    public void mostrarRutas(List<RutaOptimizada> rutas) {
        System.out.println("Rutas disponibles:");
        for (RutaOptimizada ruta : rutas)
        {
            System.out.println("Origen: " + ruta.getOrigen().getNombre()
                    + " -> Destino: " + ruta.getDestino().getNombre()
                    + " Distancia: " + ruta.getDistancia()
                    + " Tiempo de viaje: " + ruta.getTiempoViaje());
        }
    }
}
