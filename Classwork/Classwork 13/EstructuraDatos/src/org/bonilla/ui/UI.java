package org.bonilla.ui;

import org.bonilla.bl.Libro;
import org.bonilla.bl.PilaLibros;

import java.io.PrintStream;

public class UI {
    static PrintStream out = System.out;

    public static void main(String[] args) {
        String nombre, autor, isbn;

        nombre = "Un libro";
        autor = "Un autor";
        isbn = "1010101010";

        PilaLibros pila = new PilaLibros(5);
        Libro libro = new Libro(nombre, autor, isbn);

        pila.agregar(libro);
    }
}
