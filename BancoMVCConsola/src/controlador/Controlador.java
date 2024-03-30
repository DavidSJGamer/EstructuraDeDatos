/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelosaldos.ModeloSaldos;
import vista.Vista;

/**
 *
 * @author DavidSJ
 */
public class Controlador {

    private ModeloSaldos model;
    private Vista view;

    public Controlador(Vista view) {
        this.view = view;
        this.model = new ModeloSaldos(0);
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.MostrarMenu(); 
            switch (opcion) {
                case 1:
                    int saldoIngresado = view.IngresarSaldo();
                    model.IngresarSaldo(saldoIngresado);
                    view.MostrarMensaje("Saldo Agregado Con Exito");
                    break;
                case 2:
                    int saldoRetirado = view.Retirar();
                    model.Retirar(saldoRetirado);
                    view.MostrarMensaje("Saldo Retirado Con Exito");
                    break;
                case 3:
                    int saldoConsultado = model.ConsultarSaldo();
                    view.ConsultarSaldo(saldoConsultado);
                    break;
                case 4:
                    view.MostrarMensaje("Hasta Luego!");
                    break;
            }
        } while (opcion != 4);
    }
}
