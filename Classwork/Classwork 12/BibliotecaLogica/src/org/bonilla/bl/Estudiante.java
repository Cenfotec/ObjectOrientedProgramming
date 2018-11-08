package org.bonilla.bl;

public class Estudiante extends Persona {
    private String carrera;
    private int creditos;

    /**
     * @param nombre El nombre del estudiante.
     * @param apellido El apellido del estudiante.
     * @param numeroCarne El número de carnte del estudiante en la Universidad.
     * @param carrera La carrera donde está matriculado el estudiante.
     * @param creditos La cantiad de creditos que lleva el estudiante.
     */
    public Estudiante(String nombre, String apellido, String numeroCarne, String carrera, int creditos) {
        super(nombre, apellido, numeroCarne);
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

    public String desplegarInfoUsuario() {
        return "\n| Nombre: " + super.nombre +
                "\n| Apellido: " + super.apellido +
                "\n| Número de Carné: " + super.identificacion +
                "\n| Carrera: " + carrera +
                "\n| Creditos: " + creditos;
    }

    public String desplegarInfoItem() {
        return desplegarInfoUsuario();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}
