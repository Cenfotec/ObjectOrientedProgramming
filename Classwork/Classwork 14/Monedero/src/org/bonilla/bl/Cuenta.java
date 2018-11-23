package org.bonilla.bl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cuenta {
    protected int cantCuentas;
    protected int numCuenta;
    protected double saldo;
    protected LocalDate fechaCreacion;
    protected String duenio; // Cliente duenio
    protected ArrayList<Operacion> listaOperacion;

    public Cuenta(int cantCuentas, int numCuenta, double saldo, LocalDate fechaCreacion, String duenio, ArrayList<Operacion> listaOperacion) {
        this.cantCuentas = cantCuentas;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.duenio = duenio;
        this.listaOperacion = listaOperacion;
    }

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

    public ArrayList<Operacion> getListaOperacion() {
        return listaOperacion;
    }

    public void setListaOperacion(ArrayList<Operacion> listaOperacion) {
        this.listaOperacion = listaOperacion;
    }

    public void registrarOperacion(int numero, String tipo, double monto) {
        Operacion o = new Operacion(numero, tipo, monto, LocalDate.now());
        listaOperacion.add(o);
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
