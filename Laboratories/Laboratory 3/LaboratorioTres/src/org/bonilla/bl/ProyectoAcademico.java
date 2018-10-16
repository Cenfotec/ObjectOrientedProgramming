package org.bonilla.bl;

import java.time.LocalDate;

public class ProyectoAcademico extends Proyecto {
    private Usuario usuario;

    public ProyectoAcademico(String codigo, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        super(codigo, nombre, descripcion, fechaInicio, fechaFin);
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return super.toString() + "," + usuario;
    }
}
