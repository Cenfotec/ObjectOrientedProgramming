package org.bonilla.clasedos;

import java.util.ArrayList;

public class CL {
    private ArrayList<Laboratorio> lista;

    public void setLista() {
        lista = new ArrayList<>();
    }

    public ArrayList<Laboratorio> getLista() {
        return lista;
    }

    public void registrarLaboratorio(Laboratorio lab) {
        lista.add(lab);
    }
}
