package org.bonilla.tl;

import org.bonilla.bl.Cliente;
import org.bonilla.bl.CuentaAhorro;
import org.bonilla.bl.CuentaCorriente;
import org.bonilla.dl.CapaLogica;
import org.bonilla.dl.MultiCliente;
import org.bonilla.dl.MultiCuentaAhorro;
import org.bonilla.dl.MultiCuentaCorriente;

import java.time.LocalDate;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    public void registrarCliente(String cedula, String nombre, String apellido) {
        Cliente c = new MultiCliente().crearCliente(cedula, nombre, apellido);
        logica.registrarCliente(c);
    }
}
