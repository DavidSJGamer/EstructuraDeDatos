/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DavidSJ
 */
public class Acertijos {
    private String pregunta;
    private String respuesta;

    public Acertijos(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public boolean comprobarRespuesta(String respuestaUsuario) {
        return respuestaUsuario.equalsIgnoreCase(respuesta);
    }

    public String getPregunta() {
        return pregunta;
    }
}
