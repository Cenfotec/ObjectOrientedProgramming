package org.bonilla.dl;

import org.bonilla.bl.Cuadrado;
import org.bonilla.bl.Figura;
import org.bonilla.bl.Rectangulo;
import org.bonilla.bl.Triangulo;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Rectangulo> listaRectangulo;
    private ArrayList<Cuadrado> listaCuadrado;
    private ArrayList<Triangulo> listaTriangulo;
    private ArrayList<Figura> listaFigura;

    public CapaLogica() {
        listaRectangulo = new ArrayList<>();
        listaCuadrado = new ArrayList<>();
        listaTriangulo = new ArrayList<>();
        listaFigura = new ArrayList<>();
    }

    public void registrarRectangulo(Rectangulo rectangulo) {
        listaRectangulo.add(rectangulo);
    }

    public void registrarCuadrado(Cuadrado cuadrado) { listaCuadrado.add(cuadrado); }

    public void registrarTraiangulo(Triangulo triangulo) { listaTriangulo.add(triangulo); }

    public void registrarFigura(Figura figura) { listaFigura.add(figura); }

    public ArrayList<Rectangulo> getListaRectangulo() {
        ArrayList<Rectangulo> lista = new ArrayList<>(listaRectangulo);
        return lista;
    }

    public ArrayList<Cuadrado> getListaCuadrado() {
        ArrayList<Cuadrado> lista = new ArrayList<>(listaCuadrado);
        return lista;
    }

    public ArrayList<Triangulo> getListaTriangulo() {
        ArrayList<Triangulo> lista = new ArrayList<>(listaTriangulo);
        return lista;
    }
}
