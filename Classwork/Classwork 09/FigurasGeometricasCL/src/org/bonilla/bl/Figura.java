package org.bonilla.bl;

public class Figura {
    protected double area;
    protected String tipo;

    public Figura(double area, String tipo) {
        this.area = area;
        this.tipo = tipo;
    }

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public Figura() { }

    public double calcularArea() {
        return 0;
    }

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
