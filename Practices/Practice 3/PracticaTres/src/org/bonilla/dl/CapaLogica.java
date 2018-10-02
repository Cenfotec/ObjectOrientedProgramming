package org.bonilla.dl;

import org.bonilla.bl.Inquilino;
import org.bonilla.bl.Propiedad;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Inquilino> listaInquilinos;
    private ArrayList<Propiedad> listaPropiedades;

    public CapaLogica() {
        listaInquilinos = new ArrayList<>();
        listaPropiedades = new ArrayList<>();
    }

    // Registrar inquilino
    public void registrarInquilino(Inquilino inquilino) {
        listaInquilinos.add(inquilino);
    }

    // Registrar propiedad
    public void registrarPropiedad(Propiedad propiedad) {
        listaPropiedades.add(propiedad);
    }

    // Getters
    public ArrayList<Inquilino> getListaInquilinos() {
        ArrayList<Inquilino> lista = new ArrayList<>(listaInquilinos);
        return lista;
    }

    public ArrayList<Propiedad> getListaPropiedades() {
        ArrayList<Propiedad> lista = new ArrayList<>(listaPropiedades);
        return lista;
    }
}
