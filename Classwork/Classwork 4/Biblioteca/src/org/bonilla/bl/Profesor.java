package org.bonilla.bl;

import java.time.LocalDate;

public class Profesor {
    private String nombre;
    private String apellido;
    private String identificacion;
    private int tipoContrato;
    private LocalDate fechaContratacion;

    public Profesor(String nombre, String apellido, String numeroCedula, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = numeroCedula;
        this.fechaContratacion = fechaContratacion;
    }

    public Profesor() { }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", tipoContrato=" + tipoContrato +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}
