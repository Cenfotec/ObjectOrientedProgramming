package org.bonilla.tl;

import org.bonilla.bl.Rectangulo;
import org.bonilla.dl.CapaLogica;

import java.util.ArrayList;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    public void registrarRectangulo(double base, double altura, String tipo) {
        Rectangulo rectangulo = new Rectangulo(base, altura, tipo);
        calcularArea(rectangulo);
        logica.registrarRectangulo(rectangulo);
    }

    public double calcularArea(Rectangulo rectangulo) {
        return rectangulo.calcularArea();
    }

    public String[] listarRectangulo() {
        ArrayList<Rectangulo> lista = logica.getListaRectangulo();
        String[] data = new String[lista.size()];
        for (Rectangulo r : lista) {
            r.calcularArea();
            data[lista.indexOf(r)] = r.toString();
        }
        return data;
    }
}
