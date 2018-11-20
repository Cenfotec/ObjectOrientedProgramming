package org.bonilla.tl;

import org.bonilla.bl.Cuenta;
import org.bonilla.dl.CapaLogica;
import org.bonilla.dl.MultiCuenta;

import java.time.LocalDate;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    public void registrarCuenta(int numCuenta, double saldo, String duenio) throws Exception {
        LocalDate fecha = LocalDate.now();
        Cuenta cuenta = new MultiCuenta().crearCuenta(numCuenta, saldo, fecha, duenio);
        logica.registrarCuenta(cuenta);
    }
}
