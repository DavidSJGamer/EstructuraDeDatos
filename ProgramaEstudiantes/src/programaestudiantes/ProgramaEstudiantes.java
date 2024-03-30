/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaestudiantes;

import controladorpe.ControladorPE;
import vistape.VistaPE;

/**
 *
 * @author DavidSJ
 */
public class ProgramaEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPE vista = new VistaPE();
        ControladorPE cont = new ControladorPE(vista);
        cont.iniciar();
    }
    
}
