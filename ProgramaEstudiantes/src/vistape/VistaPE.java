/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistape;

import java.util.Scanner;
import modelodeusuarios.ModeloDeUsuarios;

/**
 *
 * @author DavidSJ
 */
public class VistaPE {
    private Scanner leer;
    
    public VistaPE(){
        this.leer = new Scanner(System.in);
    }
    
    public int MostrarMenu(){
        System.out.println("|------------------BIENVENIDO------------------|");
        System.out.println("Que desea realizar hoy?");
        System.out.println("1. Agregar Estudiante:");
        System.out.println("2. Actualizar Estudiante:");
        System.out.println("3. Eliminar Estudiante:");
        System.out.println("4. Ver Estudiantes:");
        System.out.println("5. Salir:");
        System.out.print("Digite el numero:");
        int Opcion = leer.nextInt();
        leer.nextLine();
        return Opcion;
    }
    
    public ModeloDeUsuarios CrearEstudiante(){
        System.out.println("|----------------------------------------------|");
        System.out.print("Nombre del estudiante:");
        String Nombre = leer.nextLine();
        System.out.print("ID del estudiante:");
        String ID = leer.nextLine();
        return new ModeloDeUsuarios(Nombre, ID);
    }
    public ModeloDeUsuarios EliminarEstudiante(String Id){
        System.out.println("|----------------------------------------------|");
        System.out.println("ID del estudiante:");
        String ID = leer.nextLine();
        leer.nextLine();
        return this.EliminarEstudiante(ID);
    }
    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void printDetallesEstudiante(ModeloDeUsuarios nombre, ModeloDeUsuarios id) {
        System.out.println("|----------------------------------------------|");
        System.out.println("ID del estudiante que desea ver:");
        System.out.println("|----------------------------------------------|");
        System.out.println("Detalles del estudiante:");
        System.out.println("Nombre: " + nombre.getNombre() );
        System.out.println("ID: " + id.getId());
    }
    public ModeloDeUsuarios ModificarEstudiante(){
        System.out.println("------------------------------------------------");
        System.out.print("Ingrese el Id del estudiante que desea modificar: ");
        String n = leer.nextLine();
        System.out.print("Ingrese el nuevo nombre del estudiante: ");
        String NuevoNombre = leer.nextLine();
        System.out.print("Ingrese el nuevo ID del estudiante: ");
        String NuevoId = leer.nextLine();
        return new ModeloDeUsuarios(NuevoNombre, NuevoId);
    }
}
