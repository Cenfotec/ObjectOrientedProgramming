package org.bonilla.bl;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String carrera;
    private int creditos;

    public Estudiante(String nombre, String apellido, String numeroCarne, String carrera, int creditos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = numeroCarne;
        this.carrera = carrera;
        this.creditos = creditos;
    }

    public Estudiante() { }

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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", carrera='" + carrera + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}
