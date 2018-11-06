package org.bonilla.bl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {

    @org.junit.jupiter.api.Test
    void getCantidad() {
    }

    @org.junit.jupiter.api.Test
    void setCantidad() {
    }

    @org.junit.jupiter.api.Test
    void getMoneda() {
    }

    @org.junit.jupiter.api.Test
    void setMoneda() {
    }

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    public void testSumaSimple() {
        Money m = new Money(10, "EUR");
        Money m2 = new Money(20, "EUR");
        Money m3 = new Money(30, "EUR");

        Money result = m.add(m2);
        assertEquals(result, m3);
    }
}