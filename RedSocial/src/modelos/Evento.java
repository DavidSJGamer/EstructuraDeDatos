/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDateTime;

/**
 *
 * @author DavidSJ
 */
public class Evento {
    private String publicacion, reaccion, comentario;
    private int idEvento;
    private LocalDateTime Fecha;

    public Evento(String publicacion, String reaccion, String comentario, int idEvento, LocalDateTime Fecha) {
        this.publicacion = publicacion;
        this.reaccion = reaccion;
        this.comentario = comentario;
        this.idEvento = idEvento;
        this.Fecha = Fecha;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getReaccion() {
        return reaccion;
    }

    public void setReaccion(String reaccion) {
        this.reaccion = reaccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }

    
    
}
