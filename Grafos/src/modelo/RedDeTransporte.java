/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Jimenez - Andres Gonzalez
 */
public class RedDeTransporte {
    private List<Nodo> nodos;
    private List<Ruta> rutas;
    
    public RedDeTransporte() {
        nodos = new ArrayList<>();
        rutas = new ArrayList<>();
    }
    
    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }
    
    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }
    
    public List<Nodo> getNodos() {
        return nodos;
    }
    
    public List<Ruta> getRutas() {
        return rutas;
    }
}
