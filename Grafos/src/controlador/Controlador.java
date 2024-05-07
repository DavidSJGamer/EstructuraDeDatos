/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.*;
import modelo.Nodo;
import modelo.RedDeTransporte;
import modelo.Ruta;
import modelo.RutaOptimizada;
import modelo.Tarifa;
import vista.Vista;
/**
 *
 * @author David Jimenez - Andres Gonzalez
 */
public class Controlador {
    private RedDeTransporte redDeTransporte;
    private Vista vista;
    private Tarifa tarifa;

    public Controlador() {
        redDeTransporte = new RedDeTransporte();
        vista = new Vista();
        tarifa = new Tarifa(5.0, 2.0); 
    }

    public void iniciar() {
        inicializarRedDeTransporte();
        buscarRutas();
    }

    private void inicializarRedDeTransporte() {
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");

        redDeTransporte.agregarNodo(nodoA);
        redDeTransporte.agregarNodo(nodoB);
        redDeTransporte.agregarNodo(nodoC);

        redDeTransporte.agregarRuta(new RutaOptimizada(nodoA, nodoB, 10, 15));
        redDeTransporte.agregarRuta(new RutaOptimizada(nodoA, nodoC, 20, 25));
        redDeTransporte.agregarRuta(new RutaOptimizada(nodoB, nodoC, 5, 10));
    }

    private void buscarRutas() {
        Nodo origen = redDeTransporte.getNodos().get(0); 
        List<RutaOptimizada> rutasDisponibles = obtenerRutasDisponibles(origen);
        rutasDisponibles.sort(Comparator.comparingInt(RutaOptimizada::getTiempoViaje)); 
        vista.mostrarRutas(rutasDisponibles);
    }

    private List<RutaOptimizada> obtenerRutasDisponibles(Nodo origen) {
        List<RutaOptimizada> rutas = new ArrayList<>();
        for (Ruta ruta : redDeTransporte.getRutas()) {
            if (ruta.getOrigen().equals(origen) && ruta instanceof RutaOptimizada) {
                rutas.add((RutaOptimizada) ruta);
            }
        }
        return rutas;
    }

    public double calcularTarifa(double distancia) {
        return tarifa.calcularTarifa(distancia);
    }
}