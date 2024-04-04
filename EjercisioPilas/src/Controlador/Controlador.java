/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.HistorialDeNavegacion;
import Modelo.Pagina;
import Vista.VistaHistorial;

public class Controlador {
    private HistorialDeNavegacion modelo;
    private VistaHistorial vista;

    public Controlador(HistorialDeNavegacion modelo, VistaHistorial vista) {
        this.modelo = modelo;
        this.vista = vista;
        mostrarPaginaActual();
    }

    private void mostrarPaginaActual() {
        Pagina paginaActual = modelo.getPaginaActual();
        if (paginaActual != null && paginaActual.getTitulo() != null) {
            vista.mostrarPaginaActual(paginaActual.getTitulo());
        } else {
            vista.mostrarPaginaActual("Sin título");
        }
    }

    public void visitarPagina(String url, String titulo) {
        Pagina pagina = new Pagina(url, titulo);
        modelo.visitarPagina(pagina);
        mostrarPaginaActual();
    }

    public void retroceder() {
        if (modelo.retroceder() != null) {
            mostrarPaginaActual();
        }
    }

    public void avanzar() {
        if (modelo.avanzar() != null) {
            mostrarPaginaActual();
        } else {
            vista.mostrarPaginaActual("Sin página siguiente");
        }
    }

    public void mostrarVista() {
        vista.mostrar();
    }

    public void setVista(VistaHistorial vista) {
        this.vista = vista;
    }
}