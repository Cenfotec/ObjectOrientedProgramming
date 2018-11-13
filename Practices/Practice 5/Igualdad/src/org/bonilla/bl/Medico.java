package org.bonilla.bl;

import java.util.Objects;

public class Medico extends Persona {
    private int numColegiado;
    private String especialidad;

    public Medico(String cedula, String nombre, String apellidos, int numColegiado, String especialidad) {
        super(cedula, nombre, apellidos);
        this.numColegiado = numColegiado;
        this.especialidad = especialidad;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return numColegiado == medico.numColegiado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numColegiado);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n| Número de colegiado: " + numColegiado +
                "\n| Especialidad: " + especialidad;
    }
}
