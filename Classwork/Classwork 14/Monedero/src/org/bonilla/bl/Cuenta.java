package org.bonilla.bl;

import java.time.LocalDate;

public class Cuenta {
    private int cantCuentas;
    private int numCuenta;
    private double saldo;
    private LocalDate fechaCreacion;
    private String duenio;

    public Cuenta(int numCuenta, double saldo, LocalDate fechaCreacion, String duenio) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.duenio = duenio;
    }

    public int getCantCuentas() {
        return cantCuentas;
    }

    public void setCantCuentas(int cantCuentas) {
        this.cantCuentas = cantCuentas;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public void depositar(int monto) {
        this.saldo += monto;
    }

    public void retirar(int monto) {
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cantCuentas=" + cantCuentas +
                ", numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                ", fechaCreacion=" + fechaCreacion +
                ", duenio='" + duenio + '\'' +
                '}';
    }
}
