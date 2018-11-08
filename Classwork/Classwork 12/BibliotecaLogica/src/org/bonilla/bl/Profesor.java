package org.bonilla.bl;

import java.time.LocalDate;

public class Profesor extends Persona {
    private int tipoContrato;
    private LocalDate fechaContratacion;

    public Profesor(String nombre, String apellido, String identificacion, LocalDate fechaContratacion) {
        super(nombre, apellido, identificacion);
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

    public String desplegarInfoUsuario() {
        return "\n| Nombre: " + super.nombre +
                "\n| Apellido: " + super.apellido +
                "\n| Identificación: " + super.identificacion +
                "\n| Tipo de Contrato: " + tipoContrato +
                "\n| Fecha de Contratación: " + fechaContratacion;
    }

    public String desplegarInfoItem() {
        return desplegarInfoUsuario();
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
