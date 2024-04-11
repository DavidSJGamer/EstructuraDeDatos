/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.Nodo;
import modelos.PilaNodo;

/**
 *
 * @author DavidSJ
 */
public class Controlador {

    public static int evaluarExpresion(String expresion) {
        PilaNodo pila = new PilaNodo();

        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esNumero(token)) {
                pila.push(new Nodo(token));
            } else {
                Nodo operand2 = pila.pop();
                Nodo operand1 = pila.pop();
                if (operand1 == null || operand2 == null) {
                    throw new IllegalArgumentException("Expresion mal formada");
                }
                int resultado = aplicarOperador(token, Integer.parseInt(operand1.getDato()), Integer.parseInt(operand2.getDato()));
                pila.push(new Nodo(String.valueOf(resultado)));
            }
        }

        Nodo resultadoFinal = pila.pop();
        if (resultadoFinal == null || !pila.estaVacia()) {
            throw new IllegalArgumentException("Expresion mal formada");
        }
        return Integer.parseInt(resultadoFinal.getDato());
    }

    private static boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int aplicarOperador(String operador, int operand1, int operand2) {
        switch (operador) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division por cero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador no valido: " + operador);
        }
    }
}