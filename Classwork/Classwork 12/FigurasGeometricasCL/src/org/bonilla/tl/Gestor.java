package org.bonilla.tl;

import org.bonilla.bl.Cuadrado;
import org.bonilla.bl.Figura;
import org.bonilla.bl.Rectangulo;
import org.bonilla.bl.Triangulo;
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
        logica.registrarFigura(rectangulo);
    }

    public void registrarCuadrado(double lado, String tipo) {
        Cuadrado cuadrado = new Cuadrado(lado, tipo);
        calcularArea(cuadrado);
        logica.registrarCuadrado(cuadrado);
        logica.registrarFigura(cuadrado);
    }

    public void registrarTriangulo(double base, double altura, String tipo) {
        Triangulo triangulo = new Triangulo(base, altura, tipo);
        calcularArea(triangulo);
        logica.registrarTraiangulo(triangulo);
        logica.registrarFigura(triangulo);
    }

    public void calcularArea(Figura figura) { figura.calcularArea(); }

    public String[] listarRectangulo() {
        ArrayList<Rectangulo> lista = logica.getListaRectangulo();
        String[] data = new String[lista.size()];
        for (Rectangulo r : lista) {
            r.calcularArea();
            data[lista.indexOf(r)] = r.toString();
        }
        return data;
    }

    public String[] listarCuadrado() {
        ArrayList<Cuadrado> lista = logica.getListaCuadrado();
        String[] data = new String[lista.size()];
        for (Cuadrado r : lista) {
            r.calcularArea();
            data[lista.indexOf(r)] = r.toString();
        }
        return data;
    }

    public String[] listarTriangulo() {
        ArrayList<Triangulo> lista = logica.getListaTriangulo();
        String[] data = new String[lista.size()];
        for (Triangulo r : lista) {
            r.calcularArea();
            data[lista.indexOf(r)] = r.toString();
        }
        return data;
    }
}
