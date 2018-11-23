package org.bonilla.dl;

import cr.ac.ucenfotec.connectivity.Conector;
import org.bonilla.bl.CuentaAhorro;

import java.time.LocalDate;

public class MultiCuentaAhorro {

    public MultiCuentaAhorro() { }

    public CuentaAhorro crearCuentaAhorro(int numCuenta, double saldo, LocalDate fechaCreacion, String duenio, int cantCuentas, double cuotaMantenimiento) {
        CuentaAhorro ca = null;
        String query;
        query = "INSERT INTO CuentaAhorro(idCuenta, cantCuentas, cuotaMantenimiento) " +
                "VALUES(" + numCuenta + "," + cantCuentas + "," + cuotaMantenimiento + ");";
        try {
            Conector.getConector().ejecutarSQL(query);
            ca = new CuentaAhorro(numCuenta, saldo, fechaCreacion, duenio, cantCuentas, cuotaMantenimiento);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ca;
    }
}
