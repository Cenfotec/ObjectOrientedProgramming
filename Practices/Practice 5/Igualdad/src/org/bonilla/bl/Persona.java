package org.bonilla.bl;

import java.util.Objects;

public class Persona {
    protected String cedula;
    protected String nombre;
    protected String apellidos;

    public Persona(String cedula, String nombre, String apellidos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Persona) {
            Persona persona = (Persona) o;
            return Objects.equals(cedula, persona.cedula);
        }

        if (o instanceof Persona) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(cedula, persona.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre, apellidos);
    }

    @Override
    public String toString() {
        return "\n----------" +
                "\n| Cédula: " + cedula +
                "\n| Nombre: " + nombre +
                "\n| Apellidos: " + apellidos;
    }
}
