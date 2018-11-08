package org.bonilla.bl;

public abstract class Figura {
    protected double area;
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public Figura() { }

    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n----------" +
               "\n| Área: " + area +
               "\n| Tipo: " + tipo;
    }
}
