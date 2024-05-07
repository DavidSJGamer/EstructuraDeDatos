/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author David Jimenez - Andres Gonzalez
 */
public class Tarifa {
    private double precioBase;
    private double precioPorKm;
    
    public Tarifa(double precioBase, double precioPorKm) {
        this.precioBase = precioBase;
        this.precioPorKm = precioPorKm;
    }
    
    public double calcularTarifa(double distancia) {
        return precioBase + (precioPorKm * distancia);
    }
}
