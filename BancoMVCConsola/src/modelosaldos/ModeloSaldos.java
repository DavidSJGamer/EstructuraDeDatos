/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelosaldos;

/**
 *
 * @author DavidSJ
 */
public class ModeloSaldos {
    
    private int saldo;

    public ModeloSaldos(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void IngresarSaldo(int cantidad){
        this.saldo += cantidad;
    } 
    
    public void Retirar(int cantidad){
        this.saldo -= cantidad;
    }
    
    public int ConsultarSaldo(){
        return saldo;
    }
    
}


