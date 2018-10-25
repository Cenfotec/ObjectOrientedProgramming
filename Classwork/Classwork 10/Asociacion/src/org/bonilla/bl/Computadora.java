package org.bonilla.bl;

public class Computadora {
    private String serie;
    private String marca;
    private Empleado responsable;

    public Computadora(String serie, String marca, Empleado responsable) {
        this.serie = serie;
        this.marca = marca;
        this.responsable = responsable;
    }

    public Computadora(String serie, String marca) {
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

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "\n----------" +
               "\n| Serie: " + serie +
               "\n| Marca: " + marca +
               responsable.toString();
    }
}
