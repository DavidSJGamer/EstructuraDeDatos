/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class Pagina {
    private String URL;
    private String titulo;

    public Pagina(String URL, String titulo) {
        this.URL = URL;
        this.titulo = titulo;
    }

    public String getURL() {
        return URL;
    }

    public String getTitulo() {
        return titulo;
    }
}

