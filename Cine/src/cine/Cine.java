/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba su nombre:");
        String Nombre = "";
        Nombre = scan.next();
        System.out.println("Buenos dias usuario " + Nombre + " que pelicula desea ver hoy?");
        System.out.println("1: Deadpool 3");
        System.out.println("2: Avengers");
        System.out.println("3: El Rey Leon");
        System.out.println("4: Five Nights at Freddys");
        System.out.print("Escriba el numero de la pelicula que desea ver:");
        int Pelicula = 0;
        Pelicula = scan.nextInt();
        switch (Pelicula){
            case 1:
                System.out.println(Nombre + " Su pelicula es Deadpool 3");
                System.out.println("En que sala desea ver la pelicula?");
                System.out.println("1: Sala 1 (2D)");
                System.out.println("2: Sala 2 (3D)");
                System.out.println("3: Sala 3 VIP (2D)");
                System.out.println("4: Sala 4 VIP (3D)");
                System.out.print("Escriba el numero de la sala que desea ver la pelicula:");
                int Sala = 0;
                Sala = scan.nextInt();
                    switch (Sala){
                        case 1:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Deadpool 3 en la sala 1 de 2D");
                        break;
                        case 2:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Deadpool 3 en la sala 2 de 3D");
                        break;
                        case 3:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Deadpool 3 en la sala 3 VIP de 2D");
                        break;
                        case 4:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Deadpool 3 en la sala 4 VIP de 3D");
                    }
            break;
            case 2:
                System.out.println(Nombre + " Su pelicula es Avengers");
                System.out.println("En que sala desea ver la pelicula?");
                System.out.println("1: Sala 1 (2D)");
                System.out.println("2: Sala 2 (3D)");
                System.out.println("3: Sala 3 VIP (2D)");
                System.out.println("4: Sala 4 VIP (3D)");
                System.out.print("Escriba el numero de la sala que desea ver la pelicula:");
                int Sala2 = 0;
                Sala2 = scan.nextInt();
                    switch (Sala2){
                        case 1:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Avengers en la sala 1 de 2D");
                        break;
                        case 2:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Avengers en la sala 2 de 3D");
                        break;
                        case 3:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Avengers en la sala 3 VIP de 2D");
                        break;
                        case 4:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Avengers en la sala 4 VIP de 3D");
                    }
            break;
            case 3:
                System.out.println(Nombre + " Su pelicula es El Rey Leon");
                System.out.println("En que sala desea ver la pelicula?");
                System.out.println("1: Sala 1 (2D)");
                System.out.println("2: Sala 2 (3D)");
                System.out.println("3: Sala 3 VIP (2D)");
                System.out.println("4: Sala 4 VIP (3D)");
                System.out.print("Escriba el numero de la sala que desea ver la pelicula:");
                int Sala3 = 0;
                Sala3 = scan.nextInt();
                    switch (Sala3){
                        case 1:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula El Rey Leon en la sala 1 de 2D");
                        break;
                        case 2:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula El Rey Leon en la sala 2 de 3D");
                        break;
                        case 3:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula El Rey Leon en la sala 3 VIP de 2D");
                        break;
                        case 4:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula El Rey Leon en la sala 4 VIP de 3D");
                    }
            break;
            case 4:
                System.out.println(Nombre + " Su pelicula es Five Nights at Freddys");
                System.out.println("En que sala desea ver la pelicula?");
                System.out.println("1: Sala 1 (2D)");
                System.out.println("2: Sala 2 (3D)");
                System.out.println("3: Sala 3 VIP (2D)");
                System.out.println("4: Sala 4 VIP (3D)");
                System.out.print("Escriba el numero de la sala que desea ver la pelicula:");
                int Sala4 = 0;
                Sala4 = scan.nextInt();
                    switch (Sala4){
                        case 1:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Five Nights at Freddys en la sala 1 de 2D");
                        break;
                        case 2:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Five Nights at Freddys en la sala 2 de 3D");
                        break;
                        case 3:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Five Nights at Freddys en la sala 3 VIP de 2D");
                        break;
                        case 4:
                            System.out.println("Usuario " + Nombre + " disfrute de la pelicula Five Nights at Freddys en la sala 4 VIP de 3D");
                    }
            break;
        }
    }
    
}
