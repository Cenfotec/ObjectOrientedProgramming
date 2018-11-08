package org.bonilla.bl;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado*lado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n| Lado: " + lado;
    }
}
