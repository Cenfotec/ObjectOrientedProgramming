package org.bonilla.bl;

public class Estudiante extends Persona {
    private String carrera;
    private int creditos;

    public Estudiante(String nombre, String apellido, String identificacion, String carrera, int creditos) {
        super(nombre, apellido, identificacion);
        this.carrera = carrera;
        this.creditos = creditos;
    }

    public Estudiante() { }

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
        return " Carrera: " + carrera + " Creditos: " + creditos;
    }
}
