package org.bonilla.dl;

import org.bonilla.bl.Cuenta;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Cuenta> listaCuenta;

    public CapaLogica() {
        listaCuenta = new ArrayList<>();
    }

    public void registrarCuenta(Cuenta cuenta) {
        listaCuenta.add(cuenta);
    }

    public ArrayList<Cuenta> getListaCuenta() {
        ArrayList<Cuenta> lista = new ArrayList<>(listaCuenta);
        return lista;
    }
}
