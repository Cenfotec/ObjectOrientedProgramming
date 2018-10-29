package org.bonilla.bl;

public class Linea {
    private int cantidad;
    private String codigo;
    private String descripcion;
    private double precio;

    public Linea(int cantidad, String codigo, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double calcularCosto() {
        return cantidad*precio;
    }

    @Override
    public String toString() {
        return " " + cantidad + "    " + codigo + "   " + descripcion +
               "         " + precio + "         " + calcularCosto();
    }
}
