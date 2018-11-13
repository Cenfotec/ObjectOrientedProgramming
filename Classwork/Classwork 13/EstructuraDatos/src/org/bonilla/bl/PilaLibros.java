package org.bonilla.bl;

import org.bonilla.dl.Apilable;

public class PilaLibros implements Apilable {
    private Libro[] libros;
    private int cabeza = -1;

    public PilaLibros() {
    }

    public PilaLibros(int size) {
        libros = new Libro[size];
    }

    @Override
    public void agregar(Object obj) {
        if (obj instanceof Libro) {
            Libro tmpObject = (Libro) obj;
            cabeza++;
            libros[cabeza] = tmpObject;
        }
    }

    @Override
    public Object extraer() {
        Object tmpObject;
        tmpObject = libros[cabeza];
        cabeza--;
        return tmpObject;
    }


}
