package org.bonilla.bl;

import java.time.LocalDate;

public class CuentaAhorro extends Cuenta {
    private int cantCuentas;
    private double cuotaMantenimiento;

    public CuentaAhorro(int numCuenta, double saldo, LocalDate fechaCreacion, String duenio, int cantCuentas, double cuotaMantenimiento) {
        super(numCuenta, saldo, fechaCreacion, duenio);
        this.cantCuentas = cantCuentas;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    @Override
    public int getCantCuentas() {
        return cantCuentas;
    }

    @Override
    public void setCantCuentas(int cantCuentas) {
        this.cantCuentas = cantCuentas;
    }

    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "cantCuentas=" + cantCuentas +
                ", cuotaMantenimiento=" + cuotaMantenimiento +
                '}';
    }
}
