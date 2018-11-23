package org.bonilla.dl;

import cr.ac.ucenfotec.connectivity.Conector;
import org.bonilla.bl.Cuenta;

import java.time.LocalDate;

public class MultiCuenta {

    public MultiCuenta() { }

    public Cuenta crearCuenta(String idCliente, int numCuenta, double saldo, LocalDate fechaCreacion, String duenio) throws Exception {
        Cuenta cuenta = null;
        String query;
        query = "INSERT INTO Cuenta(idCuenta, saldo, fechaCreacion, idCliente) " +
        "VALUES(" + numCuenta + "," + saldo + ",'" + fechaCreacion + "'," + idCliente + ");";
        try {
            Conector.getConector().ejecutarSQL(query);
            cuenta = new Cuenta(numCuenta, saldo, fechaCreacion, duenio);
        } catch(Exception e) {
            throw e;
        }
        return cuenta;
    }
}
