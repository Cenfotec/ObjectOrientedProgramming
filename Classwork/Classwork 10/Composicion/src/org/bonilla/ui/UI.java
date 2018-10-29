package org.bonilla.ui;

import org.bonilla.bl.Factura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        Factura factura = new Factura("1010101", "Pablo Bonilla", 29, 11, 1999);
        factura.agregarLinea(4, "123", "Agua", 2350);
        factura.agregarLinea(2, "456", "Snicker", 1200);
        factura.agregarLinea(1, "789", "M&M's", 650);
        out.print("Total: " + factura.calcularTotal() + "\n");
        out.print(factura.toString());
        //menuPrincipal();
    }

    public static void menuPrincipal() throws IOException {
        String opcion;
        boolean menu;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            menu = seleccionarOpcion(opcion);
        } while (menu);
    }

    public static String leerOpcion() throws IOException {
        out.println("----------------------------------------");
        out.print("Seleccione una opción: ");
        String opcion = br.readLine();
        return opcion;
    }

    public static void mostrarMenu() {
        out.println("\n----------------------------------------");
        out.println("1. Primera opción");
        out.println("2. Segunda opción");
        out.println("3. Detener la aplicación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
    }

    public static boolean seleccionarOpcion(String opcion) {
        boolean menu = true;

        if (opcion.equals("1")) {
            // Primera opción
        }

        if (opcion.equals("2")) {
            // Segunda opción
        }

        if (opcion.equals("3")) {
            detenerAplicacion();
        }

        return menu;
    }
}