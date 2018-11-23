package org.bonilla.dl;

import cr.ac.ucenfotec.connectivity.Conector;
import org.bonilla.bl.CuentaCorriente;

import java.time.LocalDate;

public class MultiCuentaCorriente {

    public MultiCuentaCorriente() { }

    public CuentaCorriente crearCuentaCorriente(int numCuenta, double saldo, LocalDate fechaCreacion, String duenio, int cantCuentas, int operacionesExentas, double cuotaOperaciones) {
        CuentaCorriente cc = null;
        String query;
        query = "INSERT INTO CuentaCorriente(idCuenta, cantCuentas, cuotaOperaciones, operacionesExentas) " +
        "VALUES(" + numCuenta + "," + cantCuentas + "," + operacionesExentas + "," + cuotaOperaciones + ");";
        try {
            Conector.getConector().ejecutarSQL(query);
            cc = new CuentaCorriente(numCuenta, saldo, fechaCreacion, duenio, cantCuentas, operacionesExentas, cuotaOperaciones);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cc;
    }
}
