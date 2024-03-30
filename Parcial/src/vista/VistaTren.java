/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class VistaTren {
    private Scanner Leer;

    public VistaTren() {
        this.Leer = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerNombre() {
        System.out.print("Ingrese su nombre: ");
        return Leer.nextLine().trim();
    }

    public int menuInicial() {
        System.out.println("------------------TREN MARAVILLAS----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Ingresar su nombre");
        System.out.println("2. Iniciar Viaje");
        System.out.println("3. Ver Viajes");
        System.out.println("4. Eliminar Viajes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
    
    public String obtenerRespuesta() {
        System.out.print("Escribe tu estacion: ");
        return Leer.nextLine().trim();
    }
}
