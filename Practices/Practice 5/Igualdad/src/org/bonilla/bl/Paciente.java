package org.bonilla.bl;

import java.time.LocalDate;

public class Paciente extends Persona {
    private LocalDate fechaIngreso;
    private Medico medico;

    public Paciente(String cedula, String nombre, String apellidos, LocalDate fechaIngreso, Medico medico) {
        super(cedula, nombre, apellidos);
        this.fechaIngreso = fechaIngreso;
        this.medico = medico;
    }

    public Paciente(String cedula, String nombre, String apellidos, LocalDate fechaIngreso) {
        super(cedula, nombre, apellidos);
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        String infoMedico = (medico == null) ? "\n| Medico: Ninguno" :
                "\n| [M] Cédula: " + medico.getCedula() +
                "\n| [M] Nombre: " + medico.getNombre() +
                "\n| [M] Apellidos: " + medico.getApellidos() +
                "\n| [M] Número de colegiado: " + medico.getNumColegiado() +
                "\n| [M] Especialidad: " + medico.getEspecialidad();
        return super.toString() +
                "\n| Fecha de ingreso: " + fechaIngreso +
                infoMedico;
    }
}
