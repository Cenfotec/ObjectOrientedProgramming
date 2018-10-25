package org.bonilla.ui;

import org.bonilla.bl.Computadora;
import org.bonilla.bl.Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        Computadora computadora = new Computadora("1920", "Asus");
        Empleado empleado = new Empleado("Pablo", "123456789");
        computadora.setResponsable(empleado);

        out.print(computadora.toString());

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