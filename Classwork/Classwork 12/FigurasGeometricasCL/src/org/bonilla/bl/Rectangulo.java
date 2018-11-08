package org.bonilla.bl;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String tipo) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = base*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n| Base: " + base +
               "\n| Altura: " + altura;
    }
}
