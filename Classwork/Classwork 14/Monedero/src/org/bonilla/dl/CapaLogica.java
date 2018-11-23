package org.bonilla.dl;

import org.bonilla.bl.Cliente;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Cliente> listaCliente;

    public CapaLogica() {
        listaCliente = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }

    public ArrayList<Cliente> getListaCliente() {
        ArrayList<Cliente> lista = new ArrayList<>(listaCliente);
        return lista;
    }
}
