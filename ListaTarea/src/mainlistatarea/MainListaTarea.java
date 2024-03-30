/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainlistatarea;

import java.util.Scanner;
import mainlistatarea.ListaTareas;
/**
 *
 * @author DavidSJ
 */
public class MainListaTarea {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        ListaTareas lista = new ListaTareas();
        boolean Salir = false;
        while(!Salir){
            System.out.println("|------------------BIENVENIDO------------------|");
            System.out.println("Que desea realizar hoy?");
            System.out.println("1. Agregar Tarea:");
            System.out.println("2. Completar Tarea:");
            System.out.println("3. Listar Tareas:");
            System.out.println("4. Eliminar Tareas:");
            System.out.println("5. Contar Tareas:");
            System.out.println("6. Salir:");
            System.out.print("Digite el numero:");
            int Opcion = leer.nextInt();
            leer.nextLine();
                switch(Opcion){
                    case 1:
                        System.out.println("Agregar Tarea:");
                        String AgregarTarea = leer.nextLine();
                        lista.agregarTarea(AgregarTarea);
                        break;
                    case 2:
                        System.out.println("Completar Tarea:");
                        String CompletarTarea = leer.nextLine();
                        lista.agregarTarea(CompletarTarea);
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Eliminar Tarea:");
                        String EliminarTarea = leer.nextLine();
                        lista.EliminarTarea(EliminarTarea);
                        break;
                    }
        }
    }
}

