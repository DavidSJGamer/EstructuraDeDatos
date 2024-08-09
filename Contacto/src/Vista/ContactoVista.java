/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ContactoModelo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DavidSJ
 */
public class ContactoVista {
    private Scanner scanner;

    public ContactoVista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Modificar Contacto");
        System.out.println("4. Eliminar Contacto");
        System.out.println("5. Ver Contactos");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opcion: ");
        return scanner.nextInt();
    }

    public ContactoModelo agregarContacto() {
        scanner.nextLine(); 
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese nombre del Contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese numero del Contacto: ");
        String id = scanner.next();
        return new ContactoModelo(nombre, id);
    }

    public String buscarContacto() {
        scanner.nextLine(); 
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese el nombre del Contacto que desea buscar: ");
        return scanner.nextLine();
    }

    public ContactoModelo modificarContacto(String id) {
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese nuevo nombre del Contacto: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese nuevo numero del Contacto: ");
        String nuevoId = scanner.next();
        return new ContactoModelo(nuevoNombre, nuevoId);
    }

    public String eliminarContacto() {
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese el numero del Contacto que desea eliminar: ");
        return scanner.next();
    }

    public void mostrarContacto(ArrayList<ContactoModelo> contactos) {
        System.out.println("--------------------------------------------------");
        System.out.println("Lista de Contactos:");
        for (ContactoModelo contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Numero: " + contacto.getId());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}