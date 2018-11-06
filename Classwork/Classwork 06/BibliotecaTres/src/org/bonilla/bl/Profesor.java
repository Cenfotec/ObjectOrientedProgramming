package org.bonilla.bl;

import java.time.LocalDate;

public class Profesor extends Persona {
    private int tipoContrato;
    private LocalDate fechaContratacion;

    public Profesor(String nombre, String apellido, String identificacion, int tipoContrato, LocalDate fechaContratacion) {
        super(nombre, apellido, identificacion);
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
    }

    public Profesor() { }

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
        return " Tipo de contrato: " + tipoContrato + " Fecha de contratación: " + fechaContratacion;
    }
}
