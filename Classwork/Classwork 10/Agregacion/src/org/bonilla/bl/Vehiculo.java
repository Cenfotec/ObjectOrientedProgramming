package org.bonilla.bl;

public class Vehiculo {
    private String serie;
    private String marca;
    private Motor motor;

    public Vehiculo(String serie, String marca, Motor motor) {
        this.serie = serie;
        this.marca = marca;
        this.motor = motor;
    }

    public Vehiculo(String serie, String marca) {
        this.serie = serie;
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "\n----------" +
               "\n| Serie: " + serie +
               "\n| Marca: " + marca +
               motor.toString();
    }
}
