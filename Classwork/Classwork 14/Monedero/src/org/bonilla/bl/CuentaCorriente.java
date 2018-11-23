package org.bonilla.bl;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta {
    private int cantCuentas;
    private int operacionesExentas;
    private double cuotaOperaciones;

    public CuentaCorriente(int numCuenta, double saldo, LocalDate fechaCreacion, String duenio, int cantCuentas, int operacionesExentas, double cuotaOperaciones) {
        super(numCuenta, saldo, fechaCreacion, duenio);
        this.cantCuentas = cantCuentas;
        this.operacionesExentas = operacionesExentas;
        this.cuotaOperaciones = cuotaOperaciones;
    }

    @Override
    public int getCantCuentas() {
        return cantCuentas;
    }

    @Override
    public void setCantCuentas(int cantCuentas) {
        this.cantCuentas = cantCuentas;
    }

    public int getOperacionesExentas() {
        return operacionesExentas;
    }

    public void setOperacionesExentas(int operacionesExentas) {
        this.operacionesExentas = operacionesExentas;
    }

    public double getCuotaOperaciones() {
        return cuotaOperaciones;
    }

    public void setCuotaOperaciones(double cuotaOperaciones) {
        this.cuotaOperaciones = cuotaOperaciones;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "cantCuentas=" + cantCuentas +
                ", operacionesExentas=" + operacionesExentas +
                ", cuotaOperaciones=" + cuotaOperaciones +
                '}';
    }
}
