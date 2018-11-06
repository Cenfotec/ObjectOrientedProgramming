package org.bonilla.bl;

public class Money {
    private int cantidad;
    private String moneda;

    public Money(int cantidad, String moneda) {
        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Money add(Money m) {
        int total = getCantidad() + m.getCantidad();
        return new Money(total, getMoneda());
    }

    @Override
    public boolean equals(Object obj) {
        Money money;
        boolean sonIguales = false;
        if (obj instanceof Money) {
            money = (Money) obj;
            sonIguales = money.getMoneda().equals(getMoneda()) && (money.getCantidad() == getCantidad());
        }
        return sonIguales;
    }

    @Override
    public String toString() {
        return "\n----------" +
                "\n| Cantidad: " + cantidad +
                "\n| Moneda: " + moneda;
    }
}
