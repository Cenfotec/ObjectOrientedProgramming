package org.bonilla.dl;

import cr.ac.ucenfotec.connectivity.Conector;
import org.bonilla.bl.Cliente;

public class MultiCliente {

    public MultiCliente() { }

    public Cliente crearCliente(String cedula, String nombre, String apellido) {
        Cliente c = null;
        String query;
        query = "INSERT INTO Cliente(idCliente, nombre, apellido) " +
                "VALUES('" + cedula +"','" + nombre + "','" + apellido + "');";
        try {
            Conector.getConector().ejecutarSQL(query);
            c = new Cliente(cedula, nombre, apellido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}
