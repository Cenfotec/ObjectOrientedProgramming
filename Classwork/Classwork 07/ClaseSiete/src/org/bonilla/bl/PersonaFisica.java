package org.bonilla.bl;

public class PersonaFisica extends Persona {
    private String apellido;
    private char estadoCivil;
    private double estatura;
    private double peso;

    public PersonaFisica(String nombre, String cedula, int edad, String apellido, char estadoCivil, double estatura, double peso) {
        super(nombre, cedula, edad);
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\n+----------" +
                super.toString() +
                "\n| Apellido: " + apellido +
                "\n| Estado civíl: " + estadoCivil +
                "\n| Estatura: " + estatura +
                "\n| Peso: " + peso;
    }
}
