/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DavidSJ
 */
public class ClaveEncriptada {
    private final static String caracteresOriginales = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String caracteresEncriptados = "!@#$%^&*()_+{}:\"<>?|[];',./abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char encriptar(char caracterOriginal) {
        int indice = caracteresOriginales.indexOf(caracterOriginal);
        if (indice != -1) {
            return caracteresEncriptados.charAt(indice);
        } else {
            return caracterOriginal;
        }
    }

    public static String encriptar(String textoOriginal) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            textoEncriptado.append(encriptar(textoOriginal.charAt(i)));
        }
        return textoEncriptado.toString();
    }

    public static char desencriptar(char caracterEncriptado) {
        int indice = caracteresEncriptados.indexOf(caracterEncriptado);
        if (indice != -1) {
            return caracteresOriginales.charAt(indice);
        } else {
            return caracterEncriptado;
        }
    }

    public static String desencriptar(String textoEncriptado) {
        StringBuilder textoDesencriptado = new StringBuilder();
        for (int i = 0; i < textoEncriptado.length(); i++) {
            textoDesencriptado.append(desencriptar(textoEncriptado.charAt(i)));
        }
        return textoDesencriptado.toString();
    }
}
