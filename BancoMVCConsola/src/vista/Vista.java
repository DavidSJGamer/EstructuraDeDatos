/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelosaldos.ModeloSaldos;

/**
 *
 * @author DavidSJ
 */
public class Vista {
    private Scanner leer;
    
    public Vista(){
        this.leer = new Scanner(System.in);
    }
    
    public int MostrarMenu(){
        System.out.println("|------------------BIENVENIDO------------------|");
        System.out.println("Que desea realizar hoy?");
        System.out.println("1. Ingresar Saldo:");
        System.out.println("2. Retirar Saldo:");
        System.out.println("3. Consultar Saldo:");
        System.out.println("4. Salir:");
        System.out.print("Digite el numero:");
        int Opcion = leer.nextInt();
        leer.nextLine();
        return Opcion;
    }
    public int IngresarSaldo(){
        System.out.println("------------------------------------------------");
        System.out.print("Ingrese la cantidad:");
        int saldo = leer.nextInt();
        leer.nextLine();
        return saldo;
    }
    
    public int Retirar(){
        System.out.println("------------------------------------------------");
        System.out.print("Ingrese la cantidad a retirar:");
        int saldo = leer.nextInt();
        leer.nextLine();
        return saldo;
    }
    public void ConsultarSaldo(int saldo){
        System.out.println("------------------------------------------------");
        System.out.println("Su saldo es: " + saldo);
    }
    
    public void Salir(){
        System.out.println("------------------------------------------------");
        System.out.print("Desea salir?");
        System.out.println("1. Si:");
        System.out.println("2. No:");
        int opcion2 = leer.nextInt();
        leer.nextLine();
    }
    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
