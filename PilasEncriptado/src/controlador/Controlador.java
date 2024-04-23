/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.ClaveEncriptada;
import modelos.ListaDobleEnlazada;
import modelos.Nodo;
import modelos.PilaNodo;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {
    private Vista vista;

    public Controlador() {
        this.vista = new Vista();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            String opcion = vista.Mostrarbienvenida();
            switch (opcion) {
                case "1":
                    encriptarContraseña();
                    break;
                case "2":
                    desencriptarContraseña();
                    break;
                case "3":
                    continuar = false;
                    vista.mostrarMensaje("Hasta luego!");
                    break;
                default:
                    vista.mostrarError("Opcion invalida. Por favor, seleccione una opcion valida.");
                    break;
            }
        }
        vista.cerrarScanner();
    }

    private void encriptarContraseña() {
        String contraseña = vista.solicitarContraseña();
        String contraseñaEncriptada = ClaveEncriptada.encriptar(contraseña);
        vista.mostrarContraseñaEncriptada(contraseñaEncriptada);
    }

    private void desencriptarContraseña() {
        String contraseñaEncriptada = vista.solicitarContraseñaEncriptada();
        String contraseñaDesencriptada = ClaveEncriptada.desencriptar(contraseñaEncriptada);
        vista.mostrarContraseñaDesencriptada(contraseñaDesencriptada);
    }
}