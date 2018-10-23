package org.bonilla.dl;

import org.bonilla.bl.Rectangulo;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Rectangulo> listaRectangulo;

    public CapaLogica() {
        listaRectangulo = new ArrayList<Rectangulo>();
    }

    public void registrarRectangulo(Rectangulo rectangulo) {
        listaRectangulo.add(rectangulo);
    }

    public ArrayList<Rectangulo> getListaRectangulo() {
        ArrayList<Rectangulo> lista = new ArrayList<>(listaRectangulo);
        return lista;
    }
}
